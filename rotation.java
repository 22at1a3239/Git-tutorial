import java.util.Scanner;

public class rotation {
    public static int pow(int a,int b){
        int ans=1;
        int x=a;
        for(int i=0;i<=31;i++){
            if(((b&(1<<i))>0)) ans*=x;
            x*=x;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(pow(n, b));
    }
}
