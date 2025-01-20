import java.util.Arrays;
import java.util.Scanner;

public class r {
    //ROTATION OF ARRAY
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]={1,2,3,4,5,6,7};
        int k=sc.nextInt();
        for(int i=0;i<k;i++){
            int t=a[a.length-1];
            for(int j=a.length-2;j>=0;j--){
                
                a[j+1]=a[j];
            }
            a[0]=t;
        }
        System.out.println(Arrays.toString(a));
    }
}
