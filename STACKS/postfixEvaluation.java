import java.util.Stack;

public class postfixEvaluation {
    public static void main(String[] args) {
        String s="953+4*6/-";
        Stack<Integer> val=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int ascii=(int)ch;
            if(ascii>=48 && ascii<=57){
                val.push(ascii-48);
            }
            else if(ch=='+'){
                int v2=val.pop();
                int v1=val.pop();
                val.push(v1+v2);
            }
            else if(ch=='+'){
                int v2=val.pop();
                int v1=val.pop();
                val.push(v1+v2);
            }
            else if(ch=='-'){
                int v2=val.pop();
                int v1=val.pop();
                val.push(v1-v2);
            }
            else if(ch=='*'){
                int v2=val.pop();
                int v1=val.pop();
                val.push(v1*v2);
            }
            else if(ch=='/'){
                int v2=val.pop();
                int v1=val.pop();
                val.push(v1/v2);
            }
        }
       System.out.println(val.peek());
    }
}
