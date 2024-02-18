import java.util.Stack;

public class postfixToprefix {
    public static void main(String[] args) {
      
            String postfix = "953+4*6/-";
            Stack<String> val=new Stack<>();
            for(int i=0;i<postfix.length();i++){
                char ch=postfix.charAt(i);
                int ascii=(int)ch;
                if(ascii>=48 && ascii<=57){
                    String st=""+ch;
                    val.push(st);
                }
                else if(ch=='+'){
                    String v2=val.pop();
                    String v1=val.pop();
                    String st=ch+v1+v2;
                    val.push(st);
                    
                }
                else if(ch=='-'){
                    String v2=val.pop();
                    String v1=val.pop();
                    String st=ch+v1+v2;
                    val.push(st);
                }
                else if(ch=='*'){
                    String v2=val.pop();
                    String v1=val.pop();
                    String st=ch+v1+v2;
                    val.push(st);
                }
                else if(ch=='/'){
                    String v2=val.pop();
                    String v1=val.pop();
                    String st=ch+v1+v2;
                    val.push(st);
                }
            
          
        }
        System.out.println(val.peek());
    }
}
