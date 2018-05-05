package vista;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Font;

public class Ui extends JFrame {

	private JPanel contentPane;
	private JTextField txtRuta;
	private JTextPane txtCuadroTexto;
	protected JButton btnBuscar;
	protected JButton btnLimpiar;
	private JTextField txtMensaje;


	/**
	 * Create the frame.
	 */
	public Ui() {
		setMinimumSize(new Dimension(900, 500));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setForeground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblNewLabel = new JLabel("BUSCADOR DE MP3");
		lblNewLabel.setFont(new Font("NSimSun", Font.BOLD, 40));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.gridwidth = 3;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 0;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);
		
		JLabel lblRuta = new JLabel("Ruta :");
		GridBagConstraints gbc_lblRuta = new GridBagConstraints();
		gbc_lblRuta.anchor = GridBagConstraints.WEST;
		gbc_lblRuta.insets = new Insets(0, 0, 5, 5);
		gbc_lblRuta.gridx = 1;
		gbc_lblRuta.gridy = 1;
		contentPane.add(lblRuta, gbc_lblRuta);
		
		txtRuta = new JTextField();
		GridBagConstraints gbc_txtRuta = new GridBagConstraints();
		gbc_txtRuta.insets = new Insets(0, 0, 5, 5);
		gbc_txtRuta.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtRuta.gridx = 2;
		gbc_txtRuta.gridy = 1;
		contentPane.add(txtRuta, gbc_txtRuta);
		txtRuta.setColumns(10);
		
		btnBuscar = new JButton("Buscar y Crear");
		GridBagConstraints gbc_btnBuscar = new GridBagConstraints();
		gbc_btnBuscar.fill = GridBagConstraints.BOTH;
		gbc_btnBuscar.insets = new Insets(0, 0, 5, 5);
		gbc_btnBuscar.gridx = 3;
		gbc_btnBuscar.gridy = 1;
		contentPane.add(btnBuscar, gbc_btnBuscar);
		
		JLabel lblArchivosMpEn = new JLabel("Archivos MP3 en la ruta buscada :");
		GridBagConstraints gbc_lblArchivosMpEn = new GridBagConstraints();
		gbc_lblArchivosMpEn.anchor = GridBagConstraints.WEST;
		gbc_lblArchivosMpEn.gridwidth = 2;
		gbc_lblArchivosMpEn.insets = new Insets(0, 0, 5, 5);
		gbc_lblArchivosMpEn.gridx = 1;
		gbc_lblArchivosMpEn.gridy = 2;
		contentPane.add(lblArchivosMpEn, gbc_lblArchivosMpEn);
		
		txtCuadroTexto = new JTextPane();
		txtCuadroTexto.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		GridBagConstraints gbc_txtCuadroTexto = new GridBagConstraints();
		gbc_txtCuadroTexto.gridwidth = 3;
		gbc_txtCuadroTexto.insets = new Insets(0, 0, 5, 5);
		gbc_txtCuadroTexto.fill = GridBagConstraints.BOTH;
		gbc_txtCuadroTexto.gridx = 1;
		gbc_txtCuadroTexto.gridy = 3;
		contentPane.add(txtCuadroTexto, gbc_txtCuadroTexto);
		
		JLabel lblMensaje = new JLabel("Mensaje :");
		GridBagConstraints gbc_lblMensaje = new GridBagConstraints();
		gbc_lblMensaje.anchor = GridBagConstraints.WEST;
		gbc_lblMensaje.insets = new Insets(0, 0, 5, 5);
		gbc_lblMensaje.gridx = 1;
		gbc_lblMensaje.gridy = 4;
		contentPane.add(lblMensaje, gbc_lblMensaje);
		
		txtMensaje = new JTextField();
		txtMensaje.setEditable(false);
		GridBagConstraints gbc_txtMensaje = new GridBagConstraints();
		gbc_txtMensaje.insets = new Insets(0, 0, 5, 5);
		gbc_txtMensaje.fill = GridBagConstraints.BOTH;
		gbc_txtMensaje.gridx = 2;
		gbc_txtMensaje.gridy = 4;
		contentPane.add(txtMensaje, gbc_txtMensaje);
		txtMensaje.setColumns(10);
		
		btnLimpiar = new JButton("Limpiar");
		GridBagConstraints gbc_btnLimpiar = new GridBagConstraints();
		gbc_btnLimpiar.fill = GridBagConstraints.BOTH;
		gbc_btnLimpiar.insets = new Insets(0, 0, 5, 5);
		gbc_btnLimpiar.gridx = 3;
		gbc_btnLimpiar.gridy = 4;
		contentPane.add(btnLimpiar, gbc_btnLimpiar);
	}

	public JTextField getTxtRuta() {
		return txtRuta;
	}

	public void setTxtRuta(JTextField txtRuta) {
		this.txtRuta = txtRuta;
	}

	public JTextPane getTxtCuadroTexto() {
		return txtCuadroTexto;
	}

	public void setTxtCuadroTexto(JTextPane txtCuadroTexto) {
		this.txtCuadroTexto = txtCuadroTexto;
	}

	public JButton getBtnBuscar() {
		return btnBuscar;
	}

	public JButton getBtnLimpiar() {
		return btnLimpiar;
	}

	public JTextField getTxtMensaje() {
		return txtMensaje;
	}
}
