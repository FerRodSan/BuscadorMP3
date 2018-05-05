package control;

import java.awt.EventQueue;

import vista.Ui;

public class Principal {

	// Crea un programa que genere un archivo de texto con la ruta absoluta de todos
	// los archivos mp3 que contenga un directorio ipt. El archivo debe llevar el
	// nombre de la carpeta que analiza y la extensión bm3

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ParaUi frame = new ParaUi();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
