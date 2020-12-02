package usuarios;


public class Administrativo extends Usuario implements IAsesoria{

	private String area; /*obligatorio 5 a 20 caracters*/
	private String experiencia; //max 100 caracteres
	
	//constructores 
	
	public Administrativo(String nombre, String fechaNacimiento, String run, 
			String area, String experiencia) {
		super(nombre, fechaNacimiento, run);
		this.area = area;
		this.experiencia = experiencia;
	}

	public Administrativo() {
		super();
	}

	//getters and setters
	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}

	//to string
	@Override
	public String toString() {
		return "Administrativo [area=" + area + ", experiencia=" + experiencia 
				+ ", nombre=" + nombreUsuario + ", fechaNacimiento=" 
				+ fechaNacimiento + ", run=" + runUsuario + "]";
	}
	
	public void analizarUsuario() {
		
		System.out.println( "el Usuario " + nombreUsuario + " "+ "Con run " 
				 + runUsuario + " con fecha de nacimiento " + fechaNacimiento + ", " +
				"perteneciente al area "+ area + " y con una experiencia" 
				+" laboral " + experiencia);
	}
	
	public String area() {
		area ="";
		if (area.length()>= 5 && area.length()<=20) {
			System.out.println("Datos ingresados con exito");
		}else {
			System.out.println("datos invalidos, reintente nuevamnete");
		}
		return area;
	}
	
	public String experiencia() {		
			
			experiencia ="";
			if (experiencia.length()<=100) {
				System.out.println("Datos ingresados con exito");
			}else {
				System.out.println("datos invalidos, reintente nuevamnete");
			}
			return experiencia;
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


