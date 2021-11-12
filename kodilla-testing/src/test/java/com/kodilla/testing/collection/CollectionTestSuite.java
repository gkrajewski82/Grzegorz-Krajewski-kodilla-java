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
        List<Integer> emptyList = new ArrayList<>();
        List<Integer> exterminatedList = executor.exterminate(emptyList);

        //Then
        Assertions.assertEquals(exterminatedList, emptyList);
    }

    @DisplayName("Check if the exterminate method works properly when the list has either odd and even numbers")
    @Test
    void testCaseIfOddAndEven() {

        //Given
        OddNumbersExterminator executor = new OddNumbersExterminator();

        //When
        List<Integer> oddAndEvenNumbersList = new ArrayList<>();
        for (int i=0; i<10; i++) {
            oddAndEvenNumbersList.add(i);
        }

        List<Integer> evenNumbersList = new ArrayList<>();
        for (int i=0; i<10; i++) {
            if (i % 2 == 0) {
                evenNumbersList.add(i);
            }
        }

        List<Integer> exterminatedList = executor.exterminate(oddAndEvenNumbersList);

        //Then
        Assertions.assertEquals(exterminatedList, evenNumbersList);
    }
}
