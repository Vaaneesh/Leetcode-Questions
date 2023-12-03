import java.util.*;

public class leetcode2486 {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter two strings");
        String s=ob.next();
        String t=ob.next();
        int j=0;
        ob.close();
        for(int i=0;i<s.length();i++){
            if(t.charAt(j)==s.charAt(i))
            j++;
            if(j==t.length()){
                System.out.println(0);
                return;
            }
        }
        System.out.println(t.length()-j);
    }
}
