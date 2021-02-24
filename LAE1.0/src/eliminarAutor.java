import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JTextPane;
import java.awt.Panel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class eliminarAutor extends JFrame {
	
	
	ArrayList mis_autores;
	Autor un_autor;
	private ArrayList autores;
	

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					eliminarAutor frame = new eliminarAutor();
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
	public eliminarAutor() {
		setTitle("Elimar Autor");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Selecciona el Id del autor:");
		lblNewLabel.setBounds(10, 39, 169, 14);
		contentPane.add(lblNewLabel);
		
		JList list = new JList();
		list.setBounds(153, 51, 73, -12);
		contentPane.add(list);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			

	            

			
			
			}
		});
		comboBox.setBounds(137, 35, 102, 22);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel_1 = new JLabel("Nacionalidad:");
		lblNewLabel_1.setBounds(12, 148, 71, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Nombre:");
		lblNewLabel_1_1.setBounds(37, 98, 46, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Apellidos:");
		lblNewLabel_1_2.setBounds(29, 123, 73, 14);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("F. Nacimiento:");
		lblNewLabel_1_3.setBounds(10, 173, 71, 14);
		contentPane.add(lblNewLabel_1_3);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(93, 98, 102, 14);
		contentPane.add(textPane);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setBounds(93, 123, 102, 14);
		contentPane.add(textPane_1);
		
		JTextPane textPane_1_1 = new JTextPane();
		textPane_1_1.setBounds(93, 148, 102, 14);
		contentPane.add(textPane_1_1);
		
		JTextPane textPane_1_2 = new JTextPane();
		textPane_1_2.setBounds(93, 178, 102, 14);
		contentPane.add(textPane_1_2);
		
		JButton btnNewButton = new JButton("Eliminar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			
			
			}
			
		});
		btnNewButton.setBounds(68, 214, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				
			}
		});
		btnCerrar.setBounds(238, 214, 89, 23);
		contentPane.add(btnCerrar);
	}
}
