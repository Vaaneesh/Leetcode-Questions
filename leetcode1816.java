import java.util.*;

public class leetcode1816 {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter string");
        String s=ob.nextLine();
        System.out.println("Enter key");
        int key=ob.nextInt();
        ob.close();
        String str[]=s.split(" ");
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<key;i++){
            if(i<str.length){
                sb.append(str[i]).append(" ");
            }
        }
        System.out.println(sb.toString().trim());

    }
}
