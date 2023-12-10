import java.util.Scanner;

public class leetcode2390 {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter string");
        String str=ob.next();
        ob.close();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='*')
            sb.deleteCharAt(sb.length()-1);
            else
            sb.append(str.charAt(i));
        }
        System.out.println(sb);
    }
}
