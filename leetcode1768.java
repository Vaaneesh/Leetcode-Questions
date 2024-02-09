import java.util.Scanner;

public class leetcode1768 {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter two strings");
        String s1=ob.next();
        String s2=ob.next();
        int i=0;
        StringBuilder sb=new StringBuilder();
        while(i<s1.length()||i<s2.length()){
            if(i<s1.length())
            sb.append(s1.charAt(i));
            if(i<s2.length())
            sb.append(s2.charAt(i));
            i++;
        }
        System.out.println(sb.toString());
        ob.close();
    }
}
