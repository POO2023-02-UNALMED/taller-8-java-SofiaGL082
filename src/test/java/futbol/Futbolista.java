package futbol;

public abstract class Futbolista implements Comparable<Object> {
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
		if ((this.getNombre()==f.getNombre()) && (this.getEdad()==f.getEdad()) && (this.getPosicion()==f.getPosicion())) {
			return true;
		} else {
			return false;
		}
	}
	
	public int compareTo(Object o) {
		Futbolista f = (Futbolista)o;
	    if (this.getEdad() != f.getEdad()) {
	        return this.getEdad() - f.getEdad();
	    }
	    return this.getNombre().compareTo(f.getNombre());
	}
	
	public abstract boolean jugarConLasManos();

}
