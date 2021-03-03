package clasesProductos;

public class Bebidas extends Productos {
private double litros;
	
	public Bebidas(String nombre, int precio, double litros) {
		super(nombre, precio);
		this.litros = litros;
		
	}

	public double getLitros() {
		return litros;
	}

	@Override
	public String toString() {
		return "Nombre: "+ this.getNombre() + " /// Litros: " + this.getLitros() + " /// Precio: $" + this.getPrecio();
	}
	
}
