import java.util.Scanner;

public class gabriel_lame {
    public static int gcd(int a,int b){
        while(a!=0&&b!=0){
            if(a>b){
                a=a%b;
            }else{
                b=b%a;
            }
        }
        return Math.max(a,b);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(gcd(a, b));

    }
}
