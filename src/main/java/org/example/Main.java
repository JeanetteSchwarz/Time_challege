package org.example;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {

        //Step 1: Write code to output the current date and time. LocalDateTime = Datum & Uhrzeit
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        //Step2: Add a timespan of 2 weeks to the current date and output the new date.
        LocalDate today = LocalDate.now();
        LocalDate twoWeeksLater = today.plusWeeks(2);
        System.out.println("In two weeks: " + twoWeeksLater);


        //Step 3: Compare the current date with a specified future date and output whether the current date is before or after the specified date.
        LocalDate todaysDate = LocalDate.now();
        LocalDate futureDate = LocalDate.of(2025, 12, 1);

        if (todaysDate.isBefore(futureDate)) {
            System.out.println("The current date is before the specified date.");
        } else {
            System.out.println("The current date is after the specified date.");
        }

        //Step 4: Calculate the difference in days between two arbitrary dates and output the result.
        long daysBetween = ChronoUnit.DAYS.between(LocalDate.now(), futureDate);
        System.out.println(daysBetween);

}}
