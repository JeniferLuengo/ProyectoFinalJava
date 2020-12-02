package usuarios;

public class Usuario {

	protected String nombreUsuario;/*minimo 10 a 50 caracteres*/
	protected String fechaNacimiento;/*obligatorio y String = dd/mm/aaaa*/
	protected String runUsuario;/*menor a 99.999.999*/

	public Usuario(String nombreUsuario, String fechaNacimiento, String runUsuario) {
		this.nombreUsuario = nombreUsuario;
		this.fechaNacimiento = fechaNacimiento;
		this.runUsuario = runUsuario;
	}


	public Usuario() {
	}


	public String getNombre() {
		return nombreUsuario;
	}

	public void setNombre(String nombre) {
		this.nombreUsuario = nombre;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getRun() {
		return runUsuario;
	}

	public void setRun(String run) {
		this.runUsuario = run;
	}


	@Override
	public String toString() {
		return "Usuario [nombre=" + nombreUsuario + ", fechaNacimiento=" + 
				fechaNacimiento + ", run=" + runUsuario + "]";
	}

	//metodo

	public void analizarUsuario() {

		/*method asociado a clase padre que retorna datos de nombre y run
		 * 
		 */

		System.out.println("el Usuario " + nombreUsuario+ "run: " + runUsuario);
	}

	public String nombreUsuario() {

		nombreUsuario ="";
		if (nombreUsuario.length()>= 10 && nombreUsuario.length()<=50) {
			System.out.println("Datos ingresados con exito");
		}else {
			System.out.println("datos invalidos, reintente nuevamnete");
		}
		return nombreUsuario;
	}

	public String fechaNacimiento() {

		fechaNacimiento="";//cambiar formato a FECHA VER METHOD
		if (nombreUsuario.length()>= 10 && nombreUsuario.length()<=50) {
			System.out.println("Datos ingresados con exito");
		}else {
			System.out.println("datos invalidos, reintente nuevamnete");
		}
		return fechaNacimiento;
	}
	public String runUsuario() {
		runUsuario ="";
		if (runUsuario.length()<=8) {
			System.out.println("Datos ingresados con exito");
		}else {
			System.out.println("datos invalidos, reintente nuevamnete");
		}
		return runUsuario;
	}
	public boolean encontrarPorRun(String runUsuario) {
		if (runUsuario.equals(this.runUsuario)) {
			return true;
		} else {
			return false;
		}	
	}


	public static void add(IAsesoria tipo) {
		// TODO Auto-generated method stub
		
	}
}
