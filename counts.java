import java.util.Scanner;

public class counts {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a[][]=new int[n][m];
        int i,j,k;
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                a[i][j]=sc.nextInt();
            }
        }
        int size =sc.nextInt();
        int b[]=new int[size];
        for(i=0;i<size;i++){
            b[i]=sc.nextInt();
        }
        for(i=0;i<n;i++){
            int c=0;
            for(j=0;j<m;j++){
                int t=a[i][j];
                for(k=0;k<size;k++){
                    if(b[k]==t){
                        c++;
                    }
                }
            }
            System.out.println(c);
        }
    }
}
