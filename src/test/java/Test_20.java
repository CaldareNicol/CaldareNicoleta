import com.itstep.lesson._17.divideWithZeroException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class Test_20 {

    public static double multiply(double firstNumber, double secondNumber) {
        if (firstNumber > 0 && firstNumber < 100 && secondNumber > 0 && secondNumber < 100) {
            return firstNumber * secondNumber;
        }
        return 0;
    }


    public int subtract(int firstNumber, int secondNumber) {
        if (secondNumber >= 0 && firstNumber > secondNumber) {
            return firstNumber - secondNumber;
        }
        return -1;
    }

    public double divide(double numberToBeDivided, double divisor) throws divideWithZeroException {
        if (divisor > 0 && numberToBeDivided > divisor) {
            return numberToBeDivided / divisor;
        }
        if (divisor == 0)
            throw new divideWithZeroException();
        return 0;

    }

    //TEST FOR MULTIPLY

    @Test
    @DisplayName("Happy path for multiply of numbers")
    public void positiveTestMultipleNumbers() {
        double multipleNum = multiply(12, 34);
        Assertions.assertEquals(408, multipleNum);
    }

    @ParameterizedTest
    @DisplayName("Negative case for multiply of numbers")
    @CsvSource(value = {"29,129", "-4,33", "14,-3", "144,33"})
    public void caseNegativeForMultipleNumber(int num1, int num2) {
        Assertions.assertEquals(0, multiply(num1, num2));


    }

    // TEST FOR SUBTRACT
    @Test
    @DisplayName("Happy path for subtract of numbers")
    public void positiveTestSubtractNum() {
        double subtractNum = subtract(44, 22);
        Assertions.assertEquals(22, subtractNum);
    }

    @ParameterizedTest
    @DisplayName("Negative case for subtract of numbers")
    @CsvSource(value = {"6,29", "0,0", "88,-4", "-4,7",})
    public void negativeTestSubtractNumber(int num1, int num2) {
        Assertions.assertEquals(-1, subtract(num1, num2));
    }

    //TEST FOR DIVIDE
    @Test
    @DisplayName("Happy path for divide of numbers.")
    public void positiveTestDivideNumbers() throws divideWithZeroException {
        double divideNum = divide(50, 10);
        Assertions.assertEquals(5, divideNum);
    }

    @ParameterizedTest
    @DisplayName("Negative case for divide of numbers")
    @CsvSource(value = {"-2, 10", "10, 40","20, -5"})
    public void negativeTestDivideNumber(int num1, int num2) {
        Assertions.assertEquals(0, divide(num1, num2));
    }

    @Test
    public void throwExceptionTest() throws divideWithZeroException {
        Assertions.assertThrows(divideWithZeroException.class, () -> divide(5, 0));
    }
}
