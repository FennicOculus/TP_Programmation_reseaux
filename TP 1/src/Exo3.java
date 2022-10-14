import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.JTextField;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;



public class Exo3 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exo3 frame = new Exo3();
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
	public Exo3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			
		File rep;
		String [] ListeFichiers;
		String Path = "C:\\Users\\Lina\\Desktop\\Sam\\Progs\\Java Progs\\TP1 ProgRsx";
		
		
		
		rep = new File(Path);
		if (!rep.isDirectory()) System.exit(0);
		
		
		ListeFichiers = rep.list();
		
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JList list = new JList();
		list.setBounds(33, 11, 162, 239);
		contentPane.add(list);
		list.setListData(ListeFichiers);
		
		//String i = (String) list.getSelectedValue();
		
		
		//filePath = Paths.get(Path+"\\"+".classpath");
		
		MouseListener mouse = new MouseAdapter() {
			public void mouseClicked(MouseEvent event) {
				JList thelist = (JList) event.getSource();
				if (event.getClickCount() == 1) {
					int index = thelist.locationToIndex(event.getPoint());
					if (index > 0 ) {
						Object o = thelist.getModel().getElementAt(index);
						//System.out.println(o.toString());
						String s = o.toString();
						Path filePath = Paths.get(Path+"\\"+s);
						
						BasicFileAttributes att = null;
						try {
							att = Files.readAttributes(filePath, BasicFileAttributes.class);
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						//String 
						//System.out.println(att.isDirectory());
						
					}
				}
			}
		};
		list.addMouseListener(mouse);
		
		textField = new JTextField();
		textField.setBounds(237, 36, 171, 20);
		contentPane.add(textField);
		textField.setColumns(10);
	}
}
