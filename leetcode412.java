import java.util.LinkedList;
import java.util.Scanner;

public class leetcode412 {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n;
        System.out.println("enter no");
        n=ob.nextInt();
        ob.close();
        LinkedList<String>li=new LinkedList<>();
        for(int i=1;i<=n;i++){
            if(i%15==0)
            li.add("FizzBuzz");
            else if(i%3==0)
            li.add("Fizz");
            else if(i%5==0)
            li.add("Buzz");
            else 
            li.add(String.valueOf(i));
        }
        System.out.println(li);
    }
}
