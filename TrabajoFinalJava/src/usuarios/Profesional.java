package usuarios;

import java.util.Date;

public class Profesional extends Usuario implements IAsesoria{
/*Atributos de clase*/
	
	private String titulo;/*minimo 10 a 50 caracteres*/
	private String fechaIngreso; /*formato dd/mm/aaaa */
	
	
	//contructores
	
	public Profesional(String nombre, String fechaNacimiento, String run, 
			String titulo, String fechaIngreso) {
		super(nombre, fechaNacimiento, run);
		this.titulo = titulo;
		this.fechaIngreso = fechaIngreso;
	}
	
	
public Profesional() {
		super();
	}



//Getters and Setters
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	
	@Override
	public String toString() {
		return "Profesional [titulo=" + titulo + ", fechaIngreso=" + 
				fechaIngreso + ", nombre=" + nombreUsuario + ", fechaNacimiento=" + 
				fechaNacimiento + ", run=" + runUsuario + "]";
	}
	
	
	public void analizarUsuario() {
		
		System.out.println( "el Usuario " + nombreUsuario+ " "+ "Con run " 
				 + runUsuario + " con fecha de nacimiento " + fechaIngreso 
				 + ", " + "con titulo de "+ titulo );
	
	}

	public String titulo() { //ARREGLAR

		titulo ="";
		if (titulo.length()>= 10 && titulo.length()<=50) {
			System.out.println("Datos ingresados con exito");
		}else {
			System.out.println("datos invalidos, reintente nuevamnete");
		}
		return titulo;
	}
	
	public String fechaIngreso() {
		return fechaIngreso;
		
		//fechaIngreso =dd-mm-aaaa;
		
		//if (fechaIngreso.length()<=10) {
		/*System.out.println("Datos ingresados con exito");*/
		//}else {
			//System.out.println("datos invalidos, reintente nuevamnete");
		}
	@Override
	public boolean encontrarPorRun(String runUsuario) {
		if (runUsuario.equals(this.runUsuario)) {
			return true;
		} else {
			return false;
		}	
	}
}
