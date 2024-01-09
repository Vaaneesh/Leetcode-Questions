import java.util.Scanner;

public class leetcode647 {
    public static void main(String args[]){
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter string");
        String s=ob.next();
        int ans=0;
        for(int i=0;i<s.length();i++){
            int count=1;
            for(int j=i+1;j<s.length();j++){
                if (check(s,i,j)) 
                count++;
            }
            ans+=count;
        }
        System.out.println(ans);
        ob.close();
    }
    public static boolean check(String s,int left,int right){
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
                left++;
                right--;
        }
            return true;
    }
    
}
