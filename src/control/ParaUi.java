package control;

import java.io.File;
import java.util.Iterator;
import acciones.Buscar;
import acciones.Limpiar;
import modelo.Control;
import vista.Ui;

public class ParaUi extends Ui {

	private MALBuscar listenerBuscar;
	private MALLimpiar listenerLimpiar;
	private Buscar buscar;
	private Limpiar limpiar;
	private Control control;

	public ParaUi() {
		super();
		this.buscar = new Buscar(this);
		this.limpiar = new Limpiar(this);
		this.control = new Control();
		this.listenerBuscar = new MALBuscar(this, this.buscar);
		this.listenerLimpiar = new MALLimpiar(this, this.limpiar);
		asignarListener();
	}

	public Control getControl() {
		return control;
	}

	public void actualizarCuadroTexto() {
		this.getTxtCuadroTexto().setText("");
		for (File file : this.getControl().getFicheros()) {
			this.getTxtCuadroTexto().setText(this.getTxtCuadroTexto().getText() + file + "\r\n");
		}

	}

	private void asignarListener() {
		this.btnLimpiar.addActionListener(listenerLimpiar);
		this.btnBuscar.addActionListener(listenerBuscar);
	}

	public void limpiarListas() {
		getControl().eliminarListaMP3();
		getControl().eliminarArchivo();
	}

}
