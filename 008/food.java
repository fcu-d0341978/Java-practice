

public class food implements Comparable<food>
{
   private String name;
   private double cal;
   private int num;
   
   public food()
   {
      this.name = null;
      this.cal = 0;
      this.num = 0;
   }
   
   public food(String name, double cal, int num)
   {
      this.name = name;
      this.cal = cal;
      this.num = num;
   }
   
   public String getName()
   {
      return name;
   }
   
   public double getCal()
   {
      return cal;
   }
   
   public int getNum()
   {
      return num;
   }
   
   public int compareTo(food other)
   {
      int compareCal=((food)other).getNum();
        /* For Ascending order*/
        return this.getNum()-compareCal;
   }
   
   public String toString()
   {
      return  "\nFood name : " + this.name + "\nCalories : " + this.cal + "\nNumber : " + this.num;
   }
}