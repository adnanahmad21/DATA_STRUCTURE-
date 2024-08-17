
interface example {
  void table(int a); // functional interface

  static void hi() {
    System.out.println("wfw");
  }

  default void g() {
    System.out.println("wf");
  }

}
// class B implements example{
//   public void g(){
//     System.out.println("wg");
//   }

//   static void hi(){
// System.out.println("egggge");
//   }

//   @Override
//   public void table(int a) {
//     // TODO Auto-generated method stub
//     throw new UnsupportedOperationException("Unimplemented method 'table'");
//   }
// }

class fucntionalInterface {
  public static void main(String[] args) {
    // lambda expression
    // example ex = (a, b) -> {
    // return a + b;
    // };
// B b=new B();
// b.g();
// B.hi();

//     example ex1 = (a) ->  {
//  for(int i=1;i<11;i++){
//   System.out.println(a*i);
//  }
//     };
    // OR

  // ex1.table(15);
    example ex2 = (a) ->  {
 for(int i=1;i<11;i++){
  System.out.println(a*i);
 }
    }; 
    // OR

  ex2.table(105);

  }
}
