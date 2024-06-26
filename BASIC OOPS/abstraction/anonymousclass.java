
interface outerclass2 {
    void say();

}// anonymous class is use to access interface directly




// class outerclass implements outerclass2 {
//     void print() {
//         System.out.println("call by anonymous");
//     }

//     public void say() {
//         System.out.println("Hello guyz ");
//     }
// } 
//MAIN
public class anonymousclass {
    public static void main(String[] args) {
        outerclass2 obj = new outerclass2() {
public void say(){
    System.out.println("hiiiii");
}
        };
        obj.say();
      
        
    }
}