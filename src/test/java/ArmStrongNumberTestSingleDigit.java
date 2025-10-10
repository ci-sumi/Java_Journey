import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.ParameterizedTest.*;
import static org.junit.jupiter.params.provider.ValueSource.*;
class ArmStrongNumberTestSingleDigit {
    @ParameterizedTest
    @ValueSource(ints = {1,5,9})
    void singleArmstrongnumber(int number){
        boolean result = ArmStrongNumber.armstrong(number);
        assertTrue(result,number+" Shoul be Armstrongnumber");
    }
    @ParameterizedTest
    @ValueSource(ints={-2,-89})
    void  negativeArmstrongNumbers(int number){
        boolean result =ArmStrongNumber.armstrong(number);
        assertFalse(result,number+"should be a negative value");
    }


}