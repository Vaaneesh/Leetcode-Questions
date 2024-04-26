import java.util.Scanner;
import java.util.Stack;

public class leetcode32 {
    public static int validParenthesis(String s){
        int max=0;
        Stack<Integer>st=new Stack<>();
        st.push(-1);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(')
            st.push(i);
            else{
                st.pop();
                if(st.isEmpty())
                st.push(i);
                max=Math.max(max,i-st.peek());
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter string");
        String s=ob.next();
        System.out.println(validParenthesis(s));
        ob.close();
    }
}
