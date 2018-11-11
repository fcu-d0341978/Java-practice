import java.util.*;

public class list extends food
{
   ArrayList<food> foodList;
   
   public list()
   {
      foodList = new ArrayList<food>();
   }
   
   public boolean add(food food)
   {
      return foodList.add(food);
   }
   
   public food get(int index)
   {
      return foodList.get(index);
   }
   
   public boolean remove(food food)
   {
      return foodList.remove(food);
   }
   
   public String toString()
   {
      return super.toString();
   }
   
   public void sort()
   {
      
   }
}