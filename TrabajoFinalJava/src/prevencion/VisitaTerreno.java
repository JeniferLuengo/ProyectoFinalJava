package prevencion;

public class VisitaTerreno {

	private String identificadorVisita; // numero interno 
	private String rutCliente;//obligatorio
	private String diaTerreno;//formato dd/mm/aaaa
	private String horaTerreno; //formato hh:mm
	private String lugarTerreno; //10 a 50 caracters
	private String comentarios; //max 100 caracters
	
	public VisitaTerreno(String nombre, String fechaNacimiento, String run, String identificadorVisita,
			String rutCliente, String diaTerreno, String horaTerreno, String lugarTerreno, String comentarios) {
		super();
		this.identificadorVisita = identificadorVisita;
		this.rutCliente = rutCliente;
		this.diaTerreno = diaTerreno;
		this.horaTerreno = horaTerreno;
		this.lugarTerreno = lugarTerreno;
		this.comentarios = comentarios;
	}

	public VisitaTerreno(String nombre, String fechaNacimiento, String run) {
		super();
	}

	public String getIdentificadorVisita() {
		return identificadorVisita;
	}

	public void setIdentificadorVisita(String identificadorVisita) {
		this.identificadorVisita = identificadorVisita;
	}

	public String getRutCliente() {
		return rutCliente;
	}

	public void setRutCliente(String rutCliente) {
		this.rutCliente = rutCliente;
	}

	public String getDiaTerreno() {
		return diaTerreno;
	}

	public void setDiaTerreno(String diaTerreno) {
		this.diaTerreno = diaTerreno;
	}

	public String getHoraTerreno() {
		return horaTerreno;
	}

	public void setHoraTerreno(String horaTerreno) {
		this.horaTerreno = horaTerreno;
	}

	public String getLugarTerreno() {
		return lugarTerreno;
	}

	public void setLugarTerreno(String lugarTerreno) {
		this.lugarTerreno = lugarTerreno;
	}

	public String getComentarios() {
		return comentarios;
	}

	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}

	@Override
	public String toString() {
		return "VisitaTerreno [identificadorVisita=" + identificadorVisita 
				+ ", rutCliente=" + rutCliente + ", diaTerreno=" + diaTerreno 
				+ ", horaTerreno=" + horaTerreno + ", lugarTerreno=" +
				lugarTerreno + ", comentarios=" + comentarios + "]";
	}

	public void datosVisita() {

		identificadorVisita = "";
		System.out.println("datos llenados por empresa");
		rutCliente ="";
		if (rutCliente.length()>=0) {
			System.out.println("Datos ingresados con exito");
		}else {
			System.out.println("datos invalidos, reintente nuevamnete");
		}
		//fechaIngreso =dd-mm-aaaa;
		
				//if (fechaIngreso.length()<=10) {
				/*System.out.println("Datos ingresados con exito");*/
				//}else {
					//System.out.println("datos invalidos, reintente nuevamnete");
				//}
		//Agregar if Hora
		lugarTerreno="";

		if (lugarTerreno.length()>= 10 && lugarTerreno.length() <=50) {
			System.out.println("Datos ingresados con exito");
		}else {
			System.out.println("datos invalidos, reintente nuevamnete");
		}
		comentarios="";

		if (comentarios.length() <=100) {
			System.out.println("Datos ingresados con exito");
		}else {
			System.out.println("datos invalidos, reintente nuevamnete");
		}
	}
	
}
