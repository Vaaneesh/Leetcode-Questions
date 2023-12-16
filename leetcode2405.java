import java.util.HashSet;
import java.util.Scanner;

public class leetcode2405 {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter string");
        String s=ob.next();
        int count=0;
        HashSet<Character>set=new HashSet<>();
        for(int i=0;i<s.length();i++){
            if(set.add(s.charAt(i))){
                continue;
            }
            else{
                count++;
                set.clear();
                set.add(s.charAt(i));
            }
        }
        System.out.println(count+1);
        ob.close();
    }
}
