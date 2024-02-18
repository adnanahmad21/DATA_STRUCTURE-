import java.util.*;
public class postfixExpression {
    public static void main(String[] args) {
    
     String  s="((a/b)+c)-(d+(e*f))";
       // String s="9-(5+3)*4/6";
        Stack<String> val=new Stack<>();
        Stack<Character> op=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int ascii=(int)ch;
            if(ch==' ') continue;
            if(ascii>=48 && ascii<=57){
                String st=""+ch;
                val.push(st);
            }
            else if(ascii>=65 && ascii<=90 || ascii>=97 && ascii<=122 ){
                String st=""+ch;
                val.push(st);
            }
            else if(op.size()==0 || ch=='(' || op.peek()=='(')  op.push(ch);
            else if(ch==')'){
                while(op.peek()!='('){
                    String v2=val.pop();
                    String v1=val.pop();
                    char o=op.pop();
                    String t=v1+v2+o;
                    val.push(t);
                }
                op.pop();
            }
            else {
                if(ch=='+' || ch=='-'){
                    String v2=val.pop();
                    String v1=val.pop();
                    char o=op.pop();
                    String t=v1+v2+o;
                    val.push(t);
                    op.push(ch);
                }
              else if(ch=='*' || ch=='/'){
                    if(op.peek()=='*' || op.peek()=='/'){
                        String v2=val.pop();
                        String v1=val.pop();
                        char o=op.pop();
                        String t=v1+v2+o;
                        val.push(t);
                        op.push(ch);
                    }
                    else op.push(ch);
                }
            }

        }
        while(val.size()>1){
            String v2=val.pop();
            String v1=val.pop();
            char o=op.pop();
            String t=v1+v2+o;
            val.push(t);
        }
        System.out.println(val.peek());
    }

   
}
