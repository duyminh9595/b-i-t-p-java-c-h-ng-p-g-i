package module2;

public class bt30 {
	public void execute()
	{
		for(int i=1;i<=9;i++)
		{
			System.out.print("*");
			if(i!=9)
			{
				for(int j=2;j<i;j++)
					System.out.print(" ");
			}
			else
			{
				for(int j=1;j<=7;j++)
					System.out.print("*");
			}
			if(i!=1)
				System.out.print("*");
			System.out.println();
		}
		System.out.println();
		for(int i=9;i>=1;i--)
		{
			for(int j=i-1;j>=1;j--)
				System.out.print(" ");
			System.out.print("*");
			if(i!=1)
			{
				for(int j=9-i-1;j>=1;j--)
					System.out.print(" ");
			}
			if(i!=9)
				System.out.print("*");
			if(i==1)
				System.out.print("*******");
			System.out.println();
		}
		System.out.println();
		System.out.println("*********");
		for(int i=2;i<9;i++)
		{
			System.out.print("*");
			for(int k=9-i;k>1;k--)
				System.out.print(" ");
			System.out.print("*");
			System.out.println();
		}
		System.out.println("*");
		System.out.println("*********");
		for(int i=2;i<=9;i++)
		{
			for(int j=1;j<=8;j++)
			{
				if(j==i)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print("*");
			System.out.println();
		}
		System.out.println();
		for(int i=1;i<=9;i++)
		{
			System.out.print("*");
			for(int j=2;j<=8;j++)
			{
				if(i==j)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print("*");
			System.out.println();
		}
	}
}
