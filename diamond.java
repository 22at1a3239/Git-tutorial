import java.util.Scanner;

public class diamond {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i,j;
        for(i=1;i<=n;i++){
            for(j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(j=1;j<=2*i-1;j++){
                if(j==1||j==2*i-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        int x=2*n-3;
        for(i=1;i<=n-1;i++){
            for(j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(j=1;j<=x;j++){
                if(j==1||j==x){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
            x-=2;
        }
    }
}
