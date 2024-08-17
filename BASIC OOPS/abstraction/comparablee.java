import java.util.*;

class comparablee  {
    public static void main(String[] args) {
        List<Student> list=new LinkedList<>();
        list.add(new Student("Adnan",21));
        list.add(new Student("Rahul",23));
        list.add(new Student("Iqra",19));
        Collections.sort(list);
        System.out.println(list);
    }

    
}

class Student implements Comparable<Student> {
    String name;
    int id;

    Student(String name, int id) {
        this.name = name;
        this.id = id;

    }

    public String toString() {
        return name + " " + id;
    }

    public int compareTo(Student obj) {
        return this.id - obj.id;
    }

}