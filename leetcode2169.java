import java.util.Scanner;

public class leetcode2169{
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter n1 and n2");
        int n1=ob.nextInt();
        int n2=ob.nextInt();
        if(n1==0 || n2==0){
            System.out.println(0);
        }
        int c=0;
        while(n1!=0 || n2!=0){
            if(n1>n2){
                n1=n1-n2;
                c++;
            }
            else if(n1<n2){
                n2=n2-n1;
                c++;
            }
            else
            System.out.println(c+1);
        }
        ob.close();
    }
}