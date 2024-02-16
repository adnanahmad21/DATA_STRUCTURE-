import java.util.Stack;
public class balanceBrackets2 {
    public static boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
             char ch=s.charAt(i);
            if(ch=='(' || ch=='[' || ch=='{')
                st.push(ch);
            else {
                if(ch==')' || ch==']' || ch=='}')
                    if(st.isEmpty()) return false;
    else if(st.peek()=='[' && ch==']' || st.peek()=='(' && ch==')' || st.peek()=='{' && ch=='}' )                                                st.pop();
                else return false;
                }
        }
        if(st.isEmpty())  return true;
        return false;
    }
        public static void main(String args[]) {
         String s = "(";
         System.out.println(isValid(s));


        //     int ans=0;
        // Stack<Character> st = new Stack<>();
        // for (int i = 0; i < s.length(); i++) {
        //     if (s.charAt(i) == '(')
        //         st.push(s.charAt(i));
        //     else {
        //         if (s.charAt(i) == ')')
        //             if (st.isEmpty()){
        //                 ans++; 
        //             }
        //             else
        //                 st.pop();
        //     }
        // }
        // System.err.println(ans+st.size());
            
        
            

    }
}
