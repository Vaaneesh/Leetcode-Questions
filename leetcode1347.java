import java.util.Scanner;

public class leetcode1347 {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        String s,t;
        System.out.println("Enter two strings");
        s=ob.next();
        t=ob.next();
        int arr[]=new int[26];
        for(char ch:s.toCharArray()){
            arr[ch-'a']++;
        }
        int ans=0;
        for(char ch:t.toCharArray()){
            if(arr[ch-'a']==0)
            ans++;
            else
            arr[ch-'a']--;
        }
        System.out.println(ans);
        ob.close();
    }
}
