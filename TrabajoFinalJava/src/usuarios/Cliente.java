package usuarios;

import java.util.Scanner;

public class Cliente  extends Usuario implements IAsesoria{

	private String rutCliente;
	private String nombres;/*minimo 5 a 30 caracteres*/
	private String apellidos; /*minimo 5 a 30 caracteres*/
	private int telefono; /*al imprimir se agrega el codigo de pais "+"xx x xxxx xxxx*/
	private String afp;	/*minimo 4 a 30 caracteres*/
	private int sistemaSalud;/*1 fonasa 2 isapre*/
	private String direccion;/*70 caracteres*/
	private String comuna;/*50 caracteres*/
	private int edad; /*edad obligatorio 0=< i a <150*/

	//Constructores


	public Cliente(String nombre, String fechaNacimiento, String run, 
			String rutCliente, String nombres, String apellidos, int telefono, 
			String afp, int sistemaSalud, String direccion, String comuna,
			int edad) {
		super(nombre, fechaNacimiento, run);
		this.rutCliente = rutCliente;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.afp = afp;
		this.sistemaSalud = sistemaSalud;
		this.direccion = direccion;
		this.comuna = comuna;
		this.edad = edad;
	}



	public Cliente() {
		super();
	}


	public String getRutCliente() {
		return rutCliente;
	}



	public void setRutCliente(String rutCliente) {
		this.rutCliente = rutCliente;
	}



	public String getNombres() {
		return nombres;
	}



	public void setNombres(String nombres) {
		this.nombres = nombres;
	}



	public String getApellidos() {
		return apellidos;
	}



	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}



	public int getTelefono() {
		return telefono;
	}



	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}



	public String getAfp() {
		return afp;
	}



	public void setAfp(String afp) {
		this.afp = afp;
	}



	public int getSistemaSalud() {
		return sistemaSalud;
	}



	public void setSistemaSalud(int sistemaSalud) {
		this.sistemaSalud = sistemaSalud;
	}



	public String getDireccion() {
		return direccion;
	}



	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}



	public String getComuna() {
		return comuna;
	}



	public void setComuna(String comuna) {
		this.comuna = comuna;
	}



	public int getEdad() {
		return edad;
	}



	public void setEdad(int edad) {
		this.edad = edad;
	}




	@Override
	public String toString() {
		return "Cliente [rutCliente=" + rutCliente + ", nombres=" + nombres + 
				", apellidos=" + apellidos + ", telefono=" + telefono + ", afp=" 
				+ afp + ", sistemaSalud=" + sistemaSalud + ", direccion=" 
				+ direccion + ", comuna=" + comuna + ", edad=" + edad 
				+ ", nombreUsuario=" + nombreUsuario + ", fechaNacimiento="
				+ fechaNacimiento + ", runUsuario=" + runUsuario + "]";
	}



	//method 

	public String nombres() {
		if (nombres.length()>= 5 && nombres.length()<=30) {
			System.out.println("Datos ingresados con exito");
		}else {
			System.out.println("datos invalidos, reintente nuevamnete");
		}
		return nombres;
	}

	public String rutCliente() {
		rutCliente = "";
		if (rutCliente.length()<=8) {
			System.out.println("Datos ingresados con exito");
		}else {
			System.out.println("datos invalidos, reintente nuevamnete");	
		}
		return rutCliente;
	}

	public String apellidos() {
		apellidos="";
		if (apellidos.length()>= 5 && apellidos.length()<=30) {
			System.out.println("Datos ingresados con exito");
		}else {
			System.out.println("datos invalidos, reintente nuevamnete");
		}
		return apellidos;
	}

	public int telefono() {
		telefono = 0;
		if (telefono >= 0) {
			System.out.println("Datos ingresados con exito");
		}else {
			System.out.println("datos invalidos, reintente nuevamnete");
		}
		return telefono;
	}

	public String afp() {
		afp="";
		if (afp.length()>= 4 && afp.length()<=30) {
			System.out.println("Datos ingresados con exito");
		}else {
			System.out.println("datos invalidos, reintente nuevamnete");
		}
		return afp;
	}

	public int sistemaSalud() {

		sistemaSalud = 0;
		System.out.println("Ingrese una opcion:");
		System.out.println("1) Fonasa ");
		System.out.println("2) Isapre");

		switch (sistemaSalud) {
		case 1: System.out.println("Fonasa"); break;
		case 2: System.out.println("Isapre");break;
		}
		return sistemaSalud;
	}
	public String direccion() {
		direccion ="";
		if (direccion.length()<=70) {
			System.out.println("Datos ingresados con exito");
		}else {
			System.out.println("datos invalidos, reintente nuevamnete");
		}
		return direccion;

	}
	public String comuna() {
		comuna ="";
		if (comuna.length()>= 50) {
			System.out.println("Datos ingresados con exito");
		}else {
			System.out.println("datos invalidos, reintente nuevamnete");
		}
		return comuna;
	}
	public int edad() {
		edad =0;
		if (edad >= 0 && edad <=150) {
			System.out.println("Datos ingresados con exito");
		}else {
			System.out.println("datos invalidos, reintente nuevamnete");
		}
		return edad;

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
