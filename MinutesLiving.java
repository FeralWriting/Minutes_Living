import java.util.*;
class MintesLiving {
  public static void main(String[] args) {
    Scanner console = new Scanner(System.in);
    System.out.println("How old are you?");
    int yearsLiving = console.nextInt();
    int minHour = 60;
    int hourDay = 24;
    int dayWeek = 7;
    int weekYear = 52;
    int minDay = minHour * hourDay;
    int minWeek = minDay * dayWeek;
    int minYear = minWeek * weekYear;
    int minLiving = yearsLiving * minYear;
    System.out.println("You have been alive for " + minLiving + " minutes. 😱");
  }
}
