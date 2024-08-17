import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.jar.Attributes.Name;

class Student {
    String name;
    int roll;
    int age;

    Student(String name, int roll, int age) {
        this.name = name;
        this.roll = roll;
        this.age = age;
    }

    @Override
    public String toString() {
        return age + " " + name + " " + roll;
    }


}
class NameSort implements Comparator<Student>{
    @Override
    public int compare(Student o1,Student o2){
   return o1.name.compareTo(o2.name);
    }
}
class RollSort implements Comparator<Student>{
    @Override
    public int compare(Student o1,Student o2){
 return o1.roll-o2.roll;
    }
}
class AgeSort implements Comparator<Student>{
    @Override
    public int compare(Student o1,Student o2){
            return o1.age-o2.age;
    }
}


public class comparator {
    public static void main(String[] args) {
        List<Student> l1 = new LinkedList<>();
        l1.add(new Student("Adnan", 1, 20));
        l1.add(new Student("Iqra", 1, 18));
        l1.add(new Student("Abdus", 2, 21));
        l1.add(new Student("Anupam", 6, 22));
        l1.add(new Student("Jai", 3, 20));
        l1.add(new Student("Sparsh", 5, 19));
        // System.out.println("Before Sort");
    var itr=l1.iterator();
      
        // Collections.sort(l1,new RollSort());
        Collections.sort(l1,new NameSort());
        // Collections.sort(l1,new AgeSort());

        // System.out.println("After Sort");
        while(itr.hasNext())
        System.out.println(itr.next());
    }
}



