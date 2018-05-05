package acciones;

import control.ParaUi;

public class Limpiar {
	
	private ParaUi paraui;

	public Limpiar(ParaUi paraui) {
		super();
		this.paraui = paraui;
	}
	
	public void limpiarTextos() {
		this.paraui.getTxtCuadroTexto().setText("");
		this.paraui.getTxtRuta().setText("");
		this.paraui.getTxtMensaje().setText("Todo Limpio");
		this.paraui.limpiarListas();
	}

}
