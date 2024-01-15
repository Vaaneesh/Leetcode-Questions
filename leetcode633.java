import java.util.*;
public class leetcode633{
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter no");
        int c=ob.nextInt();
        ob.close();
        int root=(int)Math.sqrt(c);
        long left=0;
        long right=root;
        while(left<=right){
            long sum=(left*left)+(right*right);
            if(sum==c){
                System.out.println(true);
                return ;
            }
            else if(sum<c)
            left++;
            else
            right--;
        }
        System.out.println(false);
 
    }
}