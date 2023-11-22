import java.util.*;
public class leetcode2427{
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter a and b");
        int a=ob.nextInt();
        int b=ob.nextInt();
        int max=Math.max(a,b);
        int c=0;
        for(int i=1;i<=max;i++){
            if(a%i==0 && b%i==0)
            c++;
        }
        System.out.println(c);
        ob.close();
    }
}