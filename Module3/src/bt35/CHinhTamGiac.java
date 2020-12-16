package bt35;

import java.text.DecimalFormat;

public class CHinhTamGiac {
	private int ma;
	private int mb;
	private int mc;

	public int getCanhA() {
		return ma;
	}

	public void setCanhA(int ma) {
		if (ma > 0)
			this.ma = ma;
	}

	public int getCanhB() {
		return mb;
	}

	public void setCanhB(int mb) {
		if (mb > 0)
			this.mb = mb;
	}

	public int getCanhC() {
		return mc;
	}

	public void setCanhC(int mc) {
		if (mc > 0)
			this.mc = mc;
	}

	public CHinhTamGiac() {
		ma = mb = mc = 0;
	}

	public CHinhTamGiac(int a, int b, int c) {
		if (a <= 0) {
			System.out.println("A khong hop le");
			ma = 0;
		} else
			ma = a;
		if (b <= 0) {
			System.out.println("B khong hop le");
			mb = 0;
		} else
			mb = b;
		if (c <= 0) {
			System.out.println("C khong hop le");
			mc = 0;
		} else
			mc = c;
	}

	public boolean laTamGiac() {
		if (ma + mb > mc && ma + mc > mb && mb + mc > ma) {
			return true;
		} else {
			return false;
		}
	}
	public boolean laTamGiac(int ma,int mb,int mc) {
		if (ma + mb > mc && ma + mc > mb && mb + mc > ma) {
			return true;
		} else {
			return false;
		}
	}
	public void chuViTamGiac()
	{
		System.out.println("Chu Vi: "+(ma+mb+mc));
	}
	public void dienTichTamGiac()
	{
		double p=(ma+mb+mc)*1.0/2;
		System.out.println("Dien tich: "+new DecimalFormat("0.00").format(Math.sqrt(p*(p-ma)*(p-mb)*(p-mc))));
	}
}
