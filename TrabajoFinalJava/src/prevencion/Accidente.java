package prevencion;


public class Accidente {
	
	private String identificadorAccidente;//numero interno interno compañia
	private String rut;
	private String diaAccidente;
	private String horaAccidente;
	private String lugarAccidente; //10 a 50 obligatorio
	private String origenAccidente; //max 100 caracters
	private String consecuencias; //maximo100
		
		
		
		public Accidente() {
			super();
		}


		public Accidente(String identificadorAccidente, String rut, String diaAccidente, String horaAccidente,
				String lugarAccidente, String origenAccidente, String consecuencias) {
			super();
			this.identificadorAccidente = identificadorAccidente;
			this.rut = rut;
			this.diaAccidente = diaAccidente;
			this.horaAccidente = horaAccidente;
			this.lugarAccidente = lugarAccidente;
			this.origenAccidente = origenAccidente;
			this.consecuencias = consecuencias;
		}


		public String getIdentificadorAccidente() {
			return identificadorAccidente;
		}


		public void setIdentificadorAccidente(String identificadorAccidente) {
			this.identificadorAccidente = identificadorAccidente;
		}


		public String getRut() {
			return rut;
		}


		public void setRut(String rut) {
			this.rut = rut;
		}


		public String getDiaAccidente() {
			return diaAccidente;
		}


		public void setDiaAccidente(String diaAccidente) {
			this.diaAccidente = diaAccidente;
		}


		public String getHoraAccidente() {
			return horaAccidente;
		}


		public void setHoraAccidente(String horaAccidente) {
			this.horaAccidente = horaAccidente;
		}


		public String getLugarAccidente() {
			return lugarAccidente;
		}


		public void setLugarAccidente(String lugarAccidente) {
			this.lugarAccidente = lugarAccidente;
		}


		public String getOrigenAccidente() {
			return origenAccidente;
		}


		public void setOrigenAccidente(String origenAccidente) {
			this.origenAccidente = origenAccidente;
		}


		public String getConsecuencias() {
			return consecuencias;
		}


		public void setConsecuencias(String consecuencias) {
			this.consecuencias = consecuencias;
		}


		@Override
		public String toString() {
			return "Accidente [identificadorAccidente=" + identificadorAccidente + ", rut=" + rut + ", diaAccidente="
					+ diaAccidente + ", horaAccidente=" + horaAccidente + ", lugarAccidente=" + lugarAccidente
					+ ", origenAccidente=" + origenAccidente + ", consecuencias=" + consecuencias + "]";
		}
		
		public void datosAccidente() {
			
			identificadorAccidente = "";
			System.out.println("datos llenados por empresa");
			rut ="";
			if (rut.length()>=0) {
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
			lugarAccidente="";

			if (lugarAccidente.length()>= 10 && lugarAccidente.length() <=50) {
				System.out.println("Datos ingresados con exito");
			}else {
				System.out.println("datos invalidos, reintente nuevamnete");
			}
			origenAccidente="";

			if (origenAccidente.length() <=100) {
				System.out.println("Datos ingresados con exito");
			}else {
				System.out.println("datos invalidos, reintente nuevamnete");
			}
			consecuencias="";

			if (consecuencias.length() <=100) {
				System.out.println("Datos ingresados con exito");
			}else {
				System.out.println("datos invalidos, reintente nuevamnete");
			}
		}
		
		
	}

