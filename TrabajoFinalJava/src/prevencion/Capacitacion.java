package prevencion;

public class Capacitacion {

	private String identificador;//obligatorio ninterno manejado por la empresa
	private String rutCliente;//obligatorio
	private int diaCapacitacion;//dia de la semana permitido lun y dom
	private String horaCapacitacion; 
	/*valor con formato hh:mm de 0 a 23 hrs
	 * minutos de 0 a 59 min
	 */
	private String lugar; //entre 10 a 50 caracteres obligatorios
	private String duracion; //70 caracteres
	private int cantidadAsistentes; //obligatorio menor a 1000

	//constructor
	public Capacitacion(String identificador, String rutCliente, int diaCapacitacion, String horaCapacitacion,
			String lugar, String duracion, int cantidadAsistentes) {
		super();
		this.identificador = identificador;
		this.rutCliente = rutCliente;
		this.diaCapacitacion = diaCapacitacion;
		this.horaCapacitacion = horaCapacitacion;
		this.lugar = lugar;
		this.duracion = duracion;
		this.cantidadAsistentes = cantidadAsistentes;
	}

	public Capacitacion() {
		super();
	}


	//getters and setters
	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public String getRutCliente() {
		return rutCliente;
	}

	public void setRutCliente(String rutCliente) {
		this.rutCliente = rutCliente;
	}

	public int getDiaCapacitacion() {
		return diaCapacitacion;
	}

	public void setDiaCapacitacion(int diaCapacitacion) {
		this.diaCapacitacion = diaCapacitacion;
	}

	public String getHoraCapacitacion() {
		return horaCapacitacion;
	}

	public void setHoraCapacitacion(String horaCapacitacion) {
		this.horaCapacitacion = horaCapacitacion;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public String getDuracion() {
		return duracion;
	}

	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}

	public int getCantidadAsistentes() {
		return cantidadAsistentes;
	}

	public void setCantidadAsistentes(int cantidadAsistentes) {
		this.cantidadAsistentes = cantidadAsistentes;
	}

	@Override
	public String toString() {
		return "Capacitacion [identificador=" + identificador + 
				", rutCliente=" + rutCliente + ", diaCapacitacion=" 
				+ diaCapacitacion + ", horaCapacitacion=" + horaCapacitacion 
				+ ", lugar=" + lugar + ", duracion=" + duracion 
				+ ", cantidadAsistentes=" + cantidadAsistentes + "]";
	}

	public void capacitacion() {

		System.out.println("la capacitacion será en "+ lugar + "a las" + 
				horaCapacitacion + "del dia "+ diaCapacitacion + "durará "+
				duracion + "minutos");
	}
	public String identificador() {

		identificador = "";
		System.out.println("datos llenados por empresa");
		rutCliente ="";
		if (rutCliente.length()>=0) {
			System.out.println("Datos ingresados con exito");
		}else {
			System.out.println("datos invalidos, reintente nuevamnete");
		}
		return identificador;
	}
	public String rutCliente() {
		return rutCliente;
	}
	public int diaCapacitacion() {
		diaCapacitacion=0;
		switch (diaCapacitacion) {
		case 1:
			System.out.println("Lunes");break;
		case 2:
			System.out.println("martes");break;
		case 3:
			System.out.println("miercoles");break;
		case 4:
			System.out.println("jueves");break;
		case 5:
			System.out.println("viernes");break;
		case 6:
			System.out.println("sabado");break;
		case 7:
			System.out.println("domingo");break;
		default:
			System.out.println("Ingrese dia valido");break;
		}
		return diaCapacitacion;
	}
	public String horaCapacitacion() {
		horaCapacitacion= "";
		return horaCapacitacion;
	}
	
public String lugar() {

	lugar ="";
	if (lugar.length()>= 10 && lugar.length()<=50) {
		System.out.println("Datos ingresados con exito");
	}else {
		System.out.println("datos invalidos, reintente nuevamnete");
	}
	return lugar;
}

public String duracion() {
	duracion ="";
	if (lugar.length()<= 70) {
		System.out.println("Datos ingresados con exito");
	}else {
		System.out.println("datos invalidos, reintente nuevamnete");
	}
	return duracion;
}
public int cantidadAsistentes() {
	cantidadAsistentes =0;
	if (cantidadAsistentes<= 1000) {
		System.out.println("Datos ingresados con exito");
	}else {
		System.out.println("datos invalidos, reintente nuevamnete");
	}
	return cantidadAsistentes;
}
}


