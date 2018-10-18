import java.util.Scanner;

public class splitDigits{
   
   public static void main(String[] arge){
      
      Scanner kb = new Scanner(System.in);
      
      System.out.println("Input a integer less than 1000000:");
      int num = kb.nextInt();
      
      int digit1 = num % 10;
      int digit2 = (num / 10) % 10;
      int digit3 = (num / 100) % 10;
      int digit4 = (num / 1000) % 10;
      int digit5 = (num / 10000) % 10;
      int digit6 = (num / 100000) % 10;
      
      if(num < 100000 && num > 9999){
         System.out.println(digit5 +" "+ digit4 +" "+ digit3 +" "+ digit2 +" "+ digit1);
      }else if(num < 10000 && num > 999){
         System.out.println(digit4 +" "+ digit3 +" "+ digit2 +" "+ digit1);
      }else if(num < 1000 && num > 99){
         System.out.println(digit3 +" "+ digit2 +" "+ digit1);
      }else if(num < 100 && num > 9){
         System.out.println(digit2 +" "+ digit1);
      }else if(num < 10){
         System.out.println(digit1);
      }else if(num == 0){
         System.out.println("0");
      }else{
         System.out.println(digit6 +" "+ digit5 +" "+ digit4 +" "+ digit3 +" "+ digit2 +" "+ digit1);
      }
      //System.out.println(digit6 +" "+ digit5 +" "+ digit4 +" "+ digit3 +" "+ digit2 +" "+ digit1);
   }
}