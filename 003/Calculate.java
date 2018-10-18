import java.util.Scanner;

public class Calculate{
   
   public static void main(String[] arge){
      
      Scanner kb = new Scanner(System.in);
      
      System.out.println("Input 1st integer:");
      int num1 = kb.nextInt();
      System.out.println("Input 2nd integer:");
      int num2 = kb.nextInt();
      
      int sum = num1 + num2;
      int prod = num1 * num2;
      float avg = (num1 + num2) / 2;
      int max = 0, min = 0;
      
      if(num1 > num2){
         max = num1;
         min = num2;
      }else if(num1 < num2){
         max = num2;
         min = num1;
      }
      
      int diff = max - min;
      
      System.out.println("Sum of two integers:" + sum);
      System.out.println("Difference  of two integers:" + diff);
      System.out.println("Product  of two integers:" + prod);
      System.out.println("Average  of two integers:" + avg);
      System.out.println("Max integers:" + max);
      System.out.println("Min integers:" + min);
   }
}