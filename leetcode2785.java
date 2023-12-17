import java.util.Arrays;
import java.util.Scanner;

public class leetcode2785 {
    public static boolean checkVowel(char ch){
        return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U');
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter a string");
        String s=ob.next();
        StringBuilder temp=new StringBuilder();
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(checkVowel(s.charAt(i))){
                temp.append(s.charAt(i));
            }
        }
        char arr[]=temp.toString().toCharArray();
        Arrays.sort(arr);
        int j=0;
        for(int i=0;i<s.length();i++){
            if(checkVowel(s.charAt(i))){
                ans.append(arr[j]);
                j++;
            }
            else ans.append(s.charAt(i));
        }
        System.out.println(ans.toString());
        ob.close();
    }
}
