import java.util.Arrays;
import java.util.Scanner;

public class isomorphic {
    public static  boolean isIsomorphic(String s, String t) {
        int []a=new int[26];
        int []b=new int[26];
        int indx;
        for(int i=0;i<s.length();i++ ){
            indx=s.charAt(i)-'a';
            a[indx]+=1;
        }
        for(int i=0;i<t.length();i++ ){
            indx=t.charAt(i)-'a';
            b[indx]+=1;
        }
        int c=0,c1=0;
        for(int i=0;i<26;i++){
            if(a[i]!=0)c++;
            if(b[i]!=0)c1++;
        }
       
        
        return c==c1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String t=sc.next();
        System.out.println(isIsomorphic(s,t));
    }
}
