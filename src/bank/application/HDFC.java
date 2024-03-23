package bank.application;

public class HDFC implements Bank{

    public String name;
    private int accountNo;
    private int balance;
    private String password;

    static double rateOfInterest;

    public HDFC(String name, String password, int balance) {
        this.name = name;
        this.balance = balance;
        this.password = password;
    }

    @Override
    public String addMoney(int money) {
        balance = balance + money;
        String message = money + " has been added to your account " + accountNo + " and the current baalance is "+ balance;
        return message;
    }

    @Override
    public int checkBalance(String password) {
        if(this.password == password){
            return balance;
        }
        return -1;
    }

    @Override
    public String widrawMoney(int drawMoney, String password) {
        if(password == this.password){
            if(drawMoney > balance){
                return "Insufficient balance";
            }else{
                balance = balance - drawMoney;
                String message = drawMoney + " debited and your current balance is "+ balance;
                return message;
            }
        }
        else{
            return "Incorrect password";
        }
    }

    @Override
    public String changePassword(String oldPassword, String newPassword) {
        if(this.password == oldPassword){
            password = newPassword;
            String message = "Password changed Successfully";
            return message;
        }
        String message1 = "please check the original password";
        return message1;

    }

    @Override
    public double checkInterest(int year) {
        if(this.password == password){
            double interest = balance*rateOfInterest*year/100;
        }
        return 0;
    }
}
