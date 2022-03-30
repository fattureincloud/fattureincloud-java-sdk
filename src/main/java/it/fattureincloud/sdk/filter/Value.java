package it.fattureincloud.sdk.filter;

import java.util.Objects;

public class Value<T> {
    private T value;

    Value(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    protected String printValue() {
        if (value instanceof String) {
            return String.format("'%s'", value);
        }
        return value.toString();
    }

    @Override
    public String toString() {
        return this.printValue();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Value<?> value1 = (Value<?>) o;
        return Objects.equals(value, value1.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
