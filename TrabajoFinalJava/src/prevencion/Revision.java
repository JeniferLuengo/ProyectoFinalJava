package prevencion;

public class Revision {

	private String identificadorRevision;///numero asociado a revision
	private String IdentificacionTerreno;//obligatorio y revisar con terreno
	private String nombreRevision; //min 10 max 50 obligatorio
	private String detalleRevision; //max 100 caracteres
	private int estado;//1 sin problema, 2 observacion,3 no aprueba
	
	
	public Revision(String identificadorRevision, String identificacionTerreno, String nombreRevision,
			String detalleRevision, int estado) {
		super();
		this.identificadorRevision = identificadorRevision;
		IdentificacionTerreno = identificacionTerreno;
		this.nombreRevision = nombreRevision;
		this.detalleRevision = detalleRevision;
		this.estado = estado;
	}


	public Revision() {
		super();
	}


	public String getIdentificadorRevision() {
		return identificadorRevision;
	}


	public void setIdentificadorRevision(String identificadorRevision) {
		this.identificadorRevision = identificadorRevision;
	}


	public String getIdentificacionTerreno() {
		return IdentificacionTerreno;
	}


	public void setIdentificacionTerreno(String identificacionTerreno) {
		IdentificacionTerreno = identificacionTerreno;
	}


	public String getNombreRevision() {
		return nombreRevision;
	}


	public void setNombreRevision(String nombreRevision) {
		this.nombreRevision = nombreRevision;
	}


	public String getDetalleRevision() {
		return detalleRevision;
	}


	public void setDetalleRevision(String detalleRevision) {
		this.detalleRevision = detalleRevision;
	}


	public int getEstado() {
		return estado;
	}


	public void setEstado(int estado) {
		this.estado = estado;
	}


	@Override
	public String toString() {
		return "Revision [identificadorRevision=" + identificadorRevision +
				", IdentificacionTerreno=" + IdentificacionTerreno +
				", nombreRevision=" + nombreRevision + ", detalleRevision=" 
				+ detalleRevision + ", estado=" + estado + "]";
	}
	
	public void datosRevision() {
		identificadorRevision = "";
		System.out.println("datos llenados por empresa");
		IdentificacionTerreno = "";//Entrelazar datos con otras clases
		System.out.println("datos llenados por empresa");
		nombreRevision ="";
		if (nombreRevision.length()>= 10 && nombreRevision.length()<=50) {
			System.out.println("Datos ingresados con exito");
		}else {
			System.out.println("datos invalidos, reintente nuevamnete");
		}
		detalleRevision ="";
		if (detalleRevision.length()<=100) {
			System.out.println("Datos ingresados con exito");
		}else {
			System.out.println("datos invalidos, reintente nuevamnete");
		}
		estado = 0;
		System.out.println("Ingrese una opcion:");
		System.out.println("1) Sin Problemas ");
		System.out.println("2) Con Observacion");
		System.out.println("3) No Aprueba");
		switch (estado) {
		case 1: System.out.println("Sin Problemas"); break;
		case 2: System.out.println("Con Observaciones");break;
		case 3: System.out.println("No Aprueba");break;
		default: System.out.println("Ingrese opcion Valida");break;
	}
	}
	
}
	

