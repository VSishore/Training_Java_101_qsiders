import java.util.Scanner;

public class Challenge {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number: ");int n=sc.nextInt();
        while(n>10){
            n= iterate(n);
        }
        String result=(n==1) ?("It is YES"):("It is NO");
        System.out.println(result);
    }
    public static int iterate(int a){
        int sum=0;
        while(a!=0){
            int r=a%10;
            sum+=r*r;
            a/=10;
        }
        return sum;
    }
}
