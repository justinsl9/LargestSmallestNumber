package largesmall;     //@author Justin Little
import java.util.Scanner;
public class LargeSmall {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int number1, number2, number3, number4, number5;
       int large, small;
       System.out.println("Find the Largest and Smallest Number Program");
       System.out.print("Enter first integer: ");
       number1 = input.nextInt();
       System.out.print("Enter second integer: ");
       number2 = input.nextInt();
       System.out.print("Enter third integer: ");
       number3 = input.nextInt();
       System.out.print("Enter fourth integer: ");
       number4 = input.nextInt();
       System.out.print("Enter fifth integer: ");
       number5 = input.nextInt();
       
       large = number1;
       small = number1;
       if (number2 > large)
           large = number2;
       if (number3 > large)
            large = number3;
        if (number4 > large)
           large = number4;
       if (number5 > large)
            large = number5;
       if (number2 < small)
           small = number2;
       if (number3 < small)
            small = number3;
       if (number4 < small)
           small = number4;
       if (number5 < small)
            small = number5;
       System.out.printf("The largest of the numbers is %d.%n", large);
       System.out.printf("The smallest of the numbers is %d.%n", small);
    }
    
}
