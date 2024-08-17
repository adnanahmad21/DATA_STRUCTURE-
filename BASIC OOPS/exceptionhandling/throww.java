public class throww {

   public void codee() throws Exception {
      int age = 17;

      if (age < 19)
         throw new Exception("Age is less than 18");
   }

   public static void main(String[] args) throws Exception {
      new throww().codee();

   }
}
