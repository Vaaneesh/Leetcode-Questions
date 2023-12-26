import java.util.Scanner;

public class leetcode1641 {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter no");
        int n=ob.nextInt();
        int a=1,e=1,i=1,o=1,u=1;
        while(--n>0){
            o+=u;
            i+=o;
            e+=i;
            a+=e;
        }
        System.out.println(a+e+i+o+u);
        ob.close();
    }
}
