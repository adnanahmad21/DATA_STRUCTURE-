
interface outerclass2 {
    void say(int a,int b);
    void bye();
    static void hllw(){
        System.out.println("s");

    }
    default void bll(){
        System.out.println("wf");

    }

}// anonymous class is use to access interface directly

// class outerclass implements outerclass2 {
// void print() {
// System.out.println("call by anonymous");
// }

// public void say() {
// System.out.println("Hello guyz ");
// }
// }
// MAIN
public class anonymousclass {
    public static void main(String[] args) {
      new outerclass2() {
            public void say(int a,int b) {
                System.out.println(a+b);
            }
            public void bye() {
                System.out.println("byee");
            }

    
        }.bye();
    // o2.say(2,3);
      outerclass2 o3=  new outerclass2() {
            public void say(int a,int b) {
                System.out.println(a+b);
            }
            public void bye() {
                System.out.println("byee");
            }

    };
    o3.bye();
    o3.say(22,3);
    outerclass2.hllw();
    

}}
