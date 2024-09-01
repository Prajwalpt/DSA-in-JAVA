package bank;
class Account{
   //1.Public access modifier:
    public String name;
   //2.Default 
   String bankName;
   //3.Protected
   protected int acc_no;
   //4.private:
   private int password;
   //to access private elements
   public void getPassword(){
    System.out.println(this.password);
   }

   public void setPassword(int pass){
    this.password = pass; 
   }
}
public class Bank {
    public static void main(String[] args) {
        Account ac = new Account();
        ac.name = "Prajwalpt";
        ac.bankName = "HDFC";
        ac.acc_no = 1243545;
        //ac.password = 23432543;
        ac.setPassword(1105);
        ac.getPassword();
    }

    //public String name;
}
