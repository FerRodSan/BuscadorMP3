package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import acciones.Buscar;

public class MALBuscar implements ActionListener {

	private ParaUi paraui;
	private Buscar buscar;

	public MALBuscar(ParaUi paraui, Buscar buscar) {
		super();
		this.paraui = paraui;
		this.buscar = buscar;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(!this.paraui.getTxtRuta().getText().isEmpty()) {
			this.buscar.buscarRuta();
		}else {
			this.paraui.getTxtMensaje().setText("Ruta en blanco");
		}
	}

}
