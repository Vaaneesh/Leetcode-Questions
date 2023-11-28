import java.util.*;

public class leetcode1769 {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter boxes with balls");
        String boxes=ob.next();
        ob.close();
        int arr[]=new int[boxes.length()];
        for(int i=0;i<boxes.length();i++){
            int t=0;
            for(int j=0;j<boxes.length();j++){
                char ch=boxes.charAt(j);
                if(ch=='1')
                t+=Math.abs(i-j);
            }
            arr[i]=t;
        }
        System.out.println(Arrays.toString(arr));
    }
}
