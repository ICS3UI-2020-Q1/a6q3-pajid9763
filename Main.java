import java.util.Scanner;
/**
 * program to find largest number in an array
 * @author Darian
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int numbers[] = new int[10];

    // ask the user to enter 10 integers
    System.out.println("Please enter in 10 integers to put into the array");
    for (int i = 0; i < numbers.length; i++){
      numbers[i] = input.nextInt();
    }

    int highest = numbers[0];

    for (int i = 0; i < numbers.length; i++){
      if (highest < numbers[i])
        highest = numbers[i];
      }
      System.out.println("The largest number is " + highest);
    }
    
  }

