import java.util.Scanner;

public class leetcode1221 {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter string containing only R & L");
        String s=ob.next();
        int res=0,sum=0;
        for(char ch:s.toCharArray()){
            sum+=(ch=='R'?1:-1);
            if(sum==0)
            res++;
        }
        System.out.println(res);
        ob.close();
    }
}
