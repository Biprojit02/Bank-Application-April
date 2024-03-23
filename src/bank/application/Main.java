package bank.application;

public class Main {
    public static void main(String[] args) {
        SBI.rateOfInterest = 7;
        HDFC.rateOfInterest = 6;

        SBI acc1 = new SBI("Guddu", "123", 50000);
        HDFC acc2 = new HDFC("Bipro", "456", 40000);

        //Add money
        String newMoney = acc1.addMoney(50000);
        System.out.println(newMoney);

        //With wrong password
        int checkbalance1 = acc1.checkBalance("124");
        System.out.println(checkbalance1);

        //With correct password
        int checkbalance = acc1.checkBalance("123");
        System.out.println(checkbalance);

        //With incorrect original password
        String changepassword1 = acc1.changePassword("1234","8794");
        System.out.println(changepassword1);

        //With correct original password
        String changepassword = acc1.changePassword("123","8794");
        System.out.println(changepassword);

        String widraw = acc1.widrawMoney(1000, "123");
        System.out.println(widraw);

        double interest = acc1.checkInterest(20);
        System.out.println("Bank Interest: "+interest);

    }
}