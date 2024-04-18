import java.util.Scanner;

public class leetcode767 {
    public static String rearrange(String s){
        int freq[]=new int[26];
        char arr[]=s.toCharArray();
        for(int i=0;i<arr.length;i++){
            freq[arr[i]-'a']++;
        }
        int max=0,letter=0;
        for(int i=0;i<26;i++){
            if(max<freq[i]){
                max=freq[i];
                letter=i;
            }
        }
        if(max>(s.length()+1)/2)
        return "";

        char ans[]=new char[s.length()];
        int ind=0;
        while(freq[letter]>0){
            ans[ind]=(char)(letter+'a');
            ind+=2;
            freq[letter]--;
        }
        for(int i=0;i<26;i++){
            while(freq[i]>0){
                if(ind>=s.length())
                ind=1;
                ans[ind]=(char)(i+'a');
                ind+=2;
                freq[i]--;
            }
        }
        return String.valueOf(ans);
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter String");
        String s=ob.next();
        System.out.println(rearrange(s));
        ob.close();
    }
}
