//palindrome String
class palindrome {

    public static void main(String[] args) {
        String str = "abcba";
        int x=0;
        int j = str.length() - 1;
        for (int i = 0; i < str.length(); i++, j--) {
            if (str.charAt(i) == str.charAt(j)) {
                continue;
            } else {
                x++;
                break;
            }
        }
        if(x==0) System.out.println("Palindrome");
        else System.out.println(" Not Palindrome");
    }
}
