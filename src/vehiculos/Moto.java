package vehiculos;

public class Moto extends VehiculosConRuedas {
	
	public Moto(String modelo, String Color) {
		super(modelo, Color);		
	}

	@Override
	public int getNumeroDeRuedas() {
		return 2;
	}

	@Override 
	public String toString() {
		return "Moto : " + super.toString();
	}
	

}
