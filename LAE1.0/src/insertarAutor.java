

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class insertarAutor extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	static ArrayList la_lista;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					insertarAutor frame = new insertarAutor(la_lista);
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
	
	public insertarAutor(ArrayList mis_autores) {
		la_lista=mis_autores;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 417, 335);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Inserta los datos para dar de alta a un autor:");
		lblNewLabel.setBounds(10, 21, 278, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Id Autor:");
		lblNewLabel_1.setBounds(10, 54, 52, 13);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(64, 51, 96, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Nombre: ");
		lblNewLabel_1_1.setBounds(10, 83, 52, 13);
		contentPane.add(lblNewLabel_1_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(64, 80, 96, 19);
		contentPane.add(textField_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Apellidos:");
		lblNewLabel_1_2.setBounds(10, 112, 52, 13);
		contentPane.add(lblNewLabel_1_2);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(64, 109, 96, 19);
		contentPane.add(textField_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Nacionalidad:");
		lblNewLabel_1_3.setBounds(10, 138, 72, 13);
		contentPane.add(lblNewLabel_1_3);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(92, 135, 96, 19);
		contentPane.add(textField_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("F Nacimiento");
		lblNewLabel_1_4.setBounds(10, 164, 72, 13);
		contentPane.add(lblNewLabel_1_4);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(92, 161, 96, 19);
		contentPane.add(textField_4);
		
		Button button = new Button("Aceptar");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Autor un_autor = new Autor(Integer.parseInt(textField.getText()),textField_1.getText(),textField_2.getText(),
						textField_3.getText(),textField_4.getText());
				la_lista.add(un_autor);
				Autor mi_autor = (Autor) la_lista.get(0);
				JOptionPane.showMessageDialog(null, mi_autor.getNombre()+ " "+mi_autor.getApellidos()+ " "+mi_autor.getNacionalidad()+
						" " + mi_autor.getF_nacimiento());
			}
		});
		button.setBounds(16, 213, 66, 21);
		contentPane.add(button);
		
		Button button_1 = new Button("Resetar");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				textField_4.setText("");
				
			}
		});
		button_1.setBounds(133, 213, 66, 21);
		contentPane.add(button_1);
		
		Button button_2 = new Button("Cancelar");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		button_2.setBounds(238, 213, 66, 21);
		contentPane.add(button_2);
	}
}
