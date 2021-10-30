package com.hospital.utils;

import cn.hutool.core.date.DateUtil;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 2019年东软睿道实训项目-东软云医院项目
 *
 * @ClassName 时间的工具
 * @Description 请输入你的简化描述！
 * @Author 方聪
 * @Date 2019/6/13 13:45
 * @Version 1.0
 **/

public class DateUtils<main> {
    public static java.sql.Timestamp getSqlDate(String date) {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        java.util.Date nowDate;
        java.sql.Timestamp transdate = null;
        try {
            nowDate = simpleDateFormat.parse(date);
            transdate = new java.sql.Timestamp(nowDate.getTime());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return transdate;
    }

    public static String getDate() {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        java.util.Date nowDate = new Date();
        String format = simpleDateFormat.format(nowDate);
        System.out.println(format);
        return format;
    }

    /**
     * @Description 传入yyyy-MM-dd的String类型的date 2019-06-28
     * @Date 18:13 2019/6/28
     * @Author 不望初心
     * @Param [m, st, ed] m=判断时间  st开始时间 ed结束日期时间 时间都是yyyy-MM-dd格式
     * @return boolean true 表示这个日期在这二个日期之间
     **/
    public static boolean inTheTwoDate(String m ,String st,String ed){
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            int startDay = 0;
            int endDay = 0;
            int mDay = 0;
            try {
                Date dateStart = format.parse(st);
                Date datEnd = format.parse(ed);
                Date mDate = format.parse(m);

                startDay = (int) (dateStart.getTime() / 1000);
                endDay = (int) (datEnd.getTime() / 1000);
                mDay = (int) (mDate.getTime() / 1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            if(startDay <= mDay && mDay <=endDay){
                return true;
            } else {
                return false;
            }
    }

    public static void main(String[] args) {
        boolean b =inTheTwoDate("2019-06-10","2019-06-11","2019-08-21");
        System.out.println(b);
        boolean b2 =inTheTwoDate("2019-06-15","2019-06-11","2019-08-21");
        System.out.println(b2);


    }

}
