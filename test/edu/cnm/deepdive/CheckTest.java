package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Array;
import org.junit.jupiter.api.Test;

class CheckTest {

  static final int[] INPUTS = {4046, 6325, 9788, 5676, 88,
      8925, 8598, 2025, 4738, 453};
  static final int[] EXPECTED = {14, 16, 32, 24, 16,
      24, 30, 9, 22, 12};

  @Test
  void digitSum() {
    for (int i = 0; i < INPUTS.length; i++) {
      int input = INPUTS[i];
      int expected = EXPECTED[i];
      int actual = Check.digitSum(input);

      assertEquals(expected, actual);
    }
  }
}