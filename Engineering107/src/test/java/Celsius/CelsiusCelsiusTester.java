package Celsius;
import com.spartaglobal.Celsius.Celsius;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CelsiusCelsiusTester {

    @Test
    @DisplayName("0 should return 32")
    void zeroShouldReturnThirtySix(){
        Assertions.assertEquals(32, Celsius.CelsiusToFahrenheit(0));

    }

    @Test
    @DisplayName("-1 should return 30.2 ")
    void minusOneShouldReturnThirtyPTwo(){
        Assertions.assertEquals(30.2, Celsius.CelsiusToFahrenheit(-1));

    }

    @Test
    @DisplayName("1 should return 33.8 ")
    void OneShouldReturnThirtyThreePEight(){
        Assertions.assertEquals(33.8, Celsius.CelsiusToFahrenheit(1));
    }


}
