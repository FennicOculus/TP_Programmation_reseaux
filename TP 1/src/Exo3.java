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
		setBounds(100, 100, 573, 300);
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
		list.setBounds(10, 11, 162, 197);
		contentPane.add(list);
		list.setListData(ListeFichiers);
		
		JList list_1 = new JList();
		list_1.setBounds(232, 60, 225, 148);
		contentPane.add(list_1);
		
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
						String dir = "";
						if (att.isDirectory() == true) {
							dir = "IsDirectory";
						}else {
							dir = "IsNotDirectory";
						}
						String totatl = dir + " // Creation Time " + att.creationTime()
						+" // Last Access Time "+att.lastAccessTime()+" // Last Modification " + att.lastModifiedTime();
						System.out.println(totatl);
						textField.setText(totatl);
						
					}
				}
				if (event.getClickCount() == 2) {
					int index = thelist.locationToIndex(event.getPoint());
					if (index > 0 ) {
						Object o = thelist.getModel().getElementAt(index);
						String s = o.toString();
						Path filePath = Paths.get(Path+"\\"+s);
						File rep2 = new File(Path+"\\"+s);
						
						if (rep2.isDirectory()) {
							String [] ListeFichiers2;
							ListeFichiers2 = rep2.list();
							list_1.setListData(ListeFichiers2);
						}else{
							System.out.println("Not Directory");
						}
						
						
						
					}
				}
			}
		};
		list.addMouseListener(mouse);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(10, 219, 537, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		
		
	}
}
