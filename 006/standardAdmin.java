/*
*Basic administrator class
*
*/

public class standardAdmin extends standardEmployee{
   
   double lunchFee;
   double transportationFee;
   double workBonus;
   
   public standardAdmin(String name, String sex, String startDate, String tel, String address, double salary, double overTimeHours){
      super(name, sex, startDate, tel, address, salary, overTimeHours);
   }
   
   public double getMonthSalary(){
      double Salary = super.getMonthSalary() + lunchFee + transportationFee + workBonus;
      System.out.println("Salary:" + Salary);
      return Salary;
   }
}