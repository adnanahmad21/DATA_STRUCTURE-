import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class lambdaexpression {
    public static void main(String[] args) {

//  List<String> list=Arrays.asList("Iqra","Adnan","Saboor","Jai");
//   Collections.sort(list,(a,b)-> a.compareTo(b));
// System.out.println(list);


    lambdaexpressioneg ex=(row,col)->{
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print("@");
            }
            System.out.println();
        }
    };
    ex.patternprint(3,4);
    

        }
    }

interface lambdaexpressioneg{
    void patternprint(int row,int col);
    
}
