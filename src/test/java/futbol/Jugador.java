package futbol;

public class Jugador extends Futbolista {
	public short golesMarcados;
	public byte dorsal; //numero camiseta
	
	public Jugador(String nombre, int edad, String posicion, short golesM, byte dorsal) {
		super(nombre, edad, posicion);
		this.golesMarcados = golesM;
		this.dorsal = dorsal;
	}
	
	public Jugador() {
		super();
		this.golesMarcados = 289;
		this.dorsal = 7;
	}
	
	// metodo compareTo que entrega dif edad entre dos jugadores
	
	@Override
	public String toString() {
		String mensaje = "El futbolista " + this.getNombre();
		mensaje += " tiene " + this.getEdad();
		mensaje += ", y juega de " + this.getPosicion();
		mensaje += " con el dorsal " + this.dorsal;
		mensaje += ". Ha marcado " + this.golesMarcados;
		return mensaje;
	}
	
	public boolean jugarConLasManos() {
		return false;
	}
	
	@Override
	public int compareTo(Object o) {
		//entrega la dif de edad positiva entre el this y f
		Futbolista f = (Futbolista)o;
		if (this.getEdad()>f.getEdad()) {
			return this.getEdad() - f.getEdad();
		} else if (this.getEdad()<f.getEdad()) {
			return f.getEdad() - this.getEdad();
		} else {
			return 0;
		}
	}

}
