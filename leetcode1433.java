import java.util.Scanner;

public class leetcode1433 {
    public static boolean check(String s1,String s2){
        char c1[]=s1.toCharArray();
        char c2[]=s2.toCharArray();
        int more=0;
        int less=0;
        for(int i=0;i<c1.length;i++){
            int diff=c1[i]-c2[i];
            if(diff>=0) 
            more++;
            if(diff<=0)
            less++;
        }
        return less==c2.length || more==c1.length;
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter both strings");
        String s1=ob.next();
        String s2=ob.next();
        System.out.println(check(s1, s2));
        ob.close();
    }
}
