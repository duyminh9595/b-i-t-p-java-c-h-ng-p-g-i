package module1;

public class Exe_11 {
	public void execute()
	{


		for(int i=9;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
				System.out.print("*");
			System.out.println();
		}
		System.out.println();
		for(int i=1;i<=9;i++)
		{
			for(int j=1;j<=i;j++)
				System.out.print("*");
			System.out.println();
		}
		
		System.out.println();
		for(int i=1;i<=9;i++)
		{
			for(int j=9-i;j>=1;j--)
				System.out.print(" ");
			for(int k=1;k<=9-(9-i);k++)
				System.out.print("*");
			System.out.println();
		}
		for(int i=9;i>=1;i--)
		{
			for(int k=1;k<=9-i;k++)
				System.out.print(" ");
			for(int j=i;j>=1;j--)
				System.out.print("*");
			
			System.out.println();
		}
	}
}
