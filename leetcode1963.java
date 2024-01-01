import java.util.Scanner;
import java.util.Stack;

public class leetcode1963 {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter string");
        String s=ob.next();
        int count=0;
        Stack<Character>st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='[')
            st.push(ch);
            else{
                if(!st.isEmpty())
                st.pop();
                else
                count++;
            }
        }
        System.out.println((count+1)/2);
        ob.close();
    }
}
