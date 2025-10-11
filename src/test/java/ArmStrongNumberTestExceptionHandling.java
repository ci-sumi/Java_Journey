import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Test.*;

class ArmStrongNumberTestExceptionHandling {
    @Test
    void testExceptionArmstrong(){
        assertThrows(IllegalAccessError.class,()->{
            ArmStrongNumber.armstrong(-153);
        });
    }

}