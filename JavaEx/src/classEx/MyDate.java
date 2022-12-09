package classEx;
public class MyDate {
   private int day;  //private를 다른 클래스에서 쓰려면 메소드로 만들어주면됨 get(만들어줄때), set(다른클래스에서 불러올때)
   
   private int month;
   private int year;
   
   public int getDay() {
      return day;
   }
   
   public int getMonth() {
      return month;
   }

   public void setMonth(int month) { // 값 불러낼때 set
      if(month < 1 || month > 12) {
         System.out.println("월 입력 오류입니다!!");
      } else {
      this.month = month;
   }
   }

   public int getYear() {
      return year;
   }

   public void setYear(int year) {
      this.year = year;
   }

   public void setDay(int day) {
      if(month == 2) {
         if(day<1 || day > 29) {
            System.out.println("일자 오류입니다!!");
            System.out.close();
         } else {
            this.day = day;
         }
      }   
   }
}