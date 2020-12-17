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
import javax.swing.SwingConstants;

public class Leihoa1 extends JFrame {

	private JPanel contentPane;
	private JTextField textizena;

	//OSAGAIEN IZENDAPENAK
	private JLabel labelizenaEgunOn;
	private JButton botoiizena;
	private JLabel labelizena;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Leihoa1 frame = new Leihoa1();
					Leihoa1 frame2 = new Leihoa1();
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
	public Leihoa1() {
				
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		
		textizena = new JTextField();
		textizena.setBounds(125, 35, 218, 20);
		contentPane.add(textizena);
		textizena.setColumns(10);
		
		labelizenaEgunOn = new JLabel("");
		labelizenaEgunOn.setHorizontalAlignment(SwingConstants.TRAILING);
		labelizenaEgunOn.setBounds(144, 187, 199, 31);
		contentPane.add(labelizenaEgunOn);
		
		botoiizena = new JButton("Sartu");
		botoiizena.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			//Jaso izena
				String izena;
				izena=textizena.getText();
			//idatzi "Egun on"
				
			//idatzi izena->Ibl
				
			labelizenaEgunOn.setText("Egun on " +izena);	
				
			}
		});
		botoiizena.setBounds(125, 66, 105, 31);
		contentPane.add(botoiizena);
		
		labelizena = new JLabel("Sartu zure izena");
		labelizena.setBounds(10, 25, 105, 41);
		contentPane.add(labelizena);
		
		
	}
}