import java.util.Scanner;

public class leetcode557 {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter string");
        String s=ob.next();
        String str[]=s.split(" ");
        String ans="";
        for(String word:str){
            StringBuilder sb=new StringBuilder(word);
            ans+=sb.reverse().toString()+" ";
        }
        System.out.println(ans.trim());
        ob.close();
    }
}
