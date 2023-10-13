package futbol;

public class Portero extends Futbolista {
	public short golesRecibidos;
	public byte dorsal;
	
	public Portero(String nombre, int edad, short golesRecibidos, byte dorsal) {
		super(nombre, edad, "Portero");
		this.golesRecibidos = golesRecibidos;
		this.dorsal = dorsal;
	}
	
	public boolean jugarConLasManos() {
		return true;
	}
	
	@Override
	public String toString() {
		String mensaje = "El futbolista " + this.getNombre();
		mensaje += " tiene " + this.getEdad();
		mensaje += ", y juega de " + this.getPosicion();
		mensaje += " con el dorsal " + this.dorsal;
		mensaje += ". Le han marcado " + this.golesRecibidos;
		return mensaje;
	}
	
	@Override
	public int compareTo(Object o) {
		Portero p = (Portero)o; 
		if (this.golesRecibidos>p.golesRecibidos) {
			return this.golesRecibidos - p.golesRecibidos;
		} else if (this.golesRecibidos<p.golesRecibidos) {
			return p.golesRecibidos - this.golesRecibidos;
		} else {
			return 0;
		}
	}

}
