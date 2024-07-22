/**
 * Write a description of class DebitCard here.
 *int 
 * @author (22067489 Ayush Chaudhary)
 * @version (1.0.0)
 */
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.awt.*;
import java.awt.Color;
public class BankGUI implements ActionListener

{
    // declare all the component here
    //for JFrame
    private JFrame frame;

    //for sample BankGUI
    private JLabel bankGUILabel,cardIdLabel,clientNameLabel,bankAccountLabel,balanceAmountLabel,issuerBankLabel,CreditCardLabel,debitCardLabel;
    private JTextField cardIdText,clientNameText,bankAccountText,balanceAmountText,issuerBankText;
    private JButton displayButton,clearButton;

    //-------credit card component------
    private JLabel cvcNumberLabel, creditLimitLabel,interestRateLabel,gracePeriodLabel,expirationLabel;
    private JTextField cvcNumberText,creditLimitText,interestRateText,gracePeriodText;
    private JComboBox yearList,monthList, dayList;
    private JButton CreditCardButton,setCreditLimitButton,cancelCreditCardButton, creditDisplayButton;

    //______ debit card component___
    private JLabel pinNumberLabel,withdrawalAmountLabel,withdrawalLabel;
    private JTextField pinNumberText,withdrawalAmountText;
    private JComboBox yearList1,monthList1,dayList1;
    private JButton DebitCardButton,withdrawButton, debitDisplayButton;

    //ArrayList for DebitCard
    ArrayList<BankCard> BankCardArrayList = new ArrayList<BankCard>();
    // instance of debit card and credit card objects
    
    public static void main(String[] args){
        new BankGUI();
    }

    public BankGUI(){
        //step 1: create new JFrame using constructor
        frame = new JFrame();

        //adding cardId to JFrame

        cardIdLabel = new JLabel("Card ID:");//adding cardId as label
        cardIdText = new JTextField();
        cardIdLabel.setBounds(71,60,50,30);
        cardIdText.setBounds(132,60,110,30);
        frame.add(cardIdLabel);
        frame.add(cardIdText); 

        //adding bank account 
        bankAccountLabel = new JLabel("Bank Account:");//adding bank account as label
        bankAccountText = new JTextField();//adding bank account as text field
        bankAccountLabel.setBounds(299,60,85,30);
        bankAccountText.setBounds(395,60,110,30);
        frame.add(bankAccountLabel);
        frame.add(bankAccountText);

        //adding balance amount
        balanceAmountLabel = new JLabel("Balance Amount:");
        balanceAmountText = new JTextField();
        balanceAmountLabel.setBounds(582,60,101,30);
        balanceAmountText.setBounds(694,60,110,30);
        frame.add(balanceAmountLabel);
        frame.add(balanceAmountText);

        //adding client name
        clientNameLabel = new JLabel("Client Name:");
        clientNameText = new JTextField();
        clientNameLabel.setBounds(162,110,80,30);
        clientNameText.setBounds(261,110,110,30);
        frame.add(clientNameLabel);
        frame.add(clientNameText);

        //adding issuer bank
        issuerBankLabel = new JLabel("Issuer Bank:");
        issuerBankText = new JTextField();
        issuerBankLabel.setBounds(500,110,80,30);
        issuerBankText .setBounds(600,110,110,30);
        frame.add(issuerBankLabel);
        frame.add(issuerBankText);

        //adding credit card
        CreditCardLabel = new JLabel("Credit Card:");
        CreditCardLabel.setBounds(390,150,150,36);
        frame.add(CreditCardLabel);

        //adding cvc number
        cvcNumberLabel = new JLabel("CVC Number:");
        cvcNumberText = new JTextField();
        cvcNumberLabel.setBounds(71,200,100,30);
        cvcNumberText .setBounds(173,200,110,30);
        frame.add(cvcNumberLabel);
        frame.add(cvcNumberText);

        //adding expiration date
        expirationLabel = new JLabel("Expiration Date:");
        expirationLabel.setBounds(477,200,94,30);
        frame.add(expirationLabel);

        //jcombobox
        //JComboBox comboBox = new JComboBox();
        String[] year={"2019","2020","2021","2022","2023"};
        yearList = new JComboBox(year);
        yearList.setBounds(595,200,70,30);
        frame.add(yearList);

        //adding month
        String[] month = {"jan","feb","mar","april","may"};
        monthList = new JComboBox(month);
        monthList.setBounds(675,200,70,30);
        frame.add(monthList); 

        //adding days
        String[] day = {"1","2","3","4","5"};
        dayList = new JComboBox(day);
        dayList.setBounds(760,200,70,30);
        frame.add(dayList); 

        //addding interstrate
        interestRateLabel = new JLabel("Interest rate:");
        interestRateText = new JTextField();
        interestRateLabel.setBounds(71,250,94,30);
        interestRateText.setBounds(173,250,100,30);
        frame.add(interestRateLabel);
        frame.add(interestRateText);

        //adding add credit button
        CreditCardButton = new JButton("Add Credit Card");
        CreditCardButton.setBounds(396,250,130,30);
        frame.add(CreditCardButton); 

        //adding creditLimit
        creditLimitLabel = new JLabel("Credit Limit:");
        creditLimitText = new JTextField();
        creditLimitLabel.setBounds(71,300,94,30);
        creditLimitText .setBounds(173,300,100,30);
        frame.add(creditLimitLabel);
        frame.add(creditLimitText);

        //adding grace period
        gracePeriodLabel = new JLabel("Grace Period:");
        gracePeriodText = new JTextField();
        gracePeriodLabel.setBounds(344,300,94,30);
        gracePeriodText.setBounds(440,300,100,30);
        frame.add(gracePeriodLabel);
        frame.add(gracePeriodText);

        //adding set credit limit button
        setCreditLimitButton = new JButton("set Credit Limit");
        setCreditLimitButton.setBounds(632,300,130,30);
        frame.add(setCreditLimitButton);

        //adding cancel credit card button
        cancelCreditCardButton = new JButton("Cancel Credit Card");
        cancelCreditCardButton.setBounds(669,350,150,30);
        frame.add(cancelCreditCardButton);

        //adding debit card
        debitCardLabel = new JLabel("Debit Card:");
        debitCardLabel.setBounds(384,370,150,36);
        frame.add(debitCardLabel);

        //adding pin number
        pinNumberLabel = new JLabel("Pin Number:");
        pinNumberText = new JTextField();
        pinNumberLabel.setBounds(71,420,94,30);
        pinNumberText.setBounds(163,420,110,30);
        frame.add(pinNumberLabel);
        frame.add(pinNumberText);

        //adding add debit button
        DebitCardButton = new JButton("Add Debit Card");
        DebitCardButton.setBounds(396,420,130,30);
        frame.add(DebitCardButton); 

        //adding withdrawal amount
        withdrawalAmountLabel = new JLabel("Withdrawal Amount:");
        withdrawalAmountText = new JTextField();
        withdrawalAmountLabel.setBounds(71,470,120,30);
        withdrawalAmountText.setBounds(200,470,120,30);
        frame.add(withdrawalAmountLabel);
        frame.add(withdrawalAmountText);

        //adding withdrawal button
        withdrawButton = new JButton("withdraw Debit Card");
        withdrawButton.setBounds(669,470,155,35);
        frame.add(withdrawButton);

        //adding withdrawal date
        withdrawalLabel = new JLabel("Withdrawal Date:");
        withdrawalLabel.setBounds(71,520,110,30);
        frame.add(withdrawalLabel);

        //aqdding combobox
        //JComboBox comboBox1 = new JComboBox();
        String[] year1={"2019","2020","2021","2022","2023"};
        yearList1 = new JComboBox(year);
        yearList1.setBounds(191,520,70,30);
        frame.add(yearList1);

        //adding month
        String[] month1 = {"jan","feb","mar","april","may"};
        monthList1 = new JComboBox(month);
        monthList1.setBounds(273,520,70,30);
        frame.add(monthList1);

        //adding days
        String[] day1 = {"1","2","3","4","5"};
        dayList1 = new JComboBox(day);
        dayList1.setBounds(355,520,70,30);
        frame.add(dayList1); 

        //adding credit display button 
        creditDisplayButton = new JButton("Credit Display");
        creditDisplayButton.setBounds(299,570,130,35);
        frame.add(creditDisplayButton);

        //adding debit display button
        debitDisplayButton = new JButton("Debit Display");
        debitDisplayButton.setBounds(469,570,130,35);
        frame.add(debitDisplayButton);
        
        //adding clear button
        clearButton = new JButton("Clear");
        clearButton.setBounds(712,600,130,35);
        frame.add(clearButton);
        
        //adding action listner to the source
        CreditCardButton.addActionListener(this);
        DebitCardButton.addActionListener(this);
        withdrawButton.addActionListener(this);
        setCreditLimitButton.addActionListener(this);
        creditDisplayButton.addActionListener(this);
        debitDisplayButton.addActionListener(this);
        clearButton.addActionListener(this);
        cancelCreditCardButton.addActionListener(this);
        
        
        //step 2: set the size of JFrame
        frame.setSize(900,1000);

        //step 3: setting the layout manager to null
        frame.setLayout(null);

        //step 4: set what happens when JFrame is closed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //fix the size of JFrame
        frame.setResizable(false);
        
        

        //step 5: make JFrame visible
        frame.setVisible(true);

        
    }
    // implements the method of the 
    //Action listner

    public void actionPerformed(ActionEvent e){
        //adding credit card
        if(e.getSource() == CreditCardButton){
            try{
                int cardId = Integer.parseInt(cardIdText.getText());
                String clientName = clientNameText.getText();
                String issuerBank = issuerBankText.getText();
                String bankAccount = bankAccountText.getText();
                double balanceAmount = Double.parseDouble(balanceAmountText.getText());
                int cvcNumber = Integer.parseInt(cvcNumberText.getText());
                double interestRate = Double.parseDouble(interestRateText.getText());

                String yearListStr = yearList.getSelectedItem().toString();
                String monthListStr = monthList.getSelectedItem().toString();
                String dayListStr = dayList.getSelectedItem().toString();
                String expirationDate = yearList+ "-" + monthList+ "-"+dayList;

                String balance = String.valueOf(balanceAmount);
                String Id = String.valueOf(cardId);
                String cvc = String.valueOf(cvcNumber);
                String interest = String.valueOf(interestRate);
                String message = "Balance Amount: " + balance + "\nCard Id: " + Id + "\nIssuer Bank: " + issuerBank + "\nBank Account: " + bankAccount + "\nClient Name: " + clientName + "\nCVC Number: " + cvc + "\nInterest Rate: " + interest;
                CreditCard creditobj = new CreditCard(cardId,clientName,issuerBank,bankAccount,balanceAmount,cvcNumber,
                    interestRate,expirationDate);

                boolean isCardIdUnique = true;
                for(BankCard card : BankCardArrayList){
                    if(card instanceof CreditCard){
                        CreditCard credit_obj = (CreditCard) card;
                        if(creditobj.getcardId() == cardId){
                            isCardIdUnique = false;
                            break;
                        }
                    }
                }
                if(isCardIdUnique){
                    BankCardArrayList.add(creditobj);
                    JOptionPane.showMessageDialog(frame,"Credit Card added successfully \n" + message,"sucessful",JOptionPane.INFORMATION_MESSAGE);

                }else{
                    JOptionPane.showMessageDialog(frame,"The cardId was already added","Information",JOptionPane.INFORMATION_MESSAGE);
                }
            }catch(NumberFormatException a){
                JOptionPane.showMessageDialog(frame,"Please input numeric values","Error",JOptionPane.ERROR_MESSAGE);

            }
        }

        //Add debit card
        if(e.getSource() == DebitCardButton){
            try{
                double balanceAmount = Double.parseDouble(balanceAmountText.getText());
                int cardId = Integer.parseInt(cardIdText.getText());
                String bankAccount = bankAccountText.getText();
                String issuerBank = issuerBankText.getText();
                String clientName = clientNameText.getText();
                int pinNumber = Integer.parseInt(pinNumberText.getText());

                DebitCard debitobj = new DebitCard(balanceAmount,cardId ,bankAccount,issuerBank,clientName,pinNumber);
                String balance = String.valueOf(balanceAmount);
                String Id = String.valueOf(cardId);
                String pin = String.valueOf(pinNumber);
                String message = "Balance Amount: " + balance + "\nCard Id: " + Id + "\nBank Account: " + bankAccount + "\nIssuer Bank: " + issuerBank + "\nClient Name: " + clientName + "\nPIN Number: " + pin;
                boolean isCardIdUnique = true;
                for(BankCard card : BankCardArrayList){
                    if(card instanceof DebitCard){
                        DebitCard debit_obj = (DebitCard) card;
                        if(debitobj.getcardId() == cardId){
                            isCardIdUnique = false;
                            break;
                        }
                    }
                }
                if(isCardIdUnique){
                    BankCardArrayList.add(debitobj);
                    JOptionPane.showMessageDialog(frame,"Debit Card added successfully\n" + message,"sucessful",JOptionPane.INFORMATION_MESSAGE);
                }else{
                    JOptionPane.showMessageDialog(frame,"CardId already added","Information",JOptionPane.INFORMATION_MESSAGE);
                }
            }catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(frame,"please input numeric values","Error",JOptionPane.ERROR_MESSAGE);
            }
        }
        //adding clear button
        if(e.getSource() == clearButton){
            cardIdText.setText("");
            clientNameText.setText("");
            bankAccountText.setText("");
            balanceAmountText.setText("");
            issuerBankText.setText("");
            pinNumberText.setText("");
            withdrawalAmountText.setText("");
            pinNumberText.setText("");
            cvcNumberText.setText("");
            interestRateText.setText("");
            creditLimitText.setText("");
            gracePeriodText.setText("");
        }

        //cancel button
        if(e.getSource() == cancelCreditCardButton){
            try{
                int cardId = Integer.parseInt(cardIdText.getText());
                double creditLimit = Double.parseDouble(creditLimitText.getText());
                int gracePeriod = Integer.parseInt(gracePeriodText.getText());
                boolean isCardIdUnique = false;

                for(BankCard creditobject: BankCardArrayList){
                    if(creditobject instanceof CreditCard){
                        CreditCard creditCard = (CreditCard) creditobject;
                        if(creditCard.getcardId() == cardId){
                            creditCard.cancelCreditCard();
                            isCardIdUnique = true;
                            break;
                        }
                    }
                }
                if(isCardIdUnique){
                    JOptionPane.showMessageDialog(frame,"credit card canceled successfully","message",JOptionPane.INFORMATION_MESSAGE);
                }else{
                    JOptionPane.showMessageDialog(frame,"cardId was not found","Error",JOptionPane.ERROR_MESSAGE);
                }

            }catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(frame,"please input the correct value.","Error",JOptionPane.ERROR_MESSAGE);
            }
        }

        //withdraw button
        if(e.getSource() == withdrawButton){
            try{
                int cardId = Integer.parseInt(cardIdText.getText());
                double balanceAmount = Double.parseDouble(balanceAmountText.getText());
                String bankAccount = bankAccountText.getText();
                String issuerBank = issuerBankText.getText();
                String clientName = clientNameText.getText();
                int withdrawalAmount = Integer.parseInt(withdrawalAmountText.getText());
                int pinNumber = Integer.parseInt(pinNumberText.getText());
                String yearListStr = yearList1.getSelectedItem().toString();
                String monthListStr = monthList1.getSelectedItem().toString();
                String dayListStr = dayList1.getSelectedItem().toString();
                String withdrawalDate = yearListStr + "" + monthListStr + ""+dayListStr ;
                boolean isCardIdFound = false;
                boolean isPinNumberCorrect = false;
                for(BankCard bc : BankCardArrayList){
                    if(bc instanceof DebitCard && !isCardIdFound){
                        DebitCard dc = (DebitCard) bc;
                        if(dc.getcardId() == cardId){
                            if(dc.getPinNumber()== pinNumber){
                                isPinNumberCorrect = true;
                                if(dc.getBalanceAmount() >= withdrawalAmount){
                                    dc.withdraw(withdrawalAmount,withdrawalDate,pinNumber);
                                    JOptionPane.showMessageDialog(frame,"withdraw successful","success",JOptionPane.INFORMATION_MESSAGE);
                                }else{
                                    JOptionPane.showMessageDialog(frame,"Insufficient balance","Error",JOptionPane.ERROR_MESSAGE);
                                    break;
                                }
                            }else{
                                JOptionPane.showMessageDialog(frame,"Invalid PIN number","message",JOptionPane.ERROR_MESSAGE);
                                break;
                            }
                        }
                    }
                }
                if(!isCardIdFound){
                    JOptionPane.showMessageDialog(frame,"Card not found!","message",JOptionPane.ERROR_MESSAGE);
                }
            }catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(frame,"Invalid data.please try again","Error",JOptionPane.ERROR_MESSAGE);
            }
        }

        // set credit limit
        if(e.getSource() == setCreditLimitButton){
            try{
                int cardId = Integer.parseInt(cardIdText.getText());
                double creditLimit = Double.parseDouble(creditLimitText.getText());
                int gracePeriod = Integer.parseInt(gracePeriodText.getText());
                boolean cardIdFound = false;
                for(BankCard cc : BankCardArrayList){
                    if(cc instanceof CreditCard){
                        CreditCard cards = (CreditCard) cc;
                        if(cards.getcardId() == cardId){
                            cards.setCreditLimit(creditLimit,gracePeriod);
                            cardIdFound = true;
                            break;
                        }
                    }
                }
                if(cardIdFound){
                    JOptionPane.showMessageDialog(frame,"credit limit set successfullyt","sucessful",JOptionPane.INFORMATION_MESSAGE);
                }
                else{
                    JOptionPane.showMessageDialog(frame,"The cardId not found","message",JOptionPane.INFORMATION_MESSAGE);
                }
            }catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(frame,"please input the correct values","Error",JOptionPane.ERROR_MESSAGE);
            }
        }

        // Display button
        //after clicking display button the information of creditCard and setCreditLimit is displayed
        if(e.getSource() == creditDisplayButton){
            try{
               
                   
                for(BankCard Card : BankCardArrayList){
                    if(Card instanceof CreditCard){
                        CreditCard cdisplayobj = (CreditCard) Card;
                        cdisplayobj.display();

                    }
                }
            }
            catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(frame,"Please input numeric values","Error!!!",JOptionPane.ERROR_MESSAGE);
            }
        }
        //
        if(e.getSource() == debitDisplayButton){
            try{
               
                for(BankCard debitobj : BankCardArrayList){
                    if(debitobj instanceof DebitCard){
                        DebitCard ddisplayobj = (DebitCard) debitobj;
                        ddisplayobj.display();
                    }
                }
            }
            catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(frame,"please Input numeric values","Error",JOptionPane.ERROR_MESSAGE);
                
            }
        }
        
    }
}