public class removeA {
    static  String remove(String s,int i,String ans){
        if(i==s.length()) return ans;
        if(s.charAt(i)!='a') 
         ans=ans+s.charAt(i);
         return remove(s, i+1, ans);
    }
    public static void main(String[] args) {
        String s="baccaaaaaaaaaaaaaaaaaaad";
        String ans=remove(s,0,"");
        System.out.println(ans);
    }
}
