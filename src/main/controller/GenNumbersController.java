package main.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

public class GenNumbersController {
    public static String genMembershipNums(){
        String time = Long.toString(System.currentTimeMillis());
        return time.substring(3, 11);
    }

    public static String genDateTime(){
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
        String dateNowStr = sdf.format(d);
        return dateNowStr;
    }
}
