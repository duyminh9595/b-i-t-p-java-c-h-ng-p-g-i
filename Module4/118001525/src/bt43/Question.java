package bt43;

public class Question implements Complexity {

	@Override
	public int getComplexity() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setComplexity(int num) {
		// TODO Auto-generated method stub
		
	}
	public String getQuestion()
	{
		return "Cau Hoi La?";
	}
	public String getAnswer()
	{
		return "La gi ai biet";
	}
	public boolean answerCorrect(String s)
	{
		if(s.equals(getAnswer()))
			return true;
		return false;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Cau tra loi dung la: "+getAnswer();
	}
}
