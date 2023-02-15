package it.fattureincloud.sdk.filter;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Optional;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/** Tests for Filter */
public class FilterTest {
  @BeforeEach
  public void init() {}

  /** Tests for Filter */
  @Test
  public void testFilter() {
    Filter f = new Filter();
    assertEquals(Optional.empty(), f.getExpression());

    Expression e = new Condition<>("nation", Operator.EQ, "IT");
    f = new Filter(e);
    assertEquals(Optional.of(e), f.getExpression());

    Expression e1 = new Condition<>("company", Operator.EQ, "MadBit Entertainment S.r.l.");
    f.setExpression(e1);
    assertEquals(Optional.of(e1), f.getExpression());
  }

  /** Tests for Where */
  @Test
  public void testWhere() {
    Filter f = new Filter();
    assertEquals(Optional.empty(), f.getExpression());

    Expression e = new Condition<>("nation", Operator.EQ, "IT");
    f.where("nation", Operator.EQ, "IT");
    assertEquals(Optional.of(e), f.getExpression());

    Expression e1 = new Condition<>("company", Operator.EQ, "MadBit Entertainment S.r.l.");
    f.where("company", Operator.EQ, "MadBit Entertainment S.r.l.");
    assertEquals(Optional.of(e1), f.getExpression());
  }

  /** Tests for WhereExpression */
  @Test
  public void testWhereExpression() {
    Filter f = new Filter();
    assertEquals(Optional.empty(), f.getExpression());

    Expression e = new Condition<>("nation", Operator.EQ, "IT");
    f.whereExpression(e);
    assertEquals(Optional.of(e), f.getExpression());

    Expression e1 = new Condition<>("company", Operator.EQ, "MadBit Entertainment S.r.l.");
    f.whereExpression(e1);
    assertEquals(Optional.of(e1), f.getExpression());
  }

  /** Tests for And */
  @Test
  public void testAnd() throws Exception {
    Filter f = new Filter();
    assertEquals(Optional.empty(), f.getExpression());

    Expression c1 = new Condition<>("city", Operator.EQ, "Warsaw");
    Expression c2 = new Condition<>("company", Operator.EQ, "Przewodniczka Social Media");
    Conjunction conj = new Conjunction(c1, c2);

    Exception thrown =
        Assertions.assertThrows(
            Exception.class,
            () -> {
              f.and("company", Operator.EQ, "Reply");
            });

    Assertions.assertEquals(
        "Cannot create a conjunction for an empty expression.", thrown.getMessage());

    f.where("city", Operator.EQ, "Warsaw")
        .and("company", Operator.EQ, "Przewodniczka Social Media");

    assertEquals(Optional.of(conj), f.getExpression());
  }

  /** Tests for AndExpression */
  @Test
  public void testAndExpression() throws Exception {
    Filter f = new Filter();
    assertEquals(Optional.empty(), f.getExpression());

    Expression c1 = new Condition<>("city", Operator.EQ, "Warsaw");
    Expression c2 = new Condition<>("company", Operator.EQ, "Przewodniczka Social Media");
    Conjunction conj = new Conjunction(c1, c2);

    Exception thrownLeft =
        Assertions.assertThrows(
            Exception.class,
            () -> {
              f.andExpression(c2);
            });

    Assertions.assertEquals(
        "Cannot create a conjunction for an empty expression.", thrownLeft.getMessage());

    Exception thrownRight =
        Assertions.assertThrows(
            Exception.class,
            () -> {
              f.whereExpression(c1).andExpression(null);
            });

    Assertions.assertEquals(
        "Cannot create a conjunction for an empty expression.", thrownRight.getMessage());

    f.whereExpression(c1).andExpression(c2);

    assertEquals(Optional.of(conj), f.getExpression());
  }

  /** Tests for AndFilter */
  @Test
  public void testAndFilter() throws Exception {
    Filter f = new Filter();
    assertEquals(Optional.empty(), f.getExpression());

    Expression c1 = new Condition<>("city", Operator.EQ, "Warsaw");
    Expression c2 = new Condition<>("company", Operator.EQ, "Przewodniczka Social Media");
    Conjunction conj = new Conjunction(c1, c2);

    Exception thrownLeft =
        Assertions.assertThrows(
            Exception.class,
            () -> {
              f.andFilter(new Filter(c2));
            });

    Assertions.assertEquals(
        "Cannot create a conjunction for an empty expression.", thrownLeft.getMessage());

    Exception thrownRight =
        Assertions.assertThrows(
            Exception.class,
            () -> {
              f.whereExpression(c1).andFilter(new Filter());
            });

    Assertions.assertEquals(
        "Cannot create a conjunction for an empty expression.", thrownRight.getMessage());

    Exception thrownNull =
        Assertions.assertThrows(
            Exception.class,
            () -> {
              f.whereExpression(c1).andFilter(null);
            });

    Assertions.assertEquals(
        "Cannot create a conjunction for an empty expression.", thrownNull.getMessage());

    f.whereExpression(c1).andFilter(new Filter(c2));

    assertEquals(Optional.of(conj), f.getExpression());
  }

  /** Tests for Or */
  @Test
  public void testOr() throws Exception {
    Filter f = new Filter();
    assertEquals(Optional.empty(), f.getExpression());

    Expression c1 = new Condition<>("city", Operator.EQ, "Warsaw");
    Expression c2 = new Condition<>("company", Operator.EQ, "Przewodniczka Social Media");
    Disjunction disj = new Disjunction(c1, c2);

    Exception thrown =
        Assertions.assertThrows(
            Exception.class,
            () -> {
              f.or("company", Operator.EQ, "Reply");
            });

    Assertions.assertEquals(
        "Cannot create a disjunction for an empty expression.", thrown.getMessage());

    f.where("city", Operator.EQ, "Warsaw").or("company", Operator.EQ, "Przewodniczka Social Media");

    assertEquals(Optional.of(disj), f.getExpression());
  }

  /** Tests for OrExpression */
  @Test
  public void testOrExpression() throws Exception {
    Filter f = new Filter();
    assertEquals(Optional.empty(), f.getExpression());

    Expression c1 = new Condition<>("city", Operator.EQ, "Warsaw");
    Expression c2 = new Condition<>("company", Operator.EQ, "Przewodniczka Social Media");
    Disjunction disj = new Disjunction(c1, c2);

    Exception thrownLeft =
        Assertions.assertThrows(
            Exception.class,
            () -> {
              f.orExpression(c2);
            });

    Assertions.assertEquals(
        "Cannot create a disjunction for an empty expression.", thrownLeft.getMessage());

    Exception thrownRight =
        Assertions.assertThrows(
            Exception.class,
            () -> {
              f.whereExpression(c1).orExpression(null);
            });

    Assertions.assertEquals(
        "Cannot create a disjunction for an empty expression.", thrownRight.getMessage());

    f.whereExpression(c1).orExpression(c2);

    assertEquals(Optional.of(disj), f.getExpression());
  }

  /** Tests for OrFilter */
  @Test
  public void testOrFilter() throws Exception {
    Filter f = new Filter();
    assertEquals(Optional.empty(), f.getExpression());

    Expression c1 = new Condition<>("city", Operator.EQ, "Warsaw");
    Expression c2 = new Condition<>("company", Operator.EQ, "Przewodniczka Social Media");
    Disjunction conj = new Disjunction(c1, c2);

    Exception thrownLeft =
        Assertions.assertThrows(
            Exception.class,
            () -> {
              f.orFilter(new Filter(c2));
            });

    Assertions.assertEquals(
        "Cannot create a disjunction for an empty expression.", thrownLeft.getMessage());

    Exception thrownRight =
        Assertions.assertThrows(
            Exception.class,
            () -> {
              f.whereExpression(c1).orFilter(new Filter());
            });

    Assertions.assertEquals(
        "Cannot create a disjunction for an empty expression.", thrownRight.getMessage());

    Exception thrownNull =
        Assertions.assertThrows(
            Exception.class,
            () -> {
              f.whereExpression(c1).orFilter(null);
            });

    Assertions.assertEquals(
        "Cannot create a disjunction for an empty expression.", thrownNull.getMessage());

    f.whereExpression(c1).orFilter(new Filter(c2));

    assertEquals(Optional.of(conj), f.getExpression());
  }

  /** Tests for BuildQuery */
  @Test
  public void testBuildQuery() throws Exception {
    Filter f = new Filter();
    assertEquals("", f.buildQuery());
    f = new Filter(new Condition<>("company", Operator.EQ, "Przewodniczka Social Media"));
    assertEquals("company = 'Przewodniczka Social Media'", f.buildQuery());
  }

  /** Tests for BuildUrlEncodedQuery */
  @Test
  public void testBuildUrlEncodedQuery() throws Exception {
    Filter f = new Filter(new Condition<>("company", Operator.EQ, "Przewodniczka Social Media"));
    assertEquals("company+%3D+%27Przewodniczka+Social+Media%27", f.buildUrlEncodedQuery());
  }

  /** Tests for ToString */
  @Test
  public void testToString() {
    Filter f = new Filter();
    assertEquals("", f.toString());
    f = new Filter(new Condition<>("company", Operator.EQ, "Przewodniczka Social Media"));
    assertEquals("company = 'Przewodniczka Social Media'", f.toString());
  }
}
