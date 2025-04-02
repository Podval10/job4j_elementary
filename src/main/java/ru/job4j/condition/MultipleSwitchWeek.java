package ru.job4j.condition;

public class MultipleSwitchWeek {
    public static int numberOfDay(String name) {
        return switch (name) {
            case "Понедельник", "Monday" -> 1;
            case "Вторник"->2;
            case "Среда" ->3;
            case "Четверг" ->4;
            case "Пятница" ->5;
            case "Суббота" ->6;
            case "Воскресенье" ->7;
            default -> -1;
        };
    }
    public static void main (String [] args){
      int   name= MultipleSwitchWeek.numberOfDay("Понедельник");
      System.out.println(name);
      int name2 = MultipleSwitchWeek.numberOfDay("Вторник");
      System.out.println(name2);
    }
}
