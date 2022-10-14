import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.io.FileReader;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class Exo2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exo2 frame = new Exo2();
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
	public Exo2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 11, 414, 190);
		contentPane.add(textArea);
		
		JButton btnNewButton = new JButton("Lire Fichier");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					FileReader reader = new FileReader("C:\\Users\\Lina\\Desktop\\Sam\\Progs\\Java Progs\\File.txt");
					textArea.read(reader, "C:\\Users\\Lina\\Desktop\\Sam\\Progs\\Java Progs\\File.txt");
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(10, 212, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Quitter");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ClickedButton = JOptionPane.showConfirmDialog(null,"Etes-vous sur de vouloir quitter?", "Quitter", JOptionPane.YES_NO_OPTION);
				if (ClickedButton == JOptionPane.YES_OPTION) {
					dispose();
				}
			}
		});
		btnNewButton_1.setBounds(335, 212, 89, 23);
		contentPane.add(btnNewButton_1);
		
		
	}
}
