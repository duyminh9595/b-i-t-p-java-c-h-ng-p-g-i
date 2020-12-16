package bt56;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MyFile {
	public static void luuDoiTuong(Object obj,String fileName)
	{
		try {
			FileOutputStream fOut=new FileOutputStream(fileName);
			ObjectOutputStream out=new ObjectOutputStream(fOut);
			out.writeObject(obj);
			out.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public static Object docDoiTuong(String fileName)
	{
		try {
			FileInputStream fIn=new FileInputStream(fileName);
			ObjectInputStream in=new ObjectInputStream(fIn);
			Object o=in.readObject();
			in.close();
			return o;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
	}
}
