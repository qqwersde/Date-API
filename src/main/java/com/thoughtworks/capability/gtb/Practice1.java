package com.thoughtworks.capability.gtb;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


/**
 * 计算任意日期与下一个劳动节相差多少天
 *
 * @author itutry
 * @create 2020-05-15_16:33
 */
public class Practice1 {

  public static long getDaysBetweenNextLaborDay(LocalDate date) {
    int year = date.getYear();
    LocalDate mayday = LocalDate.of(year,5,1);
    if (date.isBefore(mayday))
      {
        long days = ChronoUnit.DAYS.between(date,mayday);
        return days;
      }else if(date.isAfter(mayday))
      {
      mayday = mayday.plusYears(1);
      long days = ChronoUnit.DAYS.between(date,mayday);
      return days;
      }else
      {
        return 0;
      }
  }
}
