import java.util.Scanner;

public class Array_01 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        char [] a=new char[n];
        char c='A';
        for(int i=0;i<=n-1 && c<='z';i++){
            a[i]=c;
            System.out.println(a[i]+"->"+(i+1));
            c++;
            }
/*
int[] a=new int[3];
a[0]=10;
a[1]=20;
a[2]=30;

 */
//System.out.println("["+a[0]+","+a[1]+","+a[2]+"]");
        System.out.print("[");
for(int i=0;i<a.length;i++){
   System.out.print(a[i]);
   if(i!=a.length-1){
       System.out.print(",");
   }
}
        System.out.print("]");
System.out.println();

int[] b={3,5,4,8,7,9,1,3};
boolean re=(b[0]==b[b.length-1]);
System.out.println(re);
if(re){
    System.out.println("it is equal");
}

//write a program to print array elements in reverse order
        for(int i=b.length-1;i>=0;i--){
            System.out.println(b[i]);
        }
        //write a program to find sum of all the elements in array
        int sum=0;
        for(int i=0;i<=b.length-1;i++){
            sum+=b[i];
        }
        System.out.println(sum);
    }

    }

