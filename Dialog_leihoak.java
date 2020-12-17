package eb1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Dialog_leihoak extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dialog_leihoak frame = new Dialog_leihoak();
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
	public Dialog_leihoak() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null,(String)"Elkarrizketa koadroak proba","Elkarrizketa koadroa mezua",
						JOptionPane.INFORMATION_MESSAGE,null);
			}
		});
		btnNewButton.setBounds(10, 27, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String erantzuna = (String)JOptionPane.showInputDialog
						(null,(String)"Sartu izena: ","Datuak sartzeko elkarrizketa koadroa ",
								JOptionPane.QUESTION_MESSAGE,null, null, "Sartu izena");
			System.out.println(erantzuna);
			}
			
		});
		btnNewButton_1.setBounds(10, 93, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				
				
				
				int aukera = JOptionPane.showConfirmDialog(null,(String)"Elkarrizketa koadroen proba ","Baieztatze koadroa"
						,JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,
						null);
				
				System.out.println(aukera);
				if (aukera==0){
					System.out.println("aitor");
				}
				if (aukera==1){
					System.out.println("alba");
				}
				if (aukera==2){
					System.out.println("herrera");
}
				
			}
		});
		btnNewButton_2.setBounds(10, 159, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("New button");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				String[] aukerak = {"1AS3", "2AS3", "1DW3", "2DW3", "1SM2", "2SM2"};
				int aukera = JOptionPane.showOptionDialog (null,"Zein mailatako ikaslea zara","Elkarrizketa koadroa aukera pertsonalizatuekin",
								JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,aukerak,aukerak[0]); 
				System.out.println(aukerak[aukera]);
			}
		});
		btnNewButton_3.setBounds(10, 227, 89, 23);
		contentPane.add(btnNewButton_3);
	}

}
