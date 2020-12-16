package bt48;

import java.util.ArrayList;
import java.util.Collections;

public class RandomArray {
	private ArrayList<Integer>arr;

	public ArrayList<Integer> getArr() {
		return arr;
	}

	public void setArr(ArrayList<Integer> arr) {
		this.arr = arr;
	}
	public void inMang()
	{
		for(int data : arr)
			System.out.print(data+"\t");
	}
	public int tinhTong()
	{
		int s=0;
		for(int data:arr)
			s+=data;
		return s;
	}
	public void themVaoMang(int n)
	{
		arr.add(n);
	}
	public void sapxep()
	{
		Collections.sort(arr);
	}
}
