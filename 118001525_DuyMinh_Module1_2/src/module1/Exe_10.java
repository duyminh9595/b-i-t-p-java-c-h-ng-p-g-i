package module1;

import java.util.Scanner;

public class Exe_10 {
	public void execute()
	{
		String s="";
		System.out.println("Nhap chuoi can xu ly:" );
		Scanner sc= new Scanner(System.in);
		s=sc.nextLine();
		boolean[]check=new boolean[s.length()];
		for(int i=0;i<s.length();i++)
		{
			int count=0;
			if(!check[i])
			{
				for(int j=0;j<s.length();j++)
				{
						if(s.charAt(i)==s.charAt(j))
						{
							++count;
							check[j]=true;
						}
				}
				check[i]=true;
				System.out.println(s.charAt(i)+" xuat hien "+count+" lan");
				
			}
		}
}
}
