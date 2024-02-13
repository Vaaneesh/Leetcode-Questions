import java.util.Scanner;

public class leetcode2283 {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter string");
        String s=ob.next();
        ob.close();
        int index[]=new int[10];
        for(char ch:s.toCharArray()){
            index[ch-'0']++;
        }
        for(int i=0;i<s.length();i++){
            if(Character.getNumericValue(s.charAt(i))!=index[i]){
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
    }
}
