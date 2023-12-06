import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class leetcode890 {
    public boolean check(String a,String b){
        for(int i=0;i<a.length();i++){
            if(a.indexOf(a.charAt(i))!=b.indexOf(b.charAt(i)))
            return false;
        }
        return true;
    }
    public  void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter size of arr");
        int n=ob.nextInt();
        String arr[]=new String[n];
        System.out.println("Enter elements");
        for(int i=0;i<n;i++){
            arr[i]=ob.next();
        }
        System.out.println("Enter pattern");
        String pattern=ob.next();
        List<String>ans=new ArrayList<>();
        for(String word:arr){
            if(check(word,pattern))
            ans.add(word);
        }
        System.out.println(ans);
        ob.close();
    }
}
