
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.provider.ValueSource;


class ArmStrongNumberParamerizedTest {
    @ParameterizedTest
    @ValueSource(ints = {0,1,153,370,371,407,9474})
    void testArmstrongNumbers(int number){
        assertTrue(ArmStrongNumber.armstrong(number),
                number +"should be an ArmStrongNumber");
    }
    @ParameterizedTest
    @ValueSource(ints = {10,100,123,200,500})
    void testNonArmstrongNumbers(int number){
        assertFalse(ArmStrongNumber.armstrong(number),
                number+"should not be an armstrongnumber");
    }


}