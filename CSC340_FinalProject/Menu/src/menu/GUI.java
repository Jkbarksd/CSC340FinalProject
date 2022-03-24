package menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/*
 * @Author Kevin Cisneros 
 * @Author Angie Chen
 * @Author Brooklyn Terry
 * @Author Cynthia Espinoza
 * @Author Jordan Barksdale
 * March 23, 2022
 * Purpose:Create a login template that will ask the user for userID  and password
 */
public class GUI implements ActionListener {
    //Variables to be accessed 

    private static JLabel label;
    private static JLabel passwordlabel;
    private static JLabel success;
    private static JPasswordField passwordtext;
    private static JTextField text;
    private static JButton login;
    //Frame is public static so that it can be called by other function to return back to login
    public static JFrame frame;
    private static JFrame manaMenu;//Manager Menu
    private static JFrame manuMenu;//Manufactuer Menu
    private static JFrame invManMenu; // Inventory Manager Menu
    private static JFrame empMenu; // Employee Menu
    private static JFrame modMenu; // Moderator Menu
    public static void main(String[] args) {

        //framework
        JPanel panel = new JPanel();
        frame = new JFrame();

        frame.setSize(900, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        //layout
        panel.setLayout(null);

        //Company Label 
        JLabel title = new JLabel("Online Delivery System");
        title.setBounds(100, 70, 180, 25);
        panel.add(title);

        //Label
        label = new JLabel("User ID:");
        label.setBounds(100, 200, 180, 25);
        panel.add(label);

        //Password label
        passwordlabel = new JLabel("Password:");
        passwordlabel.setBounds(90, 230, 180, 25);
        panel.add(passwordlabel);

        //Label for successful login 
        success = new JLabel("");
        success.setBounds(100, 280, 300, 25);
        panel.add(success);

        //Textfield for user input  
        text = new JTextField(20);
        text.setBounds(160, 200, 165, 25);
        panel.add(text);

        //Password Textfield
        passwordtext = new JPasswordField();
        passwordtext.setBounds(160, 230, 165, 25);
        panel.add(passwordtext);

        //Add Button for input
        login = new JButton("Login");
        login.setBounds(100, 260, 80, 25);
        login.addActionListener(new GUI());
        panel.add(login);

        //Display 
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Our Action method 
        String user = text.getText();
        String password = passwordtext.getText();

        //determine if it exists for each respective person
        //Manager 
        if (user.equals("Manager") && password.equals("Yourboss")) {
            //Hide to then return when logged out (WIP)
            frame.setVisible(false);
            success.setVisible(false);
            //redirect to menu
            manaMenu = new ManagerMenu();
            manaMenu.setVisible(true);

        }//end if statement, run next test
        //Employee
        else if (user.equals("Employee") && password.equals("Work")) {
           
            success.setVisible(false);
            //Hide to then return when logged out (WIP)
            frame.setVisible(false);

            //redirect to menu
            empMenu = new EmployeeMenu();
            empMenu.setVisible(true);
        } //Inventory Manager
        else if (user.equals("Invmanager") && password.equals("Stocks")) {
            success.setVisible(false);
            //Hide to then return when logged out (WIP)
            frame.setVisible(false);
            //redirect to menu
            invManMenu = new InventoryManager ();
            invManMenu.setVisible(true);

        } //Moderator
        else if (user.equals("Mod") && password.equals("Logic")) {
            success.setVisible(false);
            //Hide to then return when logged out (WIP)
            frame.setVisible(false);
            //redirect to menu
            modMenu = new ModeratorMenu();
            modMenu.setVisible(true);

        } else if (user.equals("Manufactuer") && password.equals("Fun")) {
           success.setVisible(false);
            //Hide to then return when logged out (WIP)
            frame.setVisible(false);
            //redirect to menu
            manuMenu = new Manufactuermenu();
            manuMenu.setVisible(true);
        } else {
            success.setText("Invalid Username/password, please try again");
        }

    }

}
