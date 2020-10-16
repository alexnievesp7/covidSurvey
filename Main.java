import java.util.Scanner;

public class CovidSurvey {
  public static void main (String{}args)

  { 
    System.out.println("Welcome back to school!");
    System.out.println("");
    Scanner scan = new Scanner(System.in); 
    System.out.println("What is your name?");
    String name = scan.next();
    System.out.println("What is your temperture?");
    int temperture sc.nextInt(); //type your temperture here;
    if(temperture >= 100.5 && temperture <= 100.5)
  {
    System.out.println("You can enter.");
  }
  else
  {
    System.out.println("You can't enter, you are sick.");
  } //sometimes it doesn't run right just run again;
    System.out.println("");
    System.out.println("Rate how safe you feel coming back to school."); 
    for (int good = 0; good < 6; good++){
    System.out.println(good);
    }
    int good = sc.nextInt(); 

    System.out.println("Can you rate how you feel today");
    int num = 0;
    while ( num < 6){
      System.out.println("If less than 3 please go to the office");
    int num = sc.nextInt();
    num++;
    }
    System.out.println("Are you prepared for this school year?");
    if()
    System.out.println("Thank you for taking this survey.");
  }
}
