import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class stockSpan {
  Stack<int[]> st = new Stack<>();

  public int next(int price) {

    int ans = 1;
    while (st.size() > 0 && st.peek()[0] < price)
      ans += st.pop()[1];
    st.push(new int[] { price, ans });
    return ans;
  }

  public static void main(String[] args) {
    // int price[] = { 100, 80, 60, 70, 60, 75, 85 };
    // int res[] = calculateSpan(price, price.length);
    // System.out.println(Arrays.toString(res));
    stockSpan ss = new stockSpan();
    List<Integer> l = new ArrayList<>();

    l.add(ss.next(100));
    l.add(ss.next(80));
    l.add(ss.next(60));
    l.add(ss.next(70));
    l.add(ss.next(60));
    l.add(ss.next(75));
    l.add(ss.next(85));
    System.out.println(l);

  }
}
