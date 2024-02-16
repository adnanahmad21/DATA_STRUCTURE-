import java.util.*;
public class longestCommonsubsequece {
    public  static int longestCommonSubsequence(String text1, String text2) {
        Stack<Character> st=new Stack<>();
        char s1,s2;
        int ans=0;
        if(text1.equals(text2) ) return text1.length(); 
        int i=0;
        int n1=text1.length();
        int n2=text2.length();
        if(n1>=n2 ){
            while(i<n1){
                st.push(text1.charAt(i));
                i++;
            }
        }
            else if(n1<n2){
            while(i<n2){
                st.push(text2.charAt(i));
                i++;
            }
        }
        for( i=n2-1;i>=0;i--){
            s2=text2.charAt(i);
            if(st.peek()==s2){
                st.pop();
            }
            else if(st.peek())
        }
        return ans;
    
    }
    public static void main(String[] args) {
       
       String  text1="abcde";
       String text2="abc";
       int ans=longestCommonSubsequence(text1, text2);



    }
}
