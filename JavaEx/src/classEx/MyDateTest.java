package classEx;
public class MyDateTest {
   public static void main(String[] args) {
      MyDate date = new MyDate();
      date.setMonth(13);
      date.setDay(31);
      date.setYear(2022);
      System.out.println(date.getYear()+"년"+date.getMonth()+"월"+date.getDay()+"일"); // 메서드 형태로 가져와야함
   }
}