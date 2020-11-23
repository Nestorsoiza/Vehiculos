package vehiculos;

public abstract class VehiculosConRuedas extends Vehiculo {
	
	public abstract int getNumeroDeRuedas();
	
	public VehiculosConRuedas() {
		super();
	}

	public VehiculosConRuedas(String modelo, String color) {
		super(modelo, color);
	}

	@Override
	public String toString() {
		return super.toString() + ", " + getNumeroDeRuedas() + " ruedas ";
	}

}