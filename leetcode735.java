import java.util.Scanner;
import java.util.Stack;

public class leetcode735 {
    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer>st=new Stack<>();
        for(int i:asteroids){
            if(i>0){
                st.push(i);
            }
            else{
                while(!st.isEmpty() && st.peek()>0 && st.peek()<Math.abs(i)){
                    st.pop();
                }
                if(st.isEmpty() || st.peek()<0){
                    st.push(i);
                }
                if(st.peek()==Math.abs(i))
                st.pop();
            }
        }
        return st.stream().mapToInt(i->i).toArray();
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter size and elee");
        int n=ob.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=ob.nextInt();
        }
        System.out.println(asteroidCollision(arr).toString());
        ob.close();
    }
}
