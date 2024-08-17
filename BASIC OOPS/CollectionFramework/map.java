import java.util.*;


public class map {
    public static void main(String[] args) {
        
        Map<String,Integer> map1=new TreeMap<>();
        map1.put("Adnan", 19);
        map1.put("Iqra", 18);
        map1.put("Abdus", 21);
        map1.put("Anupam", 21);
        map1.put("Rahull", 22);
        map1.put("JAi", 23);
        map1.put("Sparsh", 150);
        map1.remove("Rahull");
        System.out.println(map1);
        System.out.println(map1.containsKey("Adnan"));
        Set set=map1.entrySet();
        Iterator itr=set.iterator();
        while (itr.hasNext()) {
            var x=(Map.Entry)itr.next();
            System.out.println(x.getKey()+"="+x.getValue());
            
        }
    //     for(Map.Entry x : map1.entrySet())
    //    System.out.println(x.getKey()+"="+x.getValue());
    }

}
