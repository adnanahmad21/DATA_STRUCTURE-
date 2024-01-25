import java.util.Stack;
public class balancedBrackets {
    public static void main(String args[]) {
        String s = "(()())";
    
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(')
                st.push(s.charAt(i));
            else {
                if (s.charAt(i) == ')')
                    if (st.isEmpty())
                        System.out.println("Not balanced");
                        else 
                        st.pop();
            }
        }
        if(st.isEmpty())   System.out.println(" balanced");
        else   System.out.println("Not balanced");

    }
}
