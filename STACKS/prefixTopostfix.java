import java.util.Stack;

public class prefixTopostfix {
    public static void main(String[] args) {
        String prefix = "-9/*+5346";
        Stack<String> val=new Stack<>();
        for(int i=prefix.length()-1;i>=0;i--){
            char ch=prefix.charAt(i);
            int ascii=(int)ch;
            if(ascii>=48 && ascii<=57){
                String st=""+ch;
                val.push(st);
            }
            else if(ch=='+'){
                String v1=val.pop();
                String v2=val.pop();
                String st=v1+v2+ ch;
                val.push(st);
                
            }
            else if(ch=='-'){
                String v1=val.pop();
                String v2=val.pop();
                String st=v1+v2+ ch;
                val.push(st);
            }
            else if(ch=='*'){
                String v1=val.pop();
                String v2=val.pop();
                String st=v1+v2+ ch;
                val.push(st);
            }
            else if(ch=='/'){
                String v1=val.pop();
                String v2=val.pop();
                String st=v1+v2+ ch;
                val.push(st);
            }
        }
        System.out.println(val.peek());
    }
}
