/*
 * @Autor: Jean Billiard Vergara
 * @Autor: Jerson Sanchez Lara
 * @Autor: Jenifer Luengo Contreras
 * @autor: Alexis Leon Villegas
 * 
 */




package usuarios;
import prevencion.*;

import java.util.List;
import java.util.Scanner;



public class Menu {
	
	public static void main(String args[]) {

		int opcionMenu = 0;
		do {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("***********************************");
		System.out.println("Bienvendo porfavor seleccione una opcion ");
		System.out.println("***********************************");
		System.out.println(" ");
		System.out.println("1. Almacenar Cliente ");
		System.out.println("2. Almacenar Profesional");
		System.out.println("3. Almacenar Administrativo");
		System.out.println("4. Almacenar Capacitacitacion");
		System.out.println("5. Eliminar Usuario");
		System.out.println("6. Listar Usuarios");
		System.out.println("7. Listar Usuarios por tipo");
		System.out.println("8. Listar Capacitaciones");
		System.out.println("9. SALIR");
		System.out.println("Por favor ingrese solo numeros");
		System.out.println("***********************************");
		
		opcionMenu= sc.nextInt();
		Contenedor listado = new Contenedor();
		
		switch(opcionMenu) {
		case 1: 
			Cliente usu1 = new Cliente();
			System.out.println("ingrese Perfiles a ingresar");
			int cantidadPerfiles = sc.nextInt();
			
			for (int i = cantidadPerfiles; i > 0; i--) {
				System.out.println("Ingresó a crear un nuevo perfil de Cliente");
				System.out.println("***********************************");
				System.out.println("ingrese Datos de usuario");
				System.out.println("***********************************");
				System.out.println("Ingrese Nombre de Usuario: ");
				String nombreUsuario = sc.next();
				System.out.println("Ingrese Fecha de Nacimiento");
				String fechaNacimiento = sc.next();
				System.out.println("Ingrese Run de usuario");
				int runUsuario = sc.nextInt();
				System.out.println("ingrese run");
				int run = sc.nextInt();
				System.out.println("ingrese Nombre");
				String nombre = sc.next();
				System.out.println("Ingrese Apellidos");
				String apellidos = sc.nextLine();
				sc.next();
				System.out.println("ingrese Telefono");
				int telefono = sc.nextInt();
				System.out.println("ingrese Afp");
				String afp = sc.next();
				System.out.println("Seleccione Sistema de Salud, ingrese solo el"
					+ " numero");
				System.out.println("1) Fonasa");
				System.out.println("2) Isapre");
				int sistemaSalud = sc.nextInt();
				System.out.println("ingrese Direccion");
				String direccion = sc.next();
				System.out.println("Ingrese Comuna");
				String comuna = sc.next();
				System.out.println("Ingrese Edad");
				int edad = sc.nextInt();
				listado.almacenarUsuarios(usu1);
				System.out.println("Cliente "   + nombreUsuario + " " + apellidos + 
						" " + "ha sido resgistrado Con exito");
				System.out.println("***********************************");
			}
			break;
		case 2:
			
			System.out.println("ingrese Perfiles a ingresar");
			int cantidadPerfiles1 = sc.nextInt();
			for ( int j  = cantidadPerfiles1; j > 0; j--) {
			Profesional pro1 = new Profesional();
			System.out.println("Ingresó a crear un nuevo perfil de profesional");
			System.out.println("***********************************");
			System.out.println("ingrese Datos de usuario");
			System.out.println("***********************************");
			System.out.println("Ingrese Nombre de Usuario: ");
			String nombreUsuario1 = sc.next();
			System.out.println("Ingrese Fecha de Nacimiento");
			String fechaNacimiento1 = sc.next();
			System.out.println("Ingrese Run de usuario");
			int runUsuario1 = sc.nextInt();
			System.out.println("Ingrese Nombre de Usuario: ");
			String titulo = sc.next();
			System.out.println("Ingrese Fecha de Nacimiento");
			String fechaIngreso = sc.nextLine();
			listado.almacenarUsuarios(pro1);
			System.out.println("Profesional"   + nombreUsuario1 + " " + 
			runUsuario1 + " " + "ha sido resgistrado Con exito");
			}
			break;
		case 3:
			System.out.println("ingrese Perfiles a ingresar");
			int cantidadPerfiles21 = sc.nextInt();
			for (int k = cantidadPerfiles21; k > 0; k--) {
			Administrativo adm1 = new Administrativo();
			System.out.println("Ingresó a crear un nuevo perfil de administrativo");
			System.out.println("***********************************");
			System.out.println("ingrese Datos de usuario");
			System.out.println("***********************************");
			System.out.println("Ingrese Nombre de Usuario: ");
			String nombreUsuario2 = sc.next();
			System.out.println("Ingrese Fecha de Nacimiento");
			String fechaNacimiento2 = sc.next();
			System.out.println("Ingrese Run de usuario");
			int runUsuario2 = sc.nextInt();
			System.out.println("Ingrese Area: ");
			String area = sc.next();
			System.out.println("Ingrese Experiencia");
			String experiencia = sc.next();
			listado.almacenarUsuarios(adm1);
			System.out.println("Administrativo"   + nombreUsuario2 + " " +
			fechaNacimiento2 + " " + "ha sido resgistrado Con exito");
			}
			break;
		case 4:
			System.out.println("ingrese Perfiles a ingresar");
			int cantidadPerfiles3 = sc.nextInt();
			for (int l = cantidadPerfiles3; l > 0; l--) {
				System.out.println("***********************************");
			System.out.println("Ingresó a crear una Capacitacion");
			System.out.println("***********************************");
			System.out.println("ingrese Indentificador Interno");
			String identificador = sc.next();
			System.out.println("ingrese Rut Cliente");
			String rutCliente = sc.next();
			System.out.println("ingrese numero de dia de semana");
			int diaCapacitacion = (sc.nextInt()); 
			System.out.println("ingrese hora de Capacitacion");
			String horaCapacitacion = sc.next();
			System.out.println("ingrese lugar de Capacitacion");
			String lugar = sc.next();
			System.out.println("ingrese duracion de la capacitacion");
			String duracion = sc.next();
			System.out.println("ingrese Cantidad de Asistentes");
			int cantidadAsistentes = sc.nextInt();
			System.out.println("Capacitacion"   + identificador + " " + rutCliente + 
					" " + "ha sido agregada Con exito");
			break;
			}
		case 5:
			System.out.println("Ingrese rut de usuario a eliminar");
			String rutEliminador = sc.next();
			listado.deleteElementByRut(rutEliminador);
			break;
		case 6:
			System.out.println("se muestran todos los usuarios registrados");
			listado.showElements();
			break;
		case 7:
			System.out.println("Ingrese numero de perfil que desea desplegar" +
					"su informacion "+", solo numeros");
			System.out.println("1. Cliente");
			System.out.println("2. Administrativo");
			System.out.println("3. Profesional");
			int tipoPerfil= sc.nextInt();
			
			switch (tipoPerfil) {
				case 1:
				System.out.println("Clientes");
				break;
				case 2:
				System.out.println("Administrativos");
				break;
				case 3:
				System.out.println("Profesionales");
				break;
				default: 
					System.out.println("Ingrese valor valido");
			}
		case 8:
			System.out.println("se mostratan todas las capacitaciones"+
					" registradas");
			break;
		case 9:
			System.out.println("Programa Finalizado");
			break;
			}
		}while (opcionMenu <=9) ;
		}
		
}
		


