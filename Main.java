import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // write solutions to problems here
    //Loop that prints the odd numbers between 3 and 25

    int blub = 3;

    while (blub <= 25)
    {
      System.out.println(blub);
      blub = (blub + 2);
    }

    //Problem 1
    Scanner blah = new Scanner(System.in);
    System.out.println("Enter any positive numbers to add (Enter -1 to stop)");

    int sum = 0;
    int wuh = 0;

    while (wuh != -1)
    {
      wuh = blah.nextInt();
      sum += wuh;
    }

    sum++;
    System.out.println("The sum is " + sum);

    //Problem 2
    System.out.println("How many numbers do you wish to input");
    int max = 0;
    int buh = blah.nextInt();
    int guh = 0;

    System.out.println("Enter the scores");

    while (guh < buh)
    {
      int ahh = blah.nextInt();
      guh++; 
      if (ahh > max)
      {
        max = ahh;
      }    
    }
    System.out.println("The largest score is " + max);

    //Problem 3
    System.out.println("Input a word:");
    String word = blah.nextString();
    int bub = 0;

    while (bub < (word.length()-1))
    {
      String newWord = word.substring(bub,bub+2);

      bub+=3;
      System.out.print(newWord);
    }


  }
}
