package it.fattureincloud.sdk.filter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Tests for Conjunction
 */
public class ConjunctionTest {
    @BeforeEach
    public void init() {
    }

    /**
     * Tests for Conjunction
     */
    @Test
    public void testConjunction() {
        Expression left = new Condition<>("city", Operator.EQ, "Bergamo");
        Expression right = new Condition<>("age", Operator.LT, 35);
        Conjunction c = new Conjunction(left, right);
        assertEquals(left, c.getLeft());
        assertEquals(right, c.getRight());
        assertEquals("(city = 'Bergamo' and age < 35)", c.buildQuery());
        assertEquals("(city = 'Bergamo' and age < 35)", c.toString());

        Expression left1 = new Condition<>("team", Operator.EQ, "Volley Bergamo 1991");
        c.setLeft(left1);
        assertEquals(left1, c.getLeft());
        assertEquals("(team = 'Volley Bergamo 1991' and age < 35)", c.buildQuery());
        assertEquals("(team = 'Volley Bergamo 1991' and age < 35)", c.toString());

        Expression right1 = new Condition<>("best_player", Operator.IS_NOT, null);
        c.setRight(right1);
        assertEquals(right1, c.getRight());
        assertEquals("(team = 'Volley Bergamo 1991' and best_player is not null)", c.buildQuery());
        assertEquals("(team = 'Volley Bergamo 1991' and best_player is not null)", c.toString());
    }
}
