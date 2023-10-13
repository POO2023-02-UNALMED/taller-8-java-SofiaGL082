package futbol;

public abstract class Futbolista implements Comparable<Futbolista> {
	private String nombre;
	private int edad;
	private String posicion;
	
	
	public Futbolista(String nombre, int edad, String posicion) {
		this.nombre = nombre;
		this.edad = edad;
		this.posicion = posicion;
	}
	
	public Futbolista() {
		this("Maradona", 30, "delantero");
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNombre() {
		return this.nombre;
	}
	
	public void setEdas(int edad) {
		this.edad = edad;
	}
	public int getEdad() {
		return this.edad;
	}
	public String getPosicion() {
		return this.posicion;
	}
	
	public String toString() {
		String mensaje = "El futbolista " + this.nombre;
		mensaje += " tiene " + this.edad;
		mensaje += ", y juega de " + this.posicion;
		return mensaje;
	}
	
	public boolean equals(Futbolista f) {
		//ver si dos objetos son iguales
		boolean respuesta = false;
		if ((this.getNombre()==f.getNombre()) && (this.getEdad()==f.getEdad()) && (this.getPosicion()==f.getPosicion())) {
			respuesta = true;
		}
		return respuesta;
	}
	
	public int compareTo(Futbolista f) {
		if (this.getEdad()>f.getEdad()) {
			return 1;
		}else if (this.getEdad()<f.getEdad()) {
			return -1;
		}else {
			return 0;
		}
	}
	
	public abstract boolean jugarConLasManos();

}
