import java.util.Scanner;


public class User {
    private String userName;
    private String action;
    private double balance = 100.0;
    private double withdraw;
    private String cancel;
    Scanner input = new Scanner(System.in);


    public String getUser() {
        return userName;
    }
    public String getAction() {
        return action;
    }
    public double getBalance() {
        return balance;
    }
    private double getWithdraw() {
        return withdraw;
    }
    public String getCancel() {
        return cancel;
    }
    public void setUser(String user)  {
        this.userName = user;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void setWithdraw(double withdraw) {
        this.withdraw = balance -= withdraw;
    }
    public void setCancel(String cancel) {
        this.cancel = cancel;
    }

    public void userName() throws Exception {
        System.out.println("What is your Name?");
        this.userName = this.input.nextLine();
        System.out.println("Thanks for coming " + this.userName);
        if(userName.isEmpty()) {
             throw new Exception("I need your Name to continue.");
        }


    }

    public void userAction() throws Exception {
        System.out.println("What would " + this.userName + " like to do?");
        String action = input.nextLine();
        if(action.equalsIgnoreCase("Check Balance")){
            System.out.println("Your balance is: " + balance);
        }
        else if(action.equalsIgnoreCase("Withdraw")) {
            System.out.println("Ok, how much?");
            double withdraw = input.nextDouble();
            if(withdraw > 100.0) {
                throw new Exception ("You have insufficient funds for completing your transaction.");
            }
            balance -= withdraw;
            System.out.println("Your remaining balance is " + balance + " Please take your funds, and have a nice day!");
        }
        else if(action.equalsIgnoreCase("Cancel")) {
            System.out.println("Thank you, please come again!");
        }
    }







}
