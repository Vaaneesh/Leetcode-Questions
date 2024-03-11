import java.util.Scanner;

public class leetcode791{
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter order");
        String order=ob.nextLine();
        System.out.println("Enter string");
        String s=ob.nextLine();
        int map[]=new int[26];
        for(int i=0;i<s.length();i++){
            map[s.charAt(i)-'a']++;
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<order.length();i++){
            for(int j=0;j<map[order.charAt(i)-'a'];j++){
                sb.append(order.charAt(i));
            }
            map[order.charAt(i)-'a']=0;
        }
        for(int i=0;i<26;i++){
            for(int j=0;j<map[i];j++){
                sb.append((char)'a'+i);
            }
        }
        System.out.println(sb.toString());
        ob.close();
    }
}