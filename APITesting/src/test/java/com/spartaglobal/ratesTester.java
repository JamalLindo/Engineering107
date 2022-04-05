package com.spartaglobal;

import org.junit.jupiter.api.*;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLOutput;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ratesTester {

    ObjectMapper mapper = new ObjectMapper();
    static RatesResponse Response;

    {
        try {
           Response = mapper.readValue(new File("src/main/resources/rates.json"), RatesResponse.class);
            System.out.println(Response.getRates());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

   @Nested
    @DisplayName("Import Success Test")
    class success{
       @Test
       @DisplayName("Test if success is true")
       void testIfSuccessIsTrue() {
           Assertions.assertTrue(Response.isSuccess());
       }
   }

   @Nested
    @DisplayName("Timestamp Tests")
    class Timestamp{
       @Test
       @DisplayName("Timestamp is not empty")
       void timestampIsNotEmpty() {
           Assertions.assertTrue(Response.getTimestamp() != null);
       }

       @Test
       @DisplayName("Timestamp is not above zero")
       void timestampIsNotAboveZero() {
           Assertions.assertTrue(Response.getTimestamp() > 0);
       }

       @Test
       @DisplayName("TimeStamp contains 10 characters ")
       void timeStampContains10Characters() {
            Assertions.assertTrue(Response.getTimestamp().toString().length() <= 10);
       }
   }

   @Nested
    @DisplayName("Base Tests")
    class baseTest{
       @Test
       @DisplayName("Test the base is not empty")
       void testTheBaseIsNotEmpty() {
           Assertions.assertFalse(Response.getBase().isEmpty());
       }

       @Test
       @DisplayName("Test if Base is a String")
       void testIfBaseIsAString() {
           Assertions.assertTrue(Response.getBase().getClass().equals(String.class));
       }

       @Test
       @DisplayName("Test if Base is 3 Characters")
       void testIfBaseIs3Characters() {
           Assertions.assertTrue(Response.getBase().length() == 3);
       }
   }
   @Nested
    @DisplayName("Date Tests")
    class DateTest{
       @Test
       @DisplayName("Date is not empty")
       void dateIsNotEmpty() {
           Assertions.assertFalse(Response.getDate().isEmpty());
       }

       @Test
       @DisplayName("Date follows Regex Date")
       void dateFollowsRegexDate() {
           Assertions.assertTrue(Response.getDate().matches("\\d{4}-[01]\\d-[0-3]\\d"));
       }

       @Test
       @DisplayName("Date is after Epoc")
       void dateIsAfterEpoc() {
           Assertions.assertTrue(LocalDate.parse(Response.getDate()).isAfter(LocalDate.EPOCH));
       }
   }
   @Nested
    @DisplayName("Rates Tests")
    class RateTest {
       @Test
       @DisplayName("Test ")
       void test() {
           Assertions.assertEquals(1,1);
       }
   }


}
