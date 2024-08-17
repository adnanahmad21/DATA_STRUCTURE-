import java.util.*;

public class streamapi {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
 int sum=list.stream().filter(n->n%2==0).mapToInt(Integer:: intVaue).sum();
    }
}
