import java.util.Scanner;

public class leetcode2375 {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter string");
        String s=ob.next();
        StringBuilder ans=new StringBuilder(),st=new StringBuilder();
        for(int i=0;i<=s.length();i++){
            st.append((char)('1'+i));
            if(i==s.length()|| s.charAt(i)=='I'){
                ans.append(st.reverse());
                st=new StringBuilder();
            }
        }
        System.out.println(ans.toString());
        ob.close();
    }
}
