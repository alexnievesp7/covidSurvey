import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

  { 
    System.out.println("Welcome back to school!");
    System.out.println("");
    Scanner scan = new Scanner(System.in); 
    System.out.println("What is your name?");
    String name = scan.next();
    System.out.println("What is your temperture?");
    double temperturesc = scan.nextDouble(); //type your temperture here;
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
    System.out.println("On a scale on 1-10");
    for (int good = 0; good < 1; good++){
    System.out.println(good);
    }
    int good = scan.nextInt(); 

    System.out.println("Can you rate how you feel today");
    int num = 0;
    while ( num < 1){
      System.out.println("If less than 3 please go to the office");
    int String = scan.nextInt();
    num++;
    }
    System.out.println("Are you prepared for this school year?");
    String prep = scan.next();
    System.out.println("True or False?");
    boolean prepared = scan.nextBoolean();

    if (prepared)
    {
      System.out.println("Awesome, we are looking forward to a new year!");
    }
    else  
    {
      System.out.println("You need to have everything you need by the end of the week.");
    }

    System.out.println("Thank you for taking this survey.");
  }
}
}