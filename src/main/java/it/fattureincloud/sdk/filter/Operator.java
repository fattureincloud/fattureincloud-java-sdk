package it.fattureincloud.sdk.filter;

public enum Operator {
  EQ("="),
  GT(">"),
  GTE(">="),
  LT("<"),
  LTE("<="),
  NEQ("<>"),
  IS("is"),
  IS_NOT("is not"),
  LIKE("like"),
  CONTAINS("contains"),
  STARTS_WITH("starts with"),
  ENDS_WITH("ends with");

  private final String symbol;

  Operator(String symbol) {
    this.symbol = symbol;
  }

  public String getSymbol() {
    return symbol;
  }
}
