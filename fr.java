import java.util.Scanner;

public class fr {
    public static int cntmax(int[]a,int n){
        int cnt[]=new int[n+1];
        for(int i=0;i<a.length;i++){
            cnt[a[i]]+=1;
        }
        int max=0;
        int ans=0;
        for(int i=0;i<cnt.length;i++){
            if(cnt[i]>max){
                max=cnt[i];
                ans=i;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size =sc.nextInt();
        int n=sc.nextInt();
        int a[]=new int [size];
        for(int i=0;i<size;i++){
            a[i]=sc.nextInt();
        }
        System.out.println(cntmax(a, n));


    }
}
