import java.util.Scanner;

public class leetcode991 {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter start value");
        int startValue=ob.nextInt();
        System.out.println("Enter target");
        int target=ob.nextInt();
        int ans=0;
        while(startValue<target){
            ans++;
            if(target%2>0)
            target++;
            else
            target/=2;
        }
        System.out.println(startValue-target+ans);
        ob.close();
    }
}
