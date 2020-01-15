package org.zjl_.date;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class PrintCalendar {

  public static void main(String[] args) {
    LocalDate date = LocalDate.now();
    int month = date.getMonthValue();
    int today = date.getDayOfMonth();
    date = date.minusDays(today - 1);
    DayOfWeek dayOfWeek = date.getDayOfWeek();
    int day = dayOfWeek.getValue();
    System.out.println("Mon Tue Wed Thu Fri Sat Sun");

    for (int i = 1; i < day; i++)
      System.out.print("    ");

    while (date.getMonthValue() == month) {
      System.out.printf("%3d", date.getDayOfMonth());
      if (date.getDayOfMonth() == today)
        System.out.print("*");
      else
        System.out.print(" ");
      date = date.plusDays(1);
      if (date.getDayOfWeek().getValue() == 1)
        System.out.println();
    }
    if (date.getDayOfWeek().getValue() != 1)
      System.out.println();
  }

}