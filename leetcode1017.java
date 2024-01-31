import java.util.Scanner;

public class leetcode1017 {
    public static String base2neg(int n){
        StringBuilder sb=new StringBuilder();
        if(n==0){
            return "0"; 
        }
        while(n!=0){
            int r=n%-2;
            n/=-2;
            if(r<0){
                r+=2;
                n+=1;
            }
            sb.append(r);
        }
        return sb.reverse().toString();
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter no");
        int n=ob.nextInt();
        System.out.println(base2neg(n));
        ob.close();
    }
}
