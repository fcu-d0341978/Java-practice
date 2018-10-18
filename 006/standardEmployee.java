/*
*Basic employee class
*
*/

public class standardEmployee{
   
   String name;
   String sex;
   String startDate;
   String tel;
   String address;
   double salary;
   double overTimeHours;
   
   public standardEmployee(String name, String sex, String startDate, String tel, String address, double salary, double overTimeHours){
      this.name = name;
      this.sex = sex;
      this.startDate = startDate;
      this.tel = tel;
      this.address = address;
      this.salary = salary;
      this.overTimeHours = overTimeHours;     
   }
   
   public void setHour(double overTimeHours){
      this.overTimeHours = overTimeHours;
   }
   
   public double getOvertimeMoney(){
      return salary / 240 * 1.5 * overTimeHours;
   }
   
   public void printBasicData(){
      System.out.println("Employee name:" + name);
      System.out.println("Employee sex:" + sex);
      System.out.println("Employee hire date:" + startDate);
      System.out.println("Employee tel No.:" + tel);
      System.out.println("Employee address:" + address);
   }
   
   public double getMonthSalary(){
      double Salary = salary + getOvertimeMoney();
      System.out.println("Salary:" + Salary);
      return Salary;
   }
}