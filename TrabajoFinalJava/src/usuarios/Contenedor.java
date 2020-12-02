package usuarios;
import prevencion.*;


import java.util.ArrayList;
import java.util.List;

//arraylists

public class Contenedor {

	  ArrayList<IAsesoria> contenedor = new ArrayList<IAsesoria>();
	 
	 //Constructor Vacio a base del nombre de la Clase
	  public Contenedor() {
		 super();
	 }
	  
	  public void almacenarUsuarios(IAsesoria usuario) {
		  contenedor.add(usuario);
		  
	  }
	  
	  public void eliminarUsuarios(IAsesoria usuario) {
		  contenedor.remove(usuario);
	
	  }
	  
	  
	  public void showElements() {
		  System.out.println(contenedor);
	  }
	  
	  public void deleteElementByRut(String run) {	
			for (int i = 0; i < contenedor.size(); i++) {
				if (contenedor.get(i).encontrarPorRun(run)) {
					System.out.println("Encontrado");
					contenedor.remove(i);
				} else {
					System.out.println("No Encontrado");
				}
			}
	  }
	  
	  public void listarUsuariosTipo(IAsesoria tipo) {
		  Usuario.add(tipo);
	  }
	
	  private List<RegistroCapacitacion> capacitacion = 
			  new ArrayList<RegistroCapacitacion>();
	  public void listarCapacitaciones(RegistroCapacitacion capacitacion) {
		  capacitacion.add(capacitacion);
	  }

	
	
}
