package bt37;

public class CNhanVien {
	private String mHo;
	private String mTen;
	private int mSoSP;
	public CNhanVien(String ho,String ten,int sosp)
	{
		mHo=ho;
		mTen=ten;
		if(sosp>0)
			mSoSP=sosp;
		else
			mSoSP=0;
	}
	public String getmHo() {
		return mHo;
	}
	public void setmHo(String mHo) {
		this.mHo = mHo;
	}
	public String getmTen() {
		return mTen;
	}
	public void setmTen(String mTen) {
		this.mTen = mTen;
	}
	public int getmSoSP() {
		return mSoSP;
	}
	public void setmSoSP(int mSoSP) {
		this.mSoSP = mSoSP;
	}
	public double getLuong()
	{
		if(mSoSP<200)
			return mSoSP*0.5;
		else if(mSoSP>=200 && mSoSP<400)
			return mSoSP*0.55;
		else if(mSoSP>=400 && mSoSP<600)
			return mSoSP*0.6;
		else
			return mSoSP*0.65;
	}
	public boolean LonHon(CNhanVien nv2)
	{
		if(this.mSoSP>nv2.mSoSP)
			return true;
		return false;
	}
}
