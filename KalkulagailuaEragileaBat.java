package eb1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class KalkulagailuaEragileaBat extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JLabel lblNewLabel;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KalkulagailuaEragileaBat frame = new KalkulagailuaEragileaBat();
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
	public KalkulagailuaEragileaBat() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 188, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		textField = new JTextField();
		contentPane.add(textField, BorderLayout.NORTH);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("X2");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int znbk=0;
				
				znbk=Integer.parseInt(textField.getText());
				znbk=znbk*znbk;
				String zenbakia;
				zenbakia=Integer.toString(znbk);
				lblNewLabel.setText(zenbakia);
			}
		});
		contentPane.add(btnNewButton, BorderLayout.WEST);
		
		lblNewLabel = new JLabel("");
		contentPane.add(lblNewLabel, BorderLayout.SOUTH);
		
		btnNewButton_1 = new JButton("New button");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int znbk=0;
				
				znbk=Integer.parseInt(textField.getText());
				znbk=znbk*znbk;
				String zenbakia;
				zenbakia=Integer.toString(znbk);
				lblNewLabel.setText(zenbakia);
			}
		});
		contentPane.add(btnNewButton_1, BorderLayout.CENTER);
		
		btnNewButton_2 = new JButton("New button");
		contentPane.add(btnNewButton_2, BorderLayout.EAST);
	}

}
