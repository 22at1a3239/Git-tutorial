import java.util.Scanner;

public class ap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<=2;i++){
            int a1=sc.nextInt();
            int a2=sc.nextInt();
            int a3=sc.nextInt();
            int d=a3-a2;
            int r=a3/a2;
            if((a2-a1)==(a3-a2)){
                System.out.println("AP "+(a3+d));
            }
            else if(a3/a2==a2/a1){
                System.out.println("GP "+a3*r);
            }else{
                System.out.println(" ");
            }
        }
        
    }
}
