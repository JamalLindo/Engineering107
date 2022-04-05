package com.spartaglobal;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.time.LocalDate;
import java.util.stream.Stream;

public class ParameterizedTests {

    @ParameterizedTest(name = "[{index}] Testing for value = {arguments}")
    @ValueSource(ints = {2,0,13,12,34,1,7})
    void checkIfLessThanTen(int number){
        Assertions.assertTrue(number < 10);
    }

    @ParameterizedTest
    @NullAndEmptySource
    //@CsvSource({"Jamal","Noah"})
    @CsvFileSource(resources = "/names.csv")
    void CsvSourceTest(String name){
        Assertions.assertEquals(4, name.length());
    }

    @ParameterizedTest
    @MethodSource()
    void checkLengthOfString(int length, String word){
        Assertions.assertEquals(length, word.length());
    }

    public static Stream<Arguments> checkLengthOfString() {
        return Stream.of(
                Arguments.arguments(1,"a"),
                Arguments.arguments(3,"door"),
                Arguments.arguments(10,"house")
        );
    }

    @ParameterizedTest
    @MethodSource()
    void checkTheNameOfSpartan(Spartan spartan){
        Assertions.assertEquals("Java",spartan.getCourse());
    }

    public static Stream<Spartan> checkTheNameOfSpartan() {
        return Stream.of(
                new Spartan(1,"Jamal","Java", LocalDate.now()),
                new Spartan(2,"Noah","Data", LocalDate.now()),
                new Spartan(3,"Rsean","PHP", LocalDate.now()),
                new Spartan(4,"Uwais","C#", LocalDate.now())
        );
    }

}
