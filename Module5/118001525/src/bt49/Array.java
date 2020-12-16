package bt49;

import java.util.ArrayList;
import java.util.Random;

public class Array {
	ArrayList<Integer> arr;
	Random rd;

	public Array() {
		arr = new ArrayList<>();
		rd = new Random();
	}

	//
	public void nhapMang() {
		arr.add(rd.nextInt(100) + 1);
	}

	public void xuatMang() {
		for (int data : arr)
			System.out.print(data + "\t");
	}

	void bubleSort() {
		for (int i = 0; i < arr.size() - 2; i++) {
			for (int j = i + 1; j < arr.size() - 1; j++) {
				if (arr.get(i) > arr.get(j)) {
					int temp = arr.get(i);
					arr.set(i, arr.get(j));
					arr.set(j, temp);
				}
			}
		}
	}

	void selectionSort() {
		int n = arr.size();

		for (int i = 0; i < n - 1; i++) {
			int min_idx = i;
			for (int j = i + 1; j < n; j++)
				if (arr.get(j) < arr.get(min_idx))
					min_idx = j;
			int temp = arr.get(min_idx);
			arr.set(min_idx, arr.get(i));
			arr.set(i, temp);
		}

	}
	void insertSort() 
    { 
        int n = arr.size(); 
        for (int i = 1; i < n; ++i) { 
            int key = arr.get(i); 
            int j = i - 1; 
            while (j >= 0 && arr.get(j) > key) { 
    			arr.set(j + 1, arr.get(j));
                j = j - 1; 
            } 
            arr.set(j + 1, key);
        } 
    } 
	void xoa()
	{
		if(arr.contains(3))
			arr.remove(3);
	}
	boolean doiXung()
	{
		for(int i=0;i<arr.size()/2;i++)
		{
			if(arr.get(i)!=arr.get(arr.size()-1-i))
				return false;
		}
		return true;
	}
}
