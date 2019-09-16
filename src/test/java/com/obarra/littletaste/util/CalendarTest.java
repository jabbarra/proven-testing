package com.obarra.littletaste.util;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Objects;

import static org.junit.Assert.*;

/**
 * The old library has a lot of inconsistencies
 * Calendar months are zero-based, but days of week are one-based
 */
public class CalendarTest {


    @Test
    public void getMonthShouldBeAprilWithZeroIndexed() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = null;
        try {
            date = simpleDateFormat.parse("04/04/1991");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);


        int april = 3;
        assertEquals(april, calendar.get(Calendar.MONTH));
    }

    @Test
    public void getDayOfWeekShouldBeSundayWithIndexedFromOne() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = null;
        try {
            date = simpleDateFormat.parse("15/09/2019");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);

        int sunday = 1;
        assertEquals(sunday, calendar.get(Calendar.DAY_OF_WEEK));
    }


    @Test
    public void getDayOfMonthShouldBeSundayWithIndexedFromOne() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = null;
        try {
            date = simpleDateFormat.parse("15/09/2019");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);

        assertEquals(15, calendar.get(Calendar.DAY_OF_MONTH));
    }

}