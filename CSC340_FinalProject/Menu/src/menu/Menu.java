package menu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/*author: @Jordan Barksdale 
*
*/

public class Menu implements ActionListener { 
	private static JLabel userLabel;
	private static JTextField userText;
	private static JLabel passwordLabel; 
	private static JPasswordField passwordTextField; 
	private static JButton button;
	private static JLabel success; 
        public static JFrame frame;
        public static String user;
        private String password;
        private static JFrame mainMenu;
	public static void main(String[] args) {
		
		//customization for login screen 
                
		JPanel panel = new JPanel();
		frame = new JFrame();
		frame.setSize(1080, 1080);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.setVisible(true);
		frame.add(panel);
		
		
		panel.setLayout(null);
		
		userLabel = new JLabel("User");
		userLabel.setBounds(10, 20, 80, 25);
		panel.add(userLabel);
		
		userText = new JTextField();
		userText.setBounds(100, 20 ,165 ,25);
		panel.add(userText);
		
		passwordLabel = new JLabel("Password");
		passwordLabel.setBounds(10, 50, 80, 25);
		panel.add(passwordLabel);
		
		passwordTextField = new JPasswordField();
		passwordTextField.setBounds(100, 50, 165, 25);
		panel.add(passwordTextField);
		
		button = new JButton("Login");
		button.setBounds(10, 80, 80, 25);
		panel.add(button);
		
		success = new JLabel(""); // no text insterted see later code on how to change sucess text
                
		success.setBounds(10, 110, 300, 25);
		button.addActionListener(new Menu());
		panel.add(success);
		success.setText(null);
		
		
		
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
                 user = userText.getText();
		 password = passwordTextField.getText();
		
		if( user.equals("Manager")&& password.equals("Yourboss")) { //The username and Password for the manager class
                        frame.setVisible(false); //closes login menu
                        mainMenu = new MainMenu();
                        mainMenu.setVisible(true);
                        
                        
			
		}else {
			success.setText("Username/Password is incorrect Try again"); // changes success text to show you entered an incoorect login
		}
		// add more if/else statements to check for specific logins ex. employee login/manufacturer login etc. 
	}
// *to create a new menu easier in the projects folder, right-click menu package, go to new, then create a new JFrame form. 
// *if program runs and login bars do not show just hover and click on where they are supposed to be and they should show up so you can type in them. This may be due to CPU speeds. 
// *feel free to update code for effecincy as needed. 
        
}