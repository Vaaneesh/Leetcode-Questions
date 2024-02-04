import java.util.HashMap;
import java.util.Scanner;

public class leetcode1525 {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter String");
        String s=ob.next();
        HashMap<Character,Integer>left=new HashMap<>();
        HashMap<Character,Integer>right=new HashMap<>();
        for(int i=0;i<s.length();i++){
            right.put(s.charAt(i),right.getOrDefault(s.charAt(i),0)+1);
        }
        int count=0;
        for(int i=0;i<s.length();i++){
            left.put(s.charAt(i),left.getOrDefault(s.charAt(i), 0)+1);
            right.put(s.charAt(i),right.getOrDefault(s.charAt(i), 0)-1);
            if(right.get(s.charAt(i))==0)
            right.remove(s.charAt(i));
            if(right.size()==left.size())
            count++;
        }
        System.out.println(count);
        ob.close();
    }
}
