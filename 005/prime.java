public class prime{
   
   public static void main(String[] arge){ 
      
      for(int i = 100; i <= 200; i++){
         boolean isPrime = true;
         for(int j = 2; j < 16; j++){
            int num = i % j;
            if(num == 0){
               isPrime = false;
               break;
            }
         }
         if(isPrime){
            System.out.println(i);
         }
      }
   }
}