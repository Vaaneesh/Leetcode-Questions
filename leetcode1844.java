import java.util.Scanner;

public class leetcode1844 {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter string");
        String s=ob.next();
        char ch[]=s.toCharArray();
        for(int i=1;i<ch.length;i+=2){
            ch[i]+=ch[i-1]-'0';
        }
        System.out.println(new String(ch));
        ob.close();
    }
}
