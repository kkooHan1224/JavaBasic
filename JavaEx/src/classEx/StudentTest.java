package classEx;
public class StudentTest {
   public static void main(String[] args) {
      Student studentLee = new Student();
      studentLee.studentName = "홍길동"; //studentName이 private 클래스라면 해당클래스에서만 사용할 수 있음(Student클래스)
      System.out.println(studentLee.studentName); // 에러?   
      //studentLee.setStudentName = ("홍길동"); // setStudentName이 메소드임
      //System.out.println(studentLee.setStudentName()); 
   }
}