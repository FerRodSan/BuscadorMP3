package modelo;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Control {

	private File file;
	private String formato = "mp3";
	private ArrayList<File> ficheros;
	private ArrayList<File> archivosMP3;

	public Control() {
		super();
		this.ficheros = new ArrayList<>();
		this.archivosMP3 = new ArrayList<>();
	}

	public void buscarArchivosEnCarpeta(File carpeta) {
		for (File dummy : carpeta.listFiles()) {
			if (isFormato(dummy)) {
				this.archivosMP3.add(dummy.getAbsoluteFile());
			}
		}
	}

	public File crearArchivo(String ruta) {
		this.file = new File(ruta);
		return this.file;
	}

	public void introducirMp3Texto() {
		for (File file : archivosMP3) {
			this.ficheros.add(file);
		}
	}
	
//	public void crearTXTmptres() {
//		File txtmptres = new File(formato);
//		try {
//			txtmptres.createNewFile();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		for (File file : this.ficheros) {
//			
//		}
//	}

	private boolean isFormato(File file) {
		return file.getName().toLowerCase().endsWith(this.formato);
	}

	public ArrayList<File> getFicheros() {
		return ficheros;
	}

	public ArrayList<File> getArchivosMP3() {
		return archivosMP3;
	}

	public void eliminarArchivo() {
		this.file.delete();

	}

	public void eliminarListaMP3() {
		this.archivosMP3.clear();

	}

}
