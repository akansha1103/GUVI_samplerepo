import java.util.*;
public class Digits
{
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a=0,r=0;
        while((n%10)!=0)
        {
            a++;
            n=n/10;
        }
        System.out.println(a);
	}
}
