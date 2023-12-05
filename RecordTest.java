class Student {
	private int studentId;
	private String studentName;
	private double studentScore;
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public double getStudentScore() {
		return studentScore;
	}
	public void setStudentScore(double studentScore) {
		this.studentScore = studentScore;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentScore=" + studentScore
				+ "]";
	}
}

record StudentRecord(int studentId, 
		String studentName, 
		double studentScore) {

}

public class RecordTest {
	public static void main(String[] args) {
		StudentRecord record = new StudentRecord(100, "Makarand", 60);
		System.out.println(record);
		System.out.println(record.studentName());
		System.out.println(record.studentScore());
		System.out.println(record.studentId());
	}
}