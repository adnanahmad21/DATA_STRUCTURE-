import java.util.*;
public class set {
    public static void main(String[] args) {
        Set<Integer> set1=new TreeSet<>(); 
            
        
        set1.add(5);
        set1.add(2);
        set1.add(1);
        set1.add(5);
        set1.add(15);
        set1.add(50);
        set1.add(555);
        set1.add(-555);
     Iterator<Integer> itr=set1.iterator();
     for(var x: set1)
     System.out.println(x);
    // while(itr.hasNext())
    //   System.out.println(itr.next());
    
    //  while(itr.hasPrevious())
    //   System.out.println(itr.next());

    }}

