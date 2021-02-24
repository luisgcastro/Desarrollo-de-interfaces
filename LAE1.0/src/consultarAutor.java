import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class consultarAutor extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					consultarAutor frame = new consultarAutor();
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
	public consultarAutor() {
		setTitle("Consultar un autor");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 567, 348);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(89, 26, 116, 20);
		contentPane.add(textPane);
		
		JLabel lblNewLabel = new JLabel("Id autor:");
		lblNewLabel.setBounds(33, 32, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(33, 70, 46, 14);
		contentPane.add(lblNombre);
		
		JLabel lblApellidos = new JLabel("Apellidos:");
		lblApellidos.setBounds(33, 113, 46, 14);
		contentPane.add(lblApellidos);
		
		JLabel lblNacionalidad = new JLabel("Nacionalidad:");
		lblNacionalidad.setBounds(10, 149, 69, 14);
		contentPane.add(lblNacionalidad);
		
		JLabel lblFnacimiento = new JLabel("F.nacimiento:");
		lblFnacimiento.setBounds(10, 186, 79, 14);
		contentPane.add(lblFnacimiento);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setBounds(89, 64, 116, 20);
		contentPane.add(textPane_1);
		
		JTextPane textPane_2 = new JTextPane();
		textPane_2.setBounds(89, 107, 116, 20);
		contentPane.add(textPane_2);
		
		JTextPane textPane_3 = new JTextPane();
		textPane_3.setBounds(89, 143, 116, 20);
		contentPane.add(textPane_3);
		
		JTextPane textPane_4 = new JTextPane();
		textPane_4.setBounds(89, 180, 116, 20);
		contentPane.add(textPane_4);
		
		JButton btnNewButton = new JButton("Consultar");
		btnNewButton.setBounds(116, 250, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				
			}
		});
		btnCerrar.setBounds(292, 250, 89, 23);
		contentPane.add(btnCerrar);
	}
}
