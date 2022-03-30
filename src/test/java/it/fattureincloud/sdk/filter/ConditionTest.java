package it.fattureincloud.sdk.filter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Tests for Condition
 */
public class ConditionTest {
    @BeforeEach
    public void init() {
    }

    /**
     * Tests for Condition
     */
    @Test
    public void testCondition() {
        Condition<Boolean> cBool = new Condition<>("qualified", Operator.EQ, true);
        assertEquals("qualified", cBool.getField());
        assertEquals(Operator.EQ, cBool.getOp());
        assertEquals(Optional.of(new Value<>(true)), cBool.getValue());
        assertEquals("qualified = true", cBool.buildQuery());
        assertEquals("qualified = true", cBool.toString());

        cBool.setField("phd");
        cBool.setOp(Operator.NEQ);
        assertEquals("phd", cBool.getField());
        assertEquals(Operator.NEQ, cBool.getOp());

        cBool.setValue(false);
        assertEquals(Optional.of(new Value<>(false)), cBool.getValue());
        cBool.setValue(new Value<>(true));
        assertEquals(Optional.of(new Value<>(true)), cBool.getValue());

        Condition<Integer> cInt = new Condition<>("ranking", Operator.GT, 10);
        assertEquals(Optional.of(new Value<>(10)), cInt.getValue());
        assertEquals("ranking > 10", cInt.buildQuery());
        assertEquals("ranking > 10", cInt.toString());

        cInt.setValue(6);
        assertEquals(Optional.of(new Value<>(6)), cInt.getValue());
        cInt.setValue(new Value<>(99));
        assertEquals(Optional.of(new Value<>(99)), cInt.getValue());

        Condition<Float> cFloat = new Condition<>("price", Operator.LTE, 10.12f);
        assertEquals(Optional.of(new Value<>(10.12f)), cFloat.getValue());
        assertEquals("price <= 10.12", cFloat.buildQuery());
        assertEquals("price <= 10.12", cFloat.toString());

        cFloat.setValue(6.66f);
        assertEquals(Optional.of(new Value<>(6.66f)), cFloat.getValue());
        cFloat.setValue(new Value<>(69f));
        assertEquals(Optional.of(new Value<>(69f)), cFloat.getValue());

        Condition<Double> cDouble = new Condition<>("price", Operator.LTE, 10.12);
        assertEquals(Optional.of(new Value<>(10.12)), cDouble.getValue());
        assertEquals("price <= 10.12", cDouble.buildQuery());
        assertEquals("price <= 10.12", cDouble.toString());

        cDouble.setValue(6.66);
        assertEquals(Optional.of(new Value<>(6.66)), cDouble.getValue());
        cDouble.setValue(new Value<>(69d));
        assertEquals(Optional.of(new Value<>(69d)), cDouble.getValue());

        Condition<String> cString = new Condition<>("sweet", Operator.ENDS_WITH, "cioccolato");
        assertEquals(Optional.of(new Value<>("cioccolato")), cString.getValue());
        assertEquals("sweet ends with 'cioccolato'", cString.buildQuery());
        assertEquals("sweet ends with 'cioccolato'", cString.toString());

        cString.setValue("fragole");
        assertEquals(Optional.of(new Value<>("fragole")), cString.getValue());
        cString.setValue(new Value<>("panna"));
        assertEquals(Optional.of(new Value<>("panna")), cString.getValue());

        Condition cNull = new Condition<>("girlfriend", Operator.IS_NOT, null);
        assertEquals(Optional.empty(), cNull.getValue());
        assertEquals("girlfriend is not null", cNull.buildQuery());
        assertEquals("girlfriend is not null", cNull.toString());
    }
}

