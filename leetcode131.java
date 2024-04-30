import java.util.*;

public class leetcode131 {
    public static List<List<String>> partition(String s){
        List<List<String>>ans=new ArrayList<>();
        List<String>str=new ArrayList<>();
        palindrome(0,str,ans,s);
        return ans;
    }
    public static void palindrome(int ind,List<String>str,List<List<String>>ans,String s){
        if(ind==s.length()){
            ans.add(new ArrayList<>(str));
            return;
        }
        for(int i=ind;i<s.length();i++){
            if(checkPalindrome(s,ind,i)){
                str.add(s.substring(ind, i+1));
                palindrome(i+1, str, ans, s);
            }
        }
    }
    public static boolean checkPalindrome(String s,int low,int high){
        while(low<=high){
            if(s.charAt(low)!=s.charAt(high))
            return false;
            high--;
            low++;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter string");
        String s=ob.next();
        System.out.println(partition(s));
        ob.close();
    }
}
