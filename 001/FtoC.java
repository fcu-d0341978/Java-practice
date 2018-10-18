import java.util.Scanner;

public class FtoC{

   public static void main(String[] args){
   
      Scanner kb = new Scanner(System.in);
      
      System.out.println("In put a degree in Fahrenheit:");
      float degreeF = kb.nextFloat();
           
      float degreeC = (degreeF - 32) * 5 / 9;
      
      System.out.println(degreeF +  " degree Fahrenheit is equal to " + degreeC + " in Celsius");
   }
}