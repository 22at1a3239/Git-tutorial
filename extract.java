import java.util.Scanner;
public class extract {
    public static String  cb(int n){
        String s="";
        while(n>=1){
            s+=n%2;
            n=n/2;
        }
        String r=new StringBuilder(s).reverse().toString();
        return r;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String []a=s.split("/");
        int date=Integer.parseInt(a[0]);
        int month=Integer.parseInt(a[1]);
        int year=Integer.parseInt(a[2]);
        String db=cb(date);
        String mb=cb(month);
        String yb=cb(year);
        System.out.println(db+"/"+mb+"/"+yb);
        
    }
}
