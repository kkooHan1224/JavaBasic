package classEx;
public class Student {
   int studentID;
   protected String studentName;  // private로 하면 자기 자신클래스에서만 쓸수있음
   int grade;
   String address;

   public String getStudentName() {
      return studentName;
   }
   public void setStudentName(String studentName) {
      this.studentName = studentName;
   }
}