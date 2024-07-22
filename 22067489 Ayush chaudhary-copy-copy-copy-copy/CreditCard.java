
/**
 * Write a description of class CreditCard here.
 *
 * @author (22067489 Ayush Chaudhary)
 * @version (1.0.0)
 */
public class CreditCard extends BankCard
{

    //attributes
    //constructor
    //displaymethod
    private int cvcNumber;
    private double creditLimit;
    private double interestRate;
    private String expirationDate;
    private int gracePeriod;
    private boolean isGranted;

    //create constructor
    public CreditCard(int cardId,String clientName,String issuerBank,String bankAccount,double balanceAmount,int cvcNumber,
    double interestRate,String expirationDate){
        super(balanceAmount,cardId,bankAccount,issuerBank);
        this.setClientName(clientName);
        this.cvcNumber = cvcNumber;
        this.interestRate = interestRate;
        this.expirationDate = expirationDate;
        this.isGranted = false;
    }
    //create getter 
    public int getCvcNumber(){
        return this.cvcNumber;
    }

    public double getCreditLimit(){
        return this.creditLimit;

    }

    public double getInterestRate(){
        return this.interestRate;
    }

    public String getExpirationDate(){
        return this.expirationDate;
    }

    public int getGracePeriod(){
        return this. gracePeriod;
    }

    public boolean getIsGranted(){
        return this.isGranted;
    }
    //create method setTheCreditLimit
    public void setCreditLimit(double creditLimit,int gracePeriod){
        if(creditLimit <= 2.5*getBalanceAmount()){
            this.creditLimit = creditLimit;
            this.gracePeriod = gracePeriod;
            this.isGranted = true;
        }
        else
        {
            System.out.println("credit isnot granted");
        } 
    }
    //Create method cancelCreditCard
    public void cancelCreditCard(){
        this.cvcNumber = 0;
        this.creditLimit = 0;
        this.gracePeriod = 0;
        this.isGranted = false;
    }
    //display method
    public void display(){
        super.display();
        if(isGranted){
            System.out.println("creditLimit ="+this.creditLimit);
            System.out.println("gracePeriod ="+ this.gracePeriod);
            System.out.println("expirationDate="+ this.expirationDate);

        }
    }
}
