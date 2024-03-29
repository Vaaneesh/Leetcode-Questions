import java.util.Scanner;

public class leetcode316{
        public static String removeDuplicateLetters(String s) {
            int count[]=new int[26];
            int pos=0;
            for(int i=0;i<s.length();i++)
            count[s.charAt(i)-'a']++;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)<s.charAt(pos))
                pos=i;
                if(--count[s.charAt(i)-'a']==0) break;
            }
            return s.length()==0?"":s.charAt(pos)+removeDuplicateLetters(s.substring(pos+1).replaceAll(""+s.charAt(pos),""));
        }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter string");
        String s=ob.next();
        System.out.println(removeDuplicateLetters(s));
        ob.close();
    }
}