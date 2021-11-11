package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

@DisplayName("Collection Test Suite")
public class CollectionTestSuite {

    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @DisplayName("Check if the exterminate method works properly when the list is empty")
    @Test
    void testCaseIfEmpty() {

        //Given
        OddNumbersExterminator executor = new OddNumbersExterminator();

        //When
        List<Integer> evenNumbersList = new ArrayList<>();
        List<Integer> testEmptyList = new ArrayList<>();
        executor.exterminate(testEmptyList);

        //Then
        Assertions.assertEquals(evenNumbersList.isEmpty(), testEmptyList.isEmpty());
    }

    @DisplayName("Check if the exterminate method works properly when the list has either odd and even numbers")
    @Test
    void testCaseIfOddAndEven() {

        //Given
        OddNumbersExterminator executor = new OddNumbersExterminator();

        //When
        List<Integer> evenNumbersList = new ArrayList<>();

        List<Integer> testOddAndEvenNumbersList = new ArrayList<>();
        for (int i=0; i<20; i++) {
            testOddAndEvenNumbersList.add(i);
        }

        List<Integer> testEvenNumbersList = new ArrayList<>();
        for (Integer number : testEvenNumbersList) {
            if (number % 2 == 0) {
                testEvenNumbersList.add(number);
            }
        }

        executor.exterminate(testOddAndEvenNumbersList);

        //Then
        Assertions.assertEquals(evenNumbersList, testEvenNumbersList);
    }
}
