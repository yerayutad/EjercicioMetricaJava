package clasesProductos;

public class Frutas extends Productos {
	private String unidadDeVenta;

	public Frutas(String nombre, int precio, String unidadDeVenta) {
		super(nombre, precio);
		this.unidadDeVenta = unidadDeVenta;
		
	}
	public String getUnidadDeVenta() {
		return unidadDeVenta;
	}
	
	@Override
	public String toString() {
		return "Nombre: "+ this.getNombre() + " /// Precio: $" + this.getPrecio() + " /// Unidad de venta: " + this.getUnidadDeVenta();
	}
}
