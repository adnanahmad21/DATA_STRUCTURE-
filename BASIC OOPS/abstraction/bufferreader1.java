import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.lang.*;


public class bufferreader1 {
  public static void main(String[] args)  {
    // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    TreeSet<Integer> tree = new TreeSet<>();
    // for (int i = 0; i < 10; i++) {
    //   String z;
    //   try {
    //     z = br.readLine();
    //   } catch (IOException e) {
    //     e.printStackTrace();
    //   }
    //   tree.add(Integer.parseInt(z));
    // }
    tree.add(5);
    tree.add(5);
    tree.add(5);
    tree.add(5);
    tree.add(5);

    System.out.println(tree);

  }
}
