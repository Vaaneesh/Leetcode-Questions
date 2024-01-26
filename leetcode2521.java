import java.util.HashSet;
import java.util.*;

public class leetcode2521{
    public static boolean isPrime(int n){
        if(n<=1)
        return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0)
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter size");
        int n=ob.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=ob.nextInt();
        }
        HashSet<Integer>primes=new HashSet<>();
        for(int i=2;i<=1000;i++){
            if(isPrime(i)){
                primes.add(i);
            }
        }
        HashSet<Integer>set=new HashSet<>();
        for(int i:arr){
            for(int p:primes){
                if(i%p==0)
                set.add(p);
            }
        }
        System.out.println(set.size());
        ob.close();
    }
}