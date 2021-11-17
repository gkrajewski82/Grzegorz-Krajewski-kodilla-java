package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

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
        List<Integer> emptyList = new ArrayList<>();

        //When
        List<Integer> exterminatedList = executor.exterminate(emptyList);

        //Then
        assertTrue(exterminatedList.isEmpty());
    }

    @DisplayName("Check if the exterminate method works properly when the list has either odd and even numbers")
    @Test
    void testCaseIfOddAndEven() {
        //Given
        OddNumbersExterminator executor = new OddNumbersExterminator();
        List<Integer> oddAndEvenNumbersList = Arrays.asList(1, 2, 3, 4);

        //When
        List<Integer> exterminatedList = executor.exterminate(oddAndEvenNumbersList);

        //Then
        Assertions.assertEquals(exterminatedList.size(), 2);
        Assertions.assertEquals(exterminatedList.get(0), 2);
        Assertions.assertEquals(exterminatedList.get(1), 4);
    }
}
