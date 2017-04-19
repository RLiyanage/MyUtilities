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
     * @param NoOfDays -<code>NoOfDays</code> how many NoOfDays you need to add
     * @return future date from now
     * @throws IllegalArgumentException if NoOfDays is negative.
     */
    public LocalDate getFutureDate(int NoOfDays) throws IllegalArgumentException {
        if (NoOfDays < 0) {
            throw new IllegalArgumentException("Number of days cannot be negative.");
        }
        LocalDate today = LocalDate.now();
        LocalDate futureDay = today.plus(NoOfDays, ChronoUnit.DAYS);
        System.out.println(futureDay);
        return futureDay;
    }

    /**
     * Gets LocalDateTime to formatted String.
     *
     * @param format - <code>format </code>format is required.
     *
     *
     */
    public static String convertToLocalDateTimeToFormattedString(String strDate) {
        strDate = "2015-08-04";
        LocalDate date = LocalDate.parse(strDate);
        DateTimeFormatter dTF = DateTimeFormatter.ofPattern("dd MMM yyyy");
        return (date + " formats as " + dTF.format(date));
    }

    /**
     * @param dateAndTime - date and time in String format.
     */
    public void convertFornmattedStringToLocalDateTime(String dateAndTime) {
        //dateAndTime = "2016-04-08 12:30";
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
