/*
*High admin class
*
*/

public class highAdmin extends standardAdmin{
   
   public highAdmin(String name, String sex, String startDate, String tel, String address, double salary, double overTimeHours){
      super(name, sex, startDate, tel, address, salary, overTimeHours);
   }
   
   public void setExtraFee(){
      lunchFee = 1800;
      transportationFee = 2000;
      workBonus = 5000;
   }
}