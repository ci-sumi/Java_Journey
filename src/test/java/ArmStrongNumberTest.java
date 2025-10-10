import  org.junit.jupiter.api.Test;
//Import Test annotation from Junit
import static org.junit.jupiter.api.Assertions.*;
//It contains all the assertion methods

class ArmStrongNumberTest {
    @Test
    void testArmStrongNumber_153_shouldReturnTrue(){
        boolean result = ArmStrongNumber.armstrong(153);
        assertTrue(result,"153 should be an ArmtrongNumber");
    }
    @Test
    void testArmStrongNumber_370_shouldReturnTrue(){
        boolean result = ArmStrongNumber.armstrong(370);
        assertTrue(result,"370 should be an ArmstrongNumber");
    }
    @Test
    void testArmStrongNumber_9474_shouldReturnTrue(){
        boolean result = ArmStrongNumber.armstrong(9474);
        assertTrue(result,"9474 should be an ArmstrongNumber");
    }
    @Test
    void  testArmStrongNumber_NotArmStrong_shouldReturnFalse(){
        boolean result = ArmStrongNumber.armstrong(123);
        assertFalse(result,"123 should not be a Armstrong NUmber");
    }

}