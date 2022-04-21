package it.fattureincloud.sdk.filter;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Objects;
import java.util.Optional;

public class Filter {
  private Expression expression;

  public Filter() {
    this.expression = null;
  }

  public Filter(Expression expression) {
    this.expression = expression;
  }

  public Optional<Expression> getExpression() {
    return Optional.ofNullable(expression);
  }

  public void setExpression(Expression expression) {
    this.expression = expression;
  }

  public <T> Filter where(String field, Operator op, T value) {
    this.expression = new Condition<>(field, op, value);
    return this;
  }

  public Filter whereExpression(Expression expression) {
    this.expression = expression;
    return this;
  }

  public <T> Filter and(String field, Operator op, T value) throws Exception {
    if (this.expression == null) {
      throw new Exception("Cannot create a conjunction for an empty expression.");
    }
    Expression left = this.expression;
    Expression right = new Condition<>(field, op, value);
    this.expression = new Conjunction(left, right);
    return this;
  }

  public Filter andExpression(Expression expression) throws Exception {
    if (this.expression == null || expression == null) {
      throw new Exception("Cannot create a conjunction for an empty expression.");
    }
    Expression left = this.expression;
    this.expression = new Conjunction(left, expression);
    return this;
  }

  public Filter andFilter(Filter filter) throws Exception {
    if (this.expression == null || filter == null || !filter.getExpression().isPresent()) {
      throw new Exception("Cannot create a conjunction for an empty expression.");
    }
    Expression left = this.expression;
    this.expression = new Conjunction(left, filter.getExpression().get());
    return this;
  }

  public <T> Filter or(String field, Operator op, T value) throws Exception {
    if (this.expression == null) {
      throw new Exception("Cannot create a disjunction for an empty expression.");
    }
    Expression left = this.expression;
    Expression right = new Condition<>(field, op, value);
    this.expression = new Disjunction(left, right);
    return this;
  }

  public Filter orExpression(Expression expression) throws Exception {
    if (this.expression == null || expression == null) {
      throw new Exception("Cannot create a disjunction for an empty expression.");
    }
    Expression left = this.expression;
    this.expression = new Disjunction(left, expression);
    return this;
  }

  public Filter orFilter(Filter filter) throws Exception {
    if (this.expression == null || filter == null || !filter.getExpression().isPresent()) {
      throw new Exception("Cannot create a disjunction for an empty expression.");
    }
    Expression left = this.expression;
    this.expression = new Disjunction(left, filter.getExpression().get());
    return this;
  }

  public String buildQuery() {
    if (this.expression == null) {
      return "";
    } else {
      return this.expression.buildQuery();
    }
  }

  public String buildUrlEncodedQuery() throws UnsupportedEncodingException {
    return URLEncoder.encode(this.buildQuery(), StandardCharsets.UTF_8.toString());
  }

  @Override
  public String toString() {
    return this.buildQuery();
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Filter filter = (Filter) o;
    return Objects.equals(expression, filter.expression);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expression);
  }
}
