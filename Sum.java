import java.util.Scanner;
public class Sum{
    public static void main(String[] args) {
        int n;
        int sum=0,rem=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = sc.nextInt();
        while(n!=0){
            rem = n%10;
            sum=sum+rem;
            n=n/10;
        }
        System.out.println(sum);
        sc.close();
    }
    
}
