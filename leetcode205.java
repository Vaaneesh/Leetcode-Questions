import java.util.Scanner;

public class leetcode205 {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter two strings");
        String s=ob.next();
        String t=ob.next();
        ob.close();
        if(s.length()!=t.length()){
            System.out.println("false");
            return;
        }
        int arr1[]=new int[256];
        int arr2[]=new int[256];
        for(int i=0;i<s.length();i++){
            if(arr1[s.charAt(i)]!=arr2[t.charAt(i)]){
                System.out.println("false");
                return;
            }
            arr1[s.charAt(i)]=i+1;
            arr2[t.charAt(i)]=i+1;
        }
        System.out.println("true");
    }
}
