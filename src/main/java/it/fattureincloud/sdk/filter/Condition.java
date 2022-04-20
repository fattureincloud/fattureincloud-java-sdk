package it.fattureincloud.sdk.filter;

import java.util.Objects;
import java.util.Optional;

public class Condition<T> implements Expression {
  private String field;
  private Operator op;
  private Value<T> value;

  public Condition(String field, Operator op, T value) {
    this.field = field;
    this.op = op;
    if (value == null) {
      this.value = null;
    } else {
      this.value = new Value<>(value);
    }
  }

  public String getField() {
    return field;
  }

  public void setField(String field) {
    this.field = field;
  }

  public Operator getOp() {
    return op;
  }

  public void setOp(Operator op) {
    this.op = op;
  }

  public Optional<Value<T>> getValue() {
    if (value == null) {
      return Optional.empty();
    } else {
      return Optional.of(value);
    }
  }

  public void setValue(Value<T> value) {
    this.value = value;
  }

  public void setValue(T value) {
    if (value == null) {
      this.value = null;
    } else {
      this.value = new Value<>(value);
    }
  }

  @Override
  public String buildQuery() {
    return String.format("%s %s %s", field, op.getSymbol(), this.printValue());
  }

  private String printValue() {
    if (this.value == null) {
      return "null";
    }
    return this.value.printValue();
  }

  @Override
  public String toString() {
    return this.buildQuery();
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Condition<?> condition = (Condition<?>) o;
    return Objects.equals(field, condition.field)
        && op == condition.op
        && Objects.equals(value, condition.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, op, value);
  }
}
