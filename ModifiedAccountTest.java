import javax.swing.JOptionPane;

public class ModifiedAccountTest {
    public static void main(String[] args) {

        ModifiedAccount myAccount1 = new ModifiedAccount( "Ismail"  , 200);
        ModifiedAccount myAccount2 = new ModifiedAccount( "Tunde" , 100000);


       int amount = Integer.parseInt(JOptionPane.showInputDialog("How much would you like to withdraw?"));

       String message = String.format("Thank you, we are processing your transaction");

        JOptionPane.showMessageDialog(null, message);
        myAccount1.Withdraw(amount);

        JOptionPane.showMessageDialog(null, "Your balance is : " + myAccount1.getBalance() );




    }




}