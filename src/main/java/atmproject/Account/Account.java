package atmproject.Account;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {

    private int accountNumber; // hesap numarası
    private int pinNumber;   //sifre

    private double checkingBalance;   //vadesiz hesap
    private double savingBalance;     //vadeli hesap

    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");

    Scanner input=new Scanner(System.in);


    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getPinNumber() {
        return pinNumber;
    }

    public void setPinNumber(int pinNumber) {
        this.pinNumber = pinNumber;
    }

    public double getCheckingBalance() {
        return checkingBalance;
    }

    public void setCheckingBalance(double checkingBalance) {
        this.checkingBalance = checkingBalance;
    }

    public double getSavingBalance() {
        return savingBalance;
    }

    public void setSavingBalance(double savingBalance) {
        this.savingBalance = savingBalance;
    }

    public Scanner getInput() {
        return input;
    }

    public void setInput(Scanner input) {
        this.input = input;
    }


    //Paracekme --- paraCekmeİlemindenSonraKalanMiktar:calculateCheckingBalanceAfterWithdraw    amount:miktar

    private double calculateCheckingBalanceAfterWithdraw(double amount){

        checkingBalance= checkingBalance-amount;

        return checkingBalance;
    }


    //Para Yatırma---Parayatırmaişlemindensonrakalanbakıyeyihesapla

    private double calculateCheckingBalanceAfterDeposit(double amount ){

        checkingBalance=checkingBalance+amount;

        return checkingBalance;
    }

    //paracekme :savinghesabından para cekildikten sonra kalan bakıye

    private double calculateSavingBalanceAfterWithdrow(double amount){

        savingBalance=savingBalance-amount;

        return savingBalance;
    }

    //Para yatırma: saving hesabına para yatırdıktan sonra geri kalan bakıyeyi hesapla

    private double calculateSavingBalanceAfterDeposit(double amount){

        savingBalance=savingBalance+amount;

        return savingBalance;

    }

    //müsteri ile para cekmek için etkileşime gecelim

    public void getCheckingWithdraw() {
        displayCurrentAmount(checkingBalance);
        System.out.println("Cekmek istediginiz bakıyeyi giriniz.");
        double amount = input.nextDouble();

        if (amount <= 0) {
            System.out.println("0 veya eksi bakıyeler gecersizdir!");
            getCheckingWithdraw();// aynı methodu cagırısak aynı işlemi tekrarlamış oluruz.=recursiye methodu
        } else if (amount <= checkingBalance) {
            calculateCheckingBalanceAfterWithdraw(amount);
            displayCurrentAmount(checkingBalance);
        } else {
            System.out.println("Yetersiz Bakiye:(");
        }

    }
        //Müsterinin para yatırmasi için etkileşime gecelim

        public void getCheckingDeposit(){
            displayCurrentAmount(checkingBalance);
            System.out.println("Yatırmak istediginiz miktarı giriniz.");
            double amount1=input.nextDouble();

            if(amount1<=0){
                System.out.println("0 veya eksi bakıyeler gecersizdir!");
                getCheckingDeposit();

            }else{
                calculateCheckingBalanceAfterDeposit(amount1);
                System.out.println();
                displayCurrentAmount(checkingBalance);
            }
        }

    //müsteri ile para cekmek için etkileşime gecelim=savingAccount

      public void getSavingWithdraw() {
        displayCurrentAmount(savingBalance);
        System.out.println("Cekmek istediginiz bakıyeyi giriniz.");
        double amount = input.nextDouble();

        if(amount<=0){
            System.out.println("0 veya eksi bakıyeler gecersizdir!");
            getSavingWithdraw();
        }else if(amount<=savingBalance){
            calculateSavingBalanceAfterWithdrow(amount);
            System.out.println();
            displayCurrentAmount(savingBalance);
        }else{
            System.out.println("Yetersiz bakiye");
        }

    }
    //Para yatırma saving account
    public void getSavingDeposit() {
        displayCurrentAmount(savingBalance);
        System.out.println("Yatırmak istediginiz bakıyeyi giriniz.");
        double amount = input.nextDouble();
        if(amount<=0){
            System.out.println("0 veya eksi rakamlar gecersizdir.");
            getSavingDeposit();
        }else {
            calculateSavingBalanceAfterDeposit(amount);
            displayCurrentAmount(savingBalance);
        }

    }

    ///son bakıyeyi goster
    public void displayCurrentAmount(double balance){
        System.out.println("Hesabınızda bulunan bakıye: "+ moneyFormat.format(balance));

    }

    public DecimalFormat getMoneyFormat() {
        return moneyFormat;
    }

    public void setMoneyFormat(DecimalFormat moneyFormat) {
        this.moneyFormat = moneyFormat;
    }
}
