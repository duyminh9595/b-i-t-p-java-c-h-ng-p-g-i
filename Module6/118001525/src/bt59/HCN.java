package bt59;

import java.io.ObjectInputStream.GetField;

public class HCN {
	private int dai;
	private int rong;
	public HCN(int dai,int rong)
	{
		this.dai=dai;
		this.rong=rong;
	}
	public void CV()
	{
		System.out.println("Chu vi: "+((dai+rong)*2));
	}
	public void DT()
	{
		System.out.println("Dien tich: "+(dai*rong));
	}
}
