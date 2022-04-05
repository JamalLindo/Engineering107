package com.spartaglobal;

import org.junit.jupiter.api.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.assertEquals;


import java.time.LocalDate;

public class HamcrestTest {
    private Spartan Jamal;

    @BeforeEach
    void setup(TestInfo testInfo){
        System.out.println(testInfo.getDisplayName() + " is running");
        Jamal = new Spartan(1, "Jamal", "Java", LocalDate.of(2022,04,04));
    }

    @Test
    @DisplayName("Testing with Hamcrest")
    void testingWithHamcrest() {
        assertThat(Jamal.getName(),isEmptyOrNullString());
    }

    @Test
    @DisplayName("Check that spartan has a property called name")
    void checkThatSpartanHasAPropertyCalledName() {
        assertThat(Jamal,hasProperty("name",equalTo("Jamal")));
    }

}
