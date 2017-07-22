package com.derekzc.util.time;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TimeTools
{

    public static String GMTToFormatTime(String GMTTime, String timeFormat)
    {
        Calendar cal = Calendar.getInstance();
        cal.setTimeInMillis(Long.valueOf(GMTTime));

        SimpleDateFormat dateFormate = new SimpleDateFormat(timeFormat);
        Date date = cal.getTime();

        return dateFormate.format(date);

    }

    public static void main(String[] args)
    {
        String GMTTime = "1222431906166";
        String timeFormat = "yyyyMMdd-HHmmss";
        System.out.println(TimeTools.GMTToFormatTime(GMTTime, timeFormat));
    }
}
