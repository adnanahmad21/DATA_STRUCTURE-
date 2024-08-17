import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class trywithresources {
    public static void main(String[] args) {
        
        try( BufferedWriter  bfr=new BufferedWriter(new FileWriter("a.txt",false));)
       {
        String s="i love u";
        for(int i=0;i<s.length();i++){
            bfr.write(s.charAt(i));
        }
 
     


        }
        catch(Exception e){
            System.out.println(e);
        }

    }
}
