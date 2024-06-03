import java.util.HashMap;
import java.util.Map;

class map1{
    public static void main(String[] args) {
        Map<String,Integer> mp=new HashMap<>() ;
        mp.put("Adnan",20);
        mp.put("Iqra",18);
        mp.put("Saboor", 21);
       
            System.out.println(mp.get("Adnan"));
            mp.remove("Adnan");
        mp.putIfAbsent("Gunda", 25);
        mp.putIfAbsent("Adnan", 21);
        System.out.println(mp.containsKey("Adnan"));
        System.out.println(mp.containsValue(20));
        for(String e : mp.keySet()) {
          System.out.println("Age of "+e+" is "+mp.get(e));
        }
        System.out.println();
        for(var e : mp.entrySet()) {
            System.out.println(e);
        //   System.out.println("Age of "+e+" is "+mp.get(e));
        }
        System.out.println();
        for(var e : mp.keySet()) {
        //  System.out.println(e);
         System.out.println("Age of "+e+" is "+mp.get(e));
        }
        System.out.println(mp.keySet());
        System.out.println(mp.values());

        
        

    
    }
}