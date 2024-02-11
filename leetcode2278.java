import java.util.Scanner;

public class leetcode2278 {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter string");
        String s=ob.next();
        System.out.println("Enter letter");
        char ch=ob.next().charAt(0);
        int c=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==ch)
            c++;
        }
        System.out.println((c*100)/s.length());
        ob.close();
    }
}
