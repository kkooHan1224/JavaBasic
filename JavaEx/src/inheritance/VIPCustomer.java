package inheritance;
public class VIPCustomer extends Customer {
   int agentID;
   double saleRatio;
   public VIPCustomer() {
         customerGrade = "VIP";// 에러인 이유? -Customer 클래스에서 private로 선언해놔서
         bonusRatio = 0.05;
         saleRatio = 0.1;
         System.out.println("VIPCustomer() 생성자 호출 ");
   }
}