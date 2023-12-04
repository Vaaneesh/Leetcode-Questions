import java.util.Scanner;

public class leetcode12 {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n;
        System.out.println("Enter no");
        n=ob.nextInt();
        int[] val= {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] roman= {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V"
        ,"IV", "I"};
        StringBuilder sb=new StringBuilder();
        int i=0;
        while(n>0){
            if(n>=val[i]){
                sb.append(roman[i]);
                n-=val[i];
            }
            else i++;
        }
        System.out.println(sb.toString());
        ob.close();
    }
}
