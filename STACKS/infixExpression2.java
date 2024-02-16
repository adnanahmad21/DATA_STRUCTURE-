import java.util.Stack;

public class infixExpression2 {
    public static void main(String args[]) {
        Stack<Integer> val = new Stack<>();
        Stack<Character> op = new Stack<>();
        String str = "(9-(5+3)*4/6)+(9-5+3*4/6)";
        int v1, v2;
        char ch;
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            int ascii = (int) ch;
            if (ch >= 48 && ch <= 57)
                val.push(ascii - 48);
            else if (op.isEmpty() || ch == '(' || op.peek() == '(')
                op.push(ch);
            else if (ch == ')') {
                while(op.peek()!='('){
                    v2 = val.pop();
                    v1 = val.pop();
                    if (op.peek() == '+')
                        val.push(v1 + v2);
                    if (op.peek() == '-')
                        val.push(v1 - v2);
                    if (op.peek() == '*')
                        val.push(v1 * v2);
                    if (op.peek() == '/')
                        val.push(v1 / v2);
                    op.pop();
                }
                op.pop();

            } else {
                if (ch == '+' || ch == '-') {
                    v2 = val.pop();
                    v1 = val.pop();
                    if (op.peek() == '+')
                        val.push(v1 + v2);
                    if (op.peek() == '-')
                        val.push(v1 - v2);
                    if (op.peek() == '*')
                        val.push(v1 * v2);
                    if (op.peek() == '/')
                        val.push(v1 / v2);
                    op.pop();
                    op.push(ch);
                } else {
                    if (ch == '*' || ch == '/') {
                        if (op.peek() == '*' || op.peek() == '/') {
                            v2 = val.pop();
                            v1 = val.pop();
                            if (op.peek() == '*')
                                val.push(v1 * v2);
                            if (op.peek() == '/')
                                val.push(v1 / v2);
                            op.pop();
                            op.push(ch);
                        } else
                            op.push(ch);
                    }
                }
            }
        }
        while (val.size() > 1) {
            v2 = val.pop();
            v1 = val.pop();
            if (op.peek() == '+')
                val.push(v1 + v2);
            if (op.peek() == '-')
                val.push(v1 - v2);
            if (op.peek() == '*')
                val.push(v1 * v2);
            if (op.peek() == '/')
                val.push(v1 / v2);
            op.pop();
        }
        System.out.println(val.peek());
    }

}
