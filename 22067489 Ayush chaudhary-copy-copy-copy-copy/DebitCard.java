
/**
 * Write a description of class DebitCard here.
 *int 
 * @author (22067489 Ayush Chaudhary)
 * @version (1.0.0)
 */
public class DebitCard extends BankCard
{
    //five attritubutes,constructors,method display same as bankcard as well as credit card
    private int pinNumber;
    private int withdrawalAmount;
    private String dateOfWithdraw;
    private boolean hasWithdrawan;
    //create constructor
    public DebitCard(double balanceAmount,int cardID,String bankAccount,String issuerBank,String clientName,int pinNumber){
     super(balanceAmount,cardID,issuerBank, bankAccount);
     super.setClientName(clientName);
     this.pinNumber = pinNumber;
     this.hasWithdrawan=false;
    }
    //each attributes have crossponding accessor
    public int getPinNumber(){
        return this.pinNumber;
    }
    public int getWithdrawalAmount(){
        return this.withdrawalAmount;
    }
    public String getDateOfWithdraw(){
        return this.dateOfWithdraw;
    }
    public boolean getHasWithdrawan(){
        return this.hasWithdrawan;
        
    }
    //create mutator withdrawalAmount(setter)
    public void setWithdrawalAmount(int withdrawalAmount){
    this.withdrawalAmount = withdrawalAmount;
    }
    //  create method withdraw
    public void withdraw(int withdrawalAmount, String dateOfWithdraw,int pinNumber){
        //double equal to == means compare
        if(this.pinNumber == pinNumber)
        {
            if(withdrawalAmount <= super.getBalanceAmount()){
                this.hasWithdrawan = true;
                super.setBalanceAmount(super.getBalanceAmount() - withdrawalAmount);
                this.withdrawalAmount = withdrawalAmount;
                this.dateOfWithdraw = dateOfWithdraw;
                System.out.println("sucessfully withdrawan");
            }
            
            else{
                        System.out.println("insufficent balance");
            }
        }
        else
        {
              System.out.println("wrong pinNumber");
        }
    }
    //display method
    public void display(){
        super.display();
        if(hasWithdrawan == true)
        {
                    System.out.println("pinNumber = "+ pinNumber);
                    System.out.println("withdrawalAmount ="+ withdrawalAmount);
                     System.out.println("dateOfWithdraw ="+ dateOfWithdraw);
        }
        else
        {
        }
    }
    
   
     
}
