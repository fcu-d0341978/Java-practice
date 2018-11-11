import java.util.*;

public class sortArrayList
{
   
   public static void main(String[] args)
   {
      ArrayList<Integer> num = new ArrayList<Integer>();
      ArrayList<String> food = new ArrayList<String>();
      
      num.add(12);
      num.add(5);
      num.add(7);
      num.add(56);
      num.add(5);
      num.add(8);
      
      for(int list : num)
      {
         System.out.println(list);
      }
      
      Collections.sort(num);
      
      System.out.println("After sort :");
      
      for(int list : num)
      {
         System.out.println(list);
      }
      
      food.add("apple");
      food.add("Apple");
      food.add("cake");
      food.add("lol");
      food.add("Lmao");
      food.add("lop");
      
      Collections.sort(food);
      
      for(String list : food)
      {
         System.out.println(list);
      }
   }
}