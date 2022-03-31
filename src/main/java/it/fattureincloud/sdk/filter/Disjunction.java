package it.fattureincloud.sdk.filter;

import java.util.Objects;

public class Disjunction implements Expression {
    private Expression left;
    private Expression right;

    public Disjunction(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    public Expression getLeft() {
        return left;
    }

    public void setLeft(Expression left) {
        this.left = left;
    }

    public Expression getRight() {
        return right;
    }

    public void setRight(Expression right) {
        this.right = right;
    }

    @Override
    public String buildQuery() {
        return String.format("(%s or %s)", this.left.buildQuery(), this.right.buildQuery());
    }

    @Override
    public String toString() {
        return this.buildQuery();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Disjunction that = (Disjunction) o;
        return Objects.equals(left, that.left) && Objects.equals(right, that.right);
    }

    @Override
    public int hashCode() {
        return Objects.hash(left, right);
    }
}
