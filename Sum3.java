import java.util.*;
public class Sum3
{
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int k=s.nextInt();
        int[] ar=new int[n];
        int i, sum=0;
        for(i=0;i<n;i++)
        {
            ar[i]=s.nextInt();
        }
        for(i=0;i<k;i++)
        {
            sum=sum+ar[i];
        }
        System.out.println(sum);
	}
}
