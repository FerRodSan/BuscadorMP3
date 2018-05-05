package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import acciones.Limpiar;

public class MALLimpiar implements ActionListener {

	private ParaUi paraui;
	private Limpiar limpiar;

	public MALLimpiar(ParaUi paraui, Limpiar limpiar) {
		super();
		this.paraui = paraui;
		this.limpiar = limpiar;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		this.limpiar.limpiarTextos();
	}

}
