import java.util.Scanner;

public class leetcode344 {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter size");
        int n=ob.nextInt();
        char ch[]=new char[n];
        for(int i=0;i<n;i++){
            ch[i]=ob.next().charAt(0);
        }
        int j=n-1;
        for(int i=0;i<n/2;i++){
            char temp=ch[i];
            ch[i]=ch[j];
            ch[j]=temp;
            j--;
        }
        System.out.println((ch));
        ob.close();
    }
}
