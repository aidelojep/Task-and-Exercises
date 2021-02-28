import javax.swing.*;

public class ModifiedAccount {

    private String name;
    private double balance;

    public ModifiedAccount(String name, double balance) {
        this.name = name;
        if (balance > 0.0)
            this.balance = balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void Withdraw(double withdrawal) {
        if (withdrawal > balance) {
            JOptionPane.showMessageDialog(null, "Your balance is lessed than your withdrawal request!");
        }
    }
;}
