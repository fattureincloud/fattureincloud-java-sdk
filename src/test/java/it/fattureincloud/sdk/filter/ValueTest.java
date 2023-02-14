package it.fattureincloud.sdk.filter;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/** Tests for Value */
public class ValueTest {
  @BeforeEach
  public void init() {}

  /** Tests for Value */
  @Test
  public void testValue() {
    Value<Boolean> valueBool = new Value<>(true);
    assertEquals(true, valueBool.getValue());
    assertEquals("true", valueBool.printValue());

    valueBool.setValue(false);
    assertEquals(false, valueBool.getValue());
    assertEquals("false", valueBool.printValue());

    Value<Integer> valueInt = new Value<>(22);
    assertEquals(22, valueInt.getValue());
    assertEquals("22", valueInt.printValue());

    valueInt.setValue(88);
    assertEquals(88, valueInt.getValue());
    assertEquals("88", valueInt.printValue());

    Value<Float> valueFloat = new Value<>(22.02f);
    assertEquals(22.02f, valueFloat.getValue());
    assertEquals("22.02", valueFloat.printValue());

    valueFloat.setValue(19.88f);
    assertEquals(19.88f, valueFloat.getValue());
    assertEquals("19.88", valueFloat.printValue());

    Value<Double> valueDouble = new Value<>(22.02);
    assertEquals(22.02, valueDouble.getValue());
    assertEquals("22.02", valueDouble.printValue());

    valueDouble.setValue(19.88);
    assertEquals(19.88, valueDouble.getValue());
    assertEquals("19.88", valueDouble.printValue());

    Value<String> valueStr = new Value<>("Paoletta");
    assertEquals("Paoletta", valueStr.getValue());
    assertEquals("'Paoletta'", valueStr.printValue());

    valueStr.setValue("Dalmine");
    assertEquals("Dalmine", valueStr.getValue());
    assertEquals("'Dalmine'", valueStr.printValue());
  }
}
