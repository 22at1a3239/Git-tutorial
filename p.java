import java.util.Scanner;

public class p {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Starting  number :");
        int n=sc.nextInt();
        System.out.println("Enter The next  number :");
        int m=sc.nextInt();
        int i,j;
        for(i=n;i<=m;i++){
            for(j=2;j<i;j++){
                if(j%i!=0){
                    System.out.print(i);

                }
            }
        }

    }
}
