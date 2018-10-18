import java.util.Scanner;

public class sumOfNum{

   public static void main(String[] args){
      int num = 0;
      int sum = 0;
      Scanner kb = new Scanner(System.in);
                
      do{
         System.out.println("Input an integer between 0 and 1000:");
         num = kb.nextInt();
      }while((num < 0) || (num > 1000));
      
      if(num == 1000){
         sum = 1;
      }else{
         sum = (num % 10) + ((num % 100) / 10) + (num / 100);
      }
      
      System.out.println("The sum of all digits in " + num + " is: " + sum);
   }
}