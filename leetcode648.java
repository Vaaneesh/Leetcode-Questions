import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class leetcode648 {
    public String replaceWords(List<String> dictionary, String sentence) {
        HashSet<String>set=new HashSet<>();
        for(String i:dictionary){
            set.add(i);
        }
        StringBuilder sb=new StringBuilder();
        String word[]=sentence.split(" ");
        for(int i=0;i<word.length;i++){
            String prefix="";
            for(int j=1;j<=word[i].length();j++){
                prefix=word[i].substring(0,j);
                if(set.contains(prefix))
                break;
            }
            if(sb.length()>0)
                sb.append(" ");
            sb.append(prefix);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter size");
        ob.close();
    }
}
