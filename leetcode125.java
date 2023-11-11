import java.util.Scanner;

public class leetcode125{
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter string");
        String s=ob.next();
        ob.close();
        int l=s.length();
        s.toLowerCase();
        String ans="";
        for(int i=0;i<l;i++){
            if(Character.isLetterOrDigit(s.charAt(i)))
            ans+=s.charAt(i);
        }
        int j=ans.length()-1;
        for(int i=0;i<ans.length()/2;i++){
            if(ans.charAt(i)!=ans.charAt(j)){
                System.out.println("false");
                return;
            }
        }
        System.out.println("true");
    }
}