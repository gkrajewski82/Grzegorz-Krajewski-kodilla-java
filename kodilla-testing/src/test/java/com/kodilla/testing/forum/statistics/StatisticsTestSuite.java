package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class StatisticsTestSuite {

    private List<String> usersGenerator(int usersNumber) {
        List<String> resultList = new ArrayList<>();
        for (int i = 1; i <= usersNumber; i++) {
            String theUser = "Name" + i;
            resultList.add(theUser);
        }
        return resultList;
    }

    @Mock
    private Statistics statisticsMock;

    private static int testCounter = 0;

    @BeforeAll
    public static void BeforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void AfterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    void testCalculateAdvStatisticsWhen0Posts() {
        //Given
        List<String> usersList = usersGenerator(5);
        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(0);
        StatisticsCount statisticsCount = new StatisticsCount();

        //When
        statisticsCount.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(0, statisticsCount.getPostsNumber());
        assertEquals(0, statisticsCount.getAveragePostsNumberPerUser());
    }

    @Test
    void testCalculateAdvStatisticsWhen1000Posts() {
        //Given
        List<String> usersList = usersGenerator(5);
        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(1000);
        StatisticsCount statisticsCount = new StatisticsCount();

        //When
        statisticsCount.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(1000, statisticsCount.getPostsNumber());
        assertEquals(200, statisticsCount.getAveragePostsNumberPerUser());
    }

    @Test
    void testCalculateAdvStatisticsWhen0Comments() {
        //Given
        List<String> usersList = usersGenerator(5);
        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(5);
        when(statisticsMock.commentsCount()).thenReturn(0);
        StatisticsCount statisticsCount = new StatisticsCount();

        //When
        statisticsCount.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(0, statisticsCount.getCommentsNumber());
        assertEquals(0, statisticsCount.getAverageCommentsNumberPerUser());
        assertEquals(0, statisticsCount.getAverageCommentsNumberPerPost());
    }

    @Test
    void testCalculateAdvStatisticsWhenCommentsLessThanPosts() {
        //Given
        List<String> usersList = usersGenerator(5);
        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(10);
        when(statisticsMock.commentsCount()).thenReturn(5);
        StatisticsCount statisticsCount = new StatisticsCount();

        //When
        statisticsCount.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(10, statisticsCount.getPostsNumber());
        assertEquals(5, statisticsCount.getCommentsNumber());
        assertEquals(2, statisticsCount.getAveragePostsNumberPerUser());
        assertEquals(1, statisticsCount.getAverageCommentsNumberPerUser());
        assertEquals(0.5, statisticsCount.getAverageCommentsNumberPerPost());
    }

    @Test
    void testCalculateAdvStatisticsWhenCommentsMoreThanPosts() {
        //Given
        List<String> usersList = usersGenerator(5);
        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(10);
        when(statisticsMock.commentsCount()).thenReturn(30);
        StatisticsCount statisticsCount = new StatisticsCount();

        //When
        statisticsCount.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(10, statisticsCount.getPostsNumber());
        assertEquals(30, statisticsCount.getCommentsNumber());
        assertEquals(2, statisticsCount.getAveragePostsNumberPerUser());
        assertEquals(6, statisticsCount.getAverageCommentsNumberPerUser());
        assertEquals(3, statisticsCount.getAverageCommentsNumberPerPost());
    }

    @Test
    void testCalculateAdvStatisticsWhen0Users() {
        //Given
        List<String> usersList = new ArrayList<>();
        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(0);
        StatisticsCount statisticsCount = new StatisticsCount();

        //When
        statisticsCount.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(0, statisticsCount.getUsersNumber());
        assertEquals(Double.NaN, statisticsCount.getAveragePostsNumberPerUser());
        assertEquals(Double.NaN, statisticsCount.getAverageCommentsNumberPerUser());
    }

    @Test
    void testCalculateAdvStatisticsWhen100Users() {
        //Given
        List<String> usersList = usersGenerator(1000);
        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(50);
        when(statisticsMock.commentsCount()).thenReturn(2000);
        StatisticsCount statisticsCount = new StatisticsCount();

        //When
        statisticsCount.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(1000, statisticsCount.getUsersNumber());
        assertEquals(0.05, statisticsCount.getAveragePostsNumberPerUser());
        assertEquals(2, statisticsCount.getAverageCommentsNumberPerUser());
    }
}
