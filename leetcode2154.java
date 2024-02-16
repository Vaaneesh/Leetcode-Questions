import java.util.*;;
public class leetcode2154 {
    public static int check(int arr[],int n){
        HashSet<Integer>set=new HashSet<>();
        for(int i:arr){
            if(i>n)
            set.add(i);
        }
        while(true){
            if(set.contains(n))
            n*=2;
            else break;
        }
        return n;
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter size");
        int n=ob.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter ele");
        for(int i=0;i<n;i++){
            arr[i]=ob.nextInt();
        }
        System.out.println("Enter original val");
        int original=ob.nextInt();
        System.out.println(check(arr, original));
        ob.close();
    }
}
