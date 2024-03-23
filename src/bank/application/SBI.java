package bank.application;

public class SBI implements Bank{
    public String name;
    private String password;
    private int balance;
    private int accountNo;

    static double rateOfInterest;

    public SBI(String name, String password, int balance) {
        this.name = name;
        this.password = password;
        this.balance = balance;
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
