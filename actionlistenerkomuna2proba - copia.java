package eb1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.FocusListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class actionlistenerkomuna2proba extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblNewLabel_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					actionlistenerkomuna2proba frame = new actionlistenerkomuna2proba();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public actionlistenerkomuna2proba() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Aurrera");
		btnNewButton.addActionListener(new Markel() {
			
		});
		btnNewButton.setBounds(5, 233, 424, 23);
		contentPane.add(btnNewButton);
		
		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				
			}
		});
		textField.addActionListener(new Markel() {
		});
		textField.setBounds(186, 40, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.addActionListener(new Markel() {
		
		});
		textField_1.setBounds(186, 101, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Erabiltzailea");
		lblNewLabel.setBounds(44, 43, 77, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Pasahitza");
		lblNewLabel_1.setBounds(44, 104, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(44, 160, 270, 29);
		contentPane.add(lblNewLabel_2);
	}
	
	public class Markel implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			// datu egokiak definitu
			String IzenEgokia = new String("1dw3");
			String PasahitzaEgokia = new String("1dw3");
			// datuak konprobatu
			//  JPasswordField-en getPassword metodoak    char[] bueltatzen du
			//  beraz, string bihurtu behar dugu
			String contrasena = new String(textField_1.getText());
			if(IzenEgokia.equals(textField_1.getText()) && PasahitzaEgokia.equals(contrasena)){
				lblNewLabel_2.setText("Ongietorria "+textField.getText());
			}
			else{
				lblNewLabel_2.setText("Datu ez egokiak. ");
			}	
			if (e.) {
				
			}
			
			
			
		}
	
	
	}	
}



















