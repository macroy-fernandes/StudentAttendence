
public class Student extends Person{
	private int RollNo;
	public int getRollNo() {
		return RollNo;
	}

	public Student(String string,int as) {
		// TODO Auto-generated constructor stub
		
		super(string);
		this.RollNo=as;
	}

}
