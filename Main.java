import java.util.Scanner;

public class CovidSurvey {
  public static void main(String[] args) {

  { 
    System.out.println("Welcome back to school!");
    System.out.println("");
    Scanner scan = new Scanner(System.in); 
    System.out.println("What is your name?");
    String name = scan.next();
    System.out.println("What is your temperture?");
    String temperturesc; nextString(); //type your temperture here;
    if(temperturesc >= 100.5 && temperturesc <= 100.5)
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
    int good = scan.nextInt(); 

    System.out.println("Can you rate how you feel today");
    int num = 0;
    while ( num < 6){
      System.out.println("If less than 3 please go to the office");
    int String = scan.nextInt();
    num++;
    }
    System.out.println("Are you prepared for this school year?");
    String prep = scan.next();
    System.out.println("Yes or No?");
    if (Yes)
    {
      System.out.println("Awesome, we looking forward to a new year!");
    }
    else  
    {
      System.out.println("You need to have everything you need by the end of the week.");
    }

    System.out.println("Thank you for taking this survey.");
  }
}
}