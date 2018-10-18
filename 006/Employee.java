/*
*Employee class
*
*/

public class Employee extends standardEmployee{
   
   public Employee(String name, String sex, String startDate, String tel, String address, double salary, double overTimeHours){
      super(name, sex, startDate, tel, address, salary, overTimeHours);
   }
   
   public double getMonthSalary(){
      double Salary = super.getMonthSalary();
      return Salary;
   }
}