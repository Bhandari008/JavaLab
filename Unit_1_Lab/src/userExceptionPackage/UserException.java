package userExceptionPackage;

class MarksExceptions extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MarksExceptions(String msg) {
		super(msg);
	}
}

public class UserException {
	static void StudentMarks(int marks) throws MarksExceptions{
		if (marks < 0) {
			throw new MarksExceptions("Marks cannot be less than 0");

		} else {
			System.out.println("Marks Saved.");
		}
	}

	public static void main(String[] args) throws MarksExceptions {
		StudentMarks(-50);
	}

}
