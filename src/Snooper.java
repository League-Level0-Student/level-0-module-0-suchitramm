import javax.swing.JOptionPane;

public class Snooper {
public static void main(String[] args) {
String name= JOptionPane.showInputDialog("what is you adress");
String name1= JOptionPane.showInputDialog("Whats your social secrurity number?");
String name2= JOptionPane.showInputDialog("whats credit card info");
String name3= JOptionPane.showInputDialog("when are you usually alone");
JOptionPane.showMessageDialog(null, "Your Adress Is "+name); 
JOptionPane.showMessageDialog(null, "Your Social Security Number Is "+name1);
JOptionPane.showMessageDialog(null, "Your Credit Card Info Is "+name2);
JOptionPane.showMessageDialog(null, "You Are Usually alone at "+name3);}
}
