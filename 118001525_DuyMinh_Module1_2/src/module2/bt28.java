package module2;

import java.util.Scanner;

public class bt28 {
	public void NegativeNumberInStrings()
	{
		System.out.println("Nhap vao chuoi s: ");
		Scanner sc= new Scanner(System.in);
		String s="";
		s=sc.nextLine();
		String temp="";
		for(int i=0;i<s.length()-1;i++)
		{
			if(s.charAt(i)=='-')
			{
				if(Character.isDigit(s.charAt(i+1)))
				{
					int k=0;
					for(int j=i+2;j<s.length()-1;j++)
					{
						if(Character.isDigit(s.charAt(j))==false)
						{
							k=j-1;
							break;
						}
					}
					temp="";
					for(int j=i+1;j<=k;j++)
					{
						temp+=String.valueOf(s.charAt(j));
					}
					System.out.println(String.valueOf(s.charAt(i))+temp);
				}
			}
		}
	}
}
