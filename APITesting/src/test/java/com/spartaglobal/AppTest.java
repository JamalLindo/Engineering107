package com.spartaglobal;

import org.junit.jupiter.api.*;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URL;


public class AppTest {
    ObjectMapper mapper = new ObjectMapper();
    AgeResponse responseJamal;
    {
        try {
            responseJamal = mapper.readValue(new URL("https://api.agify.io?name=Jamal&country_id=US"), AgeResponse.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @BeforeAll
    static void setupAll(TestInfo testInfo){
        System.out.println(testInfo.getDisplayName() + " has started");
    }

    @BeforeEach
    void setup(TestInfo testInfo){
        System.out.println(testInfo.getDisplayName() + " has started");
    }

    @Nested
    @DisplayName("Name Tests")
    class nameTest{
        @Test
        @DisplayName("Check if Name is a String ")
        void checkIfIsAString() {
            Assertions.assertTrue(responseJamal.getName().getClass().equals(String.class));
        }
        @Test
        @DisplayName("Check If Name is Empty")
        void checkIfNameIsEmpty() {
            Assertions.assertFalse(responseJamal.getName().isEmpty());
        }

        @Test
        @DisplayName("Check if Name is not null")
        void checkIsNameIsNotNull() {
            Assertions.assertTrue(responseJamal.getName() != null);
        }

        @Test
        @DisplayName("Check if Contains specials Characters")
        void checkIfContainsSpecialsCharacters() {
            Assertions.assertFalse(responseJamal.getName().contains("[$&+,:;=?@#|'<>.-^*()%!]"));
        }

    }

    @Nested
    @DisplayName("Age Test")
    class ageTest{

        @Test
        @DisplayName("Age is an Int")
        void ageIsAnInt() {
            Assertions.assertTrue(responseJamal.getAge().getClass().equals(Integer.class));
        }

        @Test
        @DisplayName("Age is not Null")
        void ageIsNotNull() {
            Assertions.assertTrue(responseJamal.getAge() != null);
        }

        @Test
        @DisplayName("Age is Above 0 ")
        void ageIsAbove0() {
            Assertions.assertTrue(responseJamal.getAge() >= 0);
        }

        @Test
        @DisplayName("Age is Not above max of 99")
        void ageIsNotAboveMaxOf99() {
            Assertions.assertTrue(responseJamal.getAge() < 99);
        }
    }

    @Nested
    @DisplayName("Country Tests")
    class countryTests{
        @Test
        @DisplayName("Test If Country is not null")
        void testIfCountryIsNotNull() {
            Assertions.assertTrue(responseJamal.getCountryId() != null);
        }

        @Test
        @DisplayName("Test If country is 2 characters Long")
        void testIfCountryIs2CharactersLong() {
            Assertions.assertTrue(responseJamal.getCountryId().length() == 2);
        }
    }


}
