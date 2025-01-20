import java.util.*;

public class bs {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int[] A=new int[n];
       int index=0;
       for(int i=0;i<n;i++){
        A[i]=sc.nextInt();
       }
       System.out.println(Arrays.toString(A));
       for(int k=0;k<n;k++){
        
        for(int j=0;j<n-1;j++){
            if(A[j+1]<A[j]){
                int t=A[j];
                A[j]=A[j+1];
                A[j+1]=t;
        
            }
       }
       }
       for(i=0;i<n;i++){
        System.out.println(a[i+""]);
       }
       System.out.println(Arrays.toString(A));


    }
    
}
