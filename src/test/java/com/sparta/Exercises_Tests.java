package com.sparta;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class Exercises_Tests {

    @Test
    @DisplayName("Average returns correct average")
    public void Average_ReturnsCorrectAverage()
    {
        int[] nums = { 3, 8, 1, 7, 3 };
        Assertions.assertEquals(4.4, Exercises.average(nums));
    }

    @Test
    @DisplayName(("When the Array is empty average returns zero"))
    public void WhenArrayIsEmpty_Average_ReturnsZero()
    {
        int[] nums = {  };
        Assertions.assertEquals(0, Exercises.average(nums));
    }

    @ParameterizedTest
    @CsvSource( {
            "100, OAP",
            "60, OAP",
            "59, Standard",
            "18, Standard",
            "17, Student",
            "13, Student",
            "12, Child",
            "5, Child",
            "4, Free",
            "0, Free"
    })
    @DisplayName("Testing ticket types by age")
    public void TicketTypeTest(int age, String expected)
    {
        var result = Exercises.ticketType(age);
        Assertions.assertEquals(expected, result);
    }

    // write unit tests for the 'Grade' method here

    @ParameterizedTest
    @CsvSource( {
            "100, Pass with Distinction",
            "75, Pass with Distinction",
            "74, Pass with Merit",
            "60, Pass with Merit",
            "59, Pass",
            "40, Pass",
            "39, Fail",
            "0, Fail"
    })
    @DisplayName("Testing grades types by scores")
    public void GradeTest(int mark, String expected)
    {
        var grade = Exercises.grade(mark);
        Assertions.assertEquals(expected, grade);
    }

    // write unit tests for the Scottish wedding example here

    @ParameterizedTest
    @CsvSource( {
            "4, 20",
            "3, 50",
            "2, 50",
            "1, 100",
            "0, 200"
    })
    @DisplayName(("Testing max attendees by alert level"))
    public void maxAttendeesTest(int level, int maxAttendees1){
        var maxAttendees = Exercises.checkMaxAttendees(level);
        Assertions.assertEquals(maxAttendees1, maxAttendees);
    }

}
