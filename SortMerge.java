import java.util.Arrays;
import java.util.Scanner;

public class SortMerge {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int i;
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int si=0,ei=a.length-1;
        mergeSort(a, si, ei);
        //stem.out.println(Arrays.toString(a));
    }
    public static void mergeSort( int a[],int si,int ei){
            if(si >= ei) return;
            int mid=(si+ei)/2;
            mergeSort(a, si, mid);
            mergeSort(a, mid+1, ei);
            merge(a,si,mid,ei);
    }
    private static void merge(int[] a, int si, int mid, int ei) {
        int []na=new int[ei-si+1];
        int index1=si;
        int index2=mid+1;
        int i=0;
        while(index1<=mid&&index2<=ei){
            if(a[index1]<=a[index2]){
                na[i++]=a[index1++];
            }else{
                na[i++]=a[index2++];
            }
        }

        while(index1<=mid)na[i++]=a[index1++];
        while(index2<=ei) na[i++]=a[index2++];

        for(int v:na) a[si++]=v;

        // for(int s=si;s<=ei;s++)
        // {
        //     a[s] = na[s - si];
        // }
        System.out.println(Arrays.toString(a));
        
    }
}
