import java.util.HashSet;
import java.util.Scanner;
import java.util.Stack;

public class leetcode1249 {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter string");
        String str=ob.next();
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(Character.isAlphabetic(ch))
            continue;
            if(ch=='(')
            st.push(i);
            else{
                if(!st.isEmpty() && str.charAt(st.peek())=='(')
                st.pop();
                else
                st.push(i);
            }
        }
        HashSet<Integer>set=new HashSet<>(st);
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(!set.contains(i)){
                sb.append(str.charAt(i));
            }
        }
        System.out.println(sb.toString());
        ob.close();
    }
}
