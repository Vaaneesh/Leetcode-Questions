import java.util.Scanner;

public class leetcode1689 {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter string");
        String str=ob.next();
        ob.close();
        int max=Integer.MIN_VALUE;
        char arr[]=str.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]-'0')
            max=arr[i]-'0';
        }
        System.out.println(max);
    }
}
