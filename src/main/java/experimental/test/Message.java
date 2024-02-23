package experimental.test;

public class Message {
    String messageFormLoan(Loan l){
     return switch (l){
         case UnsecureLoan (var intersect) -> "too bad "+intersect;
         case SecureLoan sl -> "great";
     };
       // throw new IllegalArgumentException("opss fail");
    }
}
