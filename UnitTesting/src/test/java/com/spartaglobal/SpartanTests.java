package com.spartaglobal;
import org.junit.jupiter.api.*;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class SpartanTests {
    private Spartan Jamal;

    @BeforeAll
    static void setupAll(TestInfo testInfo){
        System.out.println(testInfo.getDisplayName() + " has started");
    }

    @BeforeEach
    void setup(TestInfo testInfo){
        System.out.println(testInfo.getDisplayName());
        Jamal = new Spartan(1, "Jamal", "Java", LocalDate.of(2022,04,04));
    }

    @Nested
    @DisplayName("Id Test")
    class idTest{
        @Test
        @DisplayName("Id is an integer")
        void idIsInt(){
            assertTrue(Jamal.getId() == (int)Jamal.getId());
        }

        @Test
        @DisplayName("Id above 0")
        void idPositive() {
            assertTrue(Jamal.getId() > 0);
        }


    }

    @Nested
    @DisplayName("Name Test")
    class nameTest{
        @Test
        @DisplayName("Check if Jamal(Object) has name Jamal")
        void JamalTest() {
            assertEquals("Jamal",Jamal.getName());
        }

        @Test
        @DisplayName("Check if Jamal(Object) is not Empty")
        void isEmptyTest() {
            assertNotNull(Jamal.getName());
        }

        @Test
        @DisplayName("Name does not contain special characters")
        void nameContainsNoSpecialCharacters(){
            assertFalse(Jamal.getName().matches("[$&+,:;=?@#|'<>.-^*()%!]"));
        }

        @Test
        @DisplayName("Name does not contain no numbers")
        void nameContainsNumbers(){
            assertFalse(Jamal.getName().matches("0123456789"));
        }

        @Test
        @DisplayName("Name does not contain any spaces")
        void nameContainsNoSpaces(){
            assertFalse(Jamal.getName().matches(" "));
        }

    }

    @Nested
    @DisplayName("CourseTest")
    class courseTest{
        @Test
        @DisplayName("Check if Course is not Empty")
        void isCEmptyTest() {
            assertTrue(Jamal.getCourse() != null);
        }

        @Test
        @DisplayName("Course does not contain special characters")
        void courseContainsNoSpecialCharacters(){
            assertFalse(Jamal.getCourse().matches("[$&+,:;=?@#|'<>.-^*()%!]"));
        }
        @Test
        @DisplayName("Course does not contain any spaces")
        void courseContainsNoSpaces(){
            assertFalse(Jamal.getCourse().matches(" "));
        }

        @Test
        @DisplayName("Course matches available courses")
        void courseIsValid(){
            assertTrue(Jamal.getCourse().contains("Java")||
                    Jamal.getCourse().contains("C#") ||
                    Jamal.getCourse().contains("Python") ||
                    Jamal.getCourse().contains("C++"));
        }

    }

    @Nested
    @DisplayName("Date Tests")
    class DateTests{
        @Tag("DateTest")
        @Test
        @DisplayName("Check if start date is today")
        void checkIfStartDateIsToday() {
            Assertions.assertEquals(LocalDate.now(),Jamal.getStartDate());
        }

    }


    @AfterAll
    static void tearDownAll(TestInfo testInfo){
            System.out.println(testInfo.getDisplayName() + " has finished");
    }

}
