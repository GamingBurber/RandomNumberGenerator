package numberGenCode;

import java.util.Random;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Window.Type;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.JEditorPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class RandomNumbGen {

	public JFrame frmRandomNumb;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RandomNumbGen window = new RandomNumbGen();
					window.frmRandomNumb.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	
	public RandomNumbGen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frmRandomNumb = new JFrame();
		frmRandomNumb.setTitle("0-1000 Random Numb Gen");
		frmRandomNumb.setBackground(Color.GRAY);
		frmRandomNumb.getContentPane().setBackground(Color.GRAY);
		frmRandomNumb.getContentPane().setLayout(null);
		
		
		
		JButton btnNewButton = new JButton("Generate Random Number");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Random rand = new Random();
				int upperbound = 1001;
				int int_random = rand.nextInt(upperbound);
				JOptionPane.showMessageDialog(btnNewButton, "Random Number Between 0 and " + (upperbound -1) + " is: "+ int_random );
			}
		});
		btnNewButton.setBackground(Color.DARK_GRAY);
		btnNewButton.setForeground(Color.LIGHT_GRAY);
		btnNewButton.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 50));
		btnNewButton.setBounds(10, 11, 726, 232);
		frmRandomNumb.getContentPane().add(btnNewButton);
		frmRandomNumb.setBounds(100, 100, 760, 291);
		frmRandomNumb.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
