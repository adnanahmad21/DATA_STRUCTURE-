import java.io.*;

public class filecopy {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("ab1.txt");
            BufferedReader bfr = new BufferedReader(fr);
            String x = "";
        int line = bfr.read();
            while (line != -1) {
        
              x=x+bfr.readLine();
                line = bfr.read();
            }
            fr.close();
           
            bfr.close();
        
            FileWriter fw = new FileWriter("ab2.txt");
            BufferedWriter bfw = new BufferedWriter(fw);
            for (int i = 0; i < x.length(); i++) {
                bfw.write(x.charAt(i));
                bfw.flush();
            }
            fw.close();
           
            bfw.close();

        } catch (Exception e) {
            System.out.println(e);
        } finally {

        }
    }
}
