package com.spartaglobal;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;
import java.util.Arrays;

public class ExceptionTesting {

    private ArrayList<Integer> numbers;

    @BeforeEach
    void setup(){
        numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5));
    }

    @ParameterizedTest
    @ValueSource(ints = {1,2,5,7,10})
    void checkForOutofBoundsException(int number){
        Executable executable = () -> numbers.get(number);
        Assertions.assertDoesNotThrow(executable, "Exception Thrown");
    }
}
