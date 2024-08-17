import java.util.Iterator;
import java.util.LinkedList;

record StudentInfo(String name, int id) {

}

public class record1 {
    public static void main(String[] args) {
        LinkedList<StudentInfo> l1 = new LinkedList<>();
        l1.add(new StudentInfo("ADNAN", 5122));
        l1.add(new StudentInfo("ADNAN", 5122));
        l1.add(new StudentInfo("ADNAN", 5122));
        l1.add(new StudentInfo("ADNAN", 5122));
        l1.add(new StudentInfo("ADNAN", 5122));
        l1.add(new StudentInfo("ADNAN", 5122));
        l1.add(new StudentInfo("ADNAN", 5122));
        l1.add(new StudentInfo("ADNAN", 5122));
        l1.add(new StudentInfo("ADNAN", 5122));
        l1.add(new StudentInfo("ADNAN", 5122));
        l1.add(new StudentInfo("ADNAN", 5122));
        l1.add(new StudentInfo("ADNAN", 5122));

        for (var x : l1) {
            System.out.println(x);
        }
    }
}
