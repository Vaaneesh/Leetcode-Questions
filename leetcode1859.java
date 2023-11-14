import java.util.Scanner;

public class leetcode1859 {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        String s;
        System.out.println("enter string");
        s=ob.next();
        ob.close();
        String str[]=s.split(" ");
        String arr[]=new String[str.length];
        for(String word:str){
            int ind=word.charAt(word.length()-1)-'0';
            String ans=word.substring(0, word.length()-1);
            arr[ind-1]=ans;
        }
        System.out.println(arr);
    }
}
