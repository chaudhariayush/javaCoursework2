
/**
 * Write a description of class BankCard here.
 *
 * @author (22067489 Ayush Chaudhary)
 * @version (1.0.0)
 */
public class BankCard
{
    //assigning attributes
    private int cardId;
    private String clientName;
    private String issuerBank;
    private double balanceAmount;
    private String bankAccount;
    //create constructor
    public BankCard(double balanceAmount,int cardId,String issuerBank,String bankAccount){
       
        this.balanceAmount = balanceAmount;
        this.cardId = cardId;
        this.issuerBank = issuerBank;
        this.bankAccount = bankAccount;
        this.clientName = "";
    }
    
    //getter for cardID
    public int getcardId(){
        return this.cardId;
    }
    //getter for clientName
    public String getclientName(){
        return this.clientName;
    }
    //getter for issuerbank
    public String getissuerBank(){
        return this.issuerBank;
    }
    //getter for balance amount
    public double getBalanceAmount(){
        return this.balanceAmount;
    }
    //getter for bankaccount
    public String getBankAccount(){
        return this.bankAccount;
    }
        //create method setclientName
    public void setClientName(String clientName){
        this.clientName = clientName;       
    }
    //setter for balanceAmount
    public void setBalanceAmount(double balanceAmount){
        this.balanceAmount = balanceAmount;
    }
    //display method
    public void display(){
        System.out.println("Card id =" + cardId);
         if (clientName == "")
         {
             System.out.println("clientName is empty");
         }
         else
         {
             System.out.println("clientName =" + clientName);
         }
         
          System.out.println("issuerBank =" + issuerBank);
           System.out.println("balanceAmount =" + balanceAmount);
            System.out.println("bankAccount =" + bankAccount);
    }
    
}
