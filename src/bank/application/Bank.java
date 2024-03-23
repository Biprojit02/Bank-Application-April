package bank.application;

public interface Bank {
    public String addMoney(int money);
    public int checkBalance(String password);

    public String widrawMoney(int money, String password);

    public String changePassword(String oldPassword, String newPassword);

    public double checkInterest(int year);
}
