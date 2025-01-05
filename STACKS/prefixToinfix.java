import java.util.Stack;

public class prefixToinfix {
    public static void main(String[] args) {
        String prefix ="*-A/BC-/AKL";
        Stack<String> val = new Stack<>();
        for (int i = prefix.length()-1; i>=0; --i) {
            char ch = prefix.charAt(i);
            int ascii = (int) ch;
            if (Character.isLetterOrDigit(ch)) {
                String st = "" + ch;
                val.push((st));
            } else if (ch == '+') {
                String v1 = val.pop();
                String v2 = val.pop();
                String st = '(' + v1 + ch + v2 + ')';
                val.push(st);
            } else if (ch == '-') {
                String v1 = val.pop();
                String v2 = val.pop();
                String st = '(' + v1 + ch + v2 + ')';
                val.push(st);
            } else if (ch == '*') {
                String v1 = val.pop();
                String v2 = val.pop();
                String st = '(' + v1 + ch + v2 + ')';
                val.push(st);
            } else if (ch == '/') {
                String v1 = val.pop();
                String v2 = val.pop();
                String st = '(' + v1 + ch + v2 + ')';
                val.push(st);
            }
        }
        System.out.println(val.peek());
    }
}
