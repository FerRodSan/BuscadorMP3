package acciones;

import java.io.File;

import control.ParaUi;

public class Buscar {

	private ParaUi paraui;

	public Buscar(ParaUi paraui) {
		super();
		this.paraui = paraui;
	}

	public void buscarRuta() {
		String ruta = this.paraui.getTxtRuta().getText();
		File carpeta = this.paraui.getControl().crearArchivo(ruta);
		if (carpeta.isDirectory() && carpeta.exists()) {
			this.paraui.getControl().buscarArchivosEnCarpeta(carpeta);
			this.paraui.getControl().introducirMp3Texto();
			this.paraui.actualizarCuadroTexto();
			this.paraui.getTxtMensaje().setText("Archivos encontrados");
		} else {
			this.paraui.getTxtMensaje().setText("la ruta no es adecuada");
		}
	}

}
