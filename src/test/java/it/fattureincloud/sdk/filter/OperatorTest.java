package it.fattureincloud.sdk.filter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Tests for Operator
 */
public class OperatorTest {
    @BeforeEach
    public void init() {
    }

    /**
     * Tests for Operator
     */
    @Test
    public void testOperator() {
        Operator eq = Operator.EQ;
        assertEquals("=", eq.getSymbol());

        Operator neq = Operator.NEQ;
        assertEquals("<>", neq.getSymbol());

        Operator gt = Operator.GT;
        assertEquals(">", gt.getSymbol());

        Operator gte = Operator.GTE;
        assertEquals(">=", gte.getSymbol());

        Operator lt = Operator.LT;
        assertEquals("<", lt.getSymbol());

        Operator lte = Operator.LTE;
        assertEquals("<=", lte.getSymbol());

        Operator is = Operator.IS;
        assertEquals("is", is.getSymbol());

        Operator isNot = Operator.IS_NOT;
        assertEquals("is not", isNot.getSymbol());

        Operator like = Operator.LIKE;
        assertEquals("like", like.getSymbol());

        Operator contains = Operator.CONTAINS;
        assertEquals("contains", contains.getSymbol());

        Operator notLike = Operator.NOT_LIKE;
        assertEquals("not like", notLike.getSymbol());

        Operator notContains = Operator.NOT_CONTAINS;
        assertEquals("not contains", notContains.getSymbol());

        Operator startsWith = Operator.STARTS_WITH;
        assertEquals("starts with", startsWith.getSymbol());

        Operator endsWith = Operator.ENDS_WITH;
        assertEquals("ends with", endsWith.getSymbol());
    }
}

