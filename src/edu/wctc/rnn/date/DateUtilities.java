/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wctc.rnn.date;

/**
 * Represents local date time for setting date or time.
 *
 * @author Rasika Nanayakkara,rliyanage@my.wctc.edu
 * @since 1.8;
 * @version 1.00;
 */
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import static java.time.temporal.ChronoUnit.DAYS;
import java.time.temporal.TemporalAdjusters;
import static java.time.temporal.TemporalQueries.localDate;
import java.util.Calendar;

public class DateUtilities {

    /**
     * Gets the future date
     *
     * @return future date from now
     */
    public LocalDate getFutureDate(int days) {         
        LocalDate today = LocalDate.now();
        LocalDate futureDay = today.plus(days, ChronoUnit.DAYS);
        System.out.println(futureDay);
        return futureDay;
    }

    /**
     * @param formatter - Pattern of DateTimeFormatter is required.
     *
     */
    public void convertToLocalDateTimeToFormattedString(DateTimeFormatter formatter) {
        formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime dateTime = LocalDateTime.of(0, Month.of(0), 0, 0, 0);
        String formattedDateTime = dateTime.format(formatter);
        System.out.println(formattedDateTime);
    }

    /**
     * @param dateAndTime - date and time in String format.
     */
    public void convertFornmattedStringToLocalDateTime(String dateAndTime) {
        dateAndTime = "2016-04-08 12:30";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime dateTime = LocalDateTime.parse(dateAndTime, formatter);
        System.out.println(dateTime);
    }

    /**
     * @param startDate - start date is required to calculate duration.
     * @param endDate - end date is required to calculate duration.
     */
    public void calculateDuration(LocalDate startDate, LocalDate endDate) {
        startDate = LocalDate.of(2015, 4, 9);
        endDate = LocalDate.of(2017, 5, 9);
        Period duration = Period.between(startDate, endDate);
        System.out.println((duration.getYears()) + (duration.getMonths()) + (duration.getDays()));

    }
}
