package bt43;

public class MiniQuiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Question q=new Question();
		System.out.println(q.getQuestion());
		if(q.answerCorrect("Khong biet"))
		{
			System.out.println("Dung roi");
		}
		else
		{
			System.out.println("Sai roi.");
			System.out.println(q);
		}
	}

}
