/*
*Test class
*
*/

public class Test{
   
   public static void main(String[] arge){
      Employee e1 = new Employee("Mur", "F", "3/10", "123456789", "Taiwan", 80000, 20);
      Employee e2 = new Employee("Pat", "M", "11/25", "987654321", "Taiwan", 80000, 0);
      highAdmin e3 = new highAdmin("Lol", "M", "9/25", "987654321", "Taiwan", 20000, 0);
      highAdmin e4 = new highAdmin("Lmao", "M", "9/15", "961863521", "Taiwan", 70000, 15);
      secondAdmin e5 = new secondAdmin("MonkaS", "M", "1/1", "6864316846", "Taiwan", 75000, 10);
      secondAdmin e6 = new secondAdmin("Lul", "M", "5/9", "463452423", "Taiwan", 75000, 0);
      
      e1.printBasicData();
      e1.getMonthSalary();
      System.out.println("");
      
      e2.printBasicData();
      e2.getMonthSalary();
      System.out.println("");
      
      e3.printBasicData();
      e3.setExtraFee();
      e3.getMonthSalary();
      System.out.println("");
      
      e4.printBasicData();
      e4.setExtraFee();
      e4.getMonthSalary();
      System.out.println("");
      
      e5.printBasicData();
      e5.setExtraFee();
      e5.getMonthSalary();
      System.out.println("");
      
      e6.printBasicData();
      e6.setExtraFee();
      e6.getMonthSalary();
   }
}
   
   