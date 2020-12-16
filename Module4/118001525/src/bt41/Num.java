package bt41;

public class Num {
	private int value;
	public Num(int update)
	{
		value=update;
	}
	public void setValue(int value) {
		this.value = value;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return value+"";
	}
}
