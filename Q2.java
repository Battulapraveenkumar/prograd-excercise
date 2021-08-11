import java.util.*;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int even=0, odd=0;
        int n= sc.nextInt();
        int digit=0;
        while (n!=0){
            digit=n%10;
            n/=10;
            if (digit%2==0)
                even+=digit;
            else
                odd+=digit;
        }
        if (even_sum==odd_sum)
            System.out.println("Given Number is a Probable topper number.");
        else
            System.out.println("Given Number is not a Probable topper number.");
    }
}
