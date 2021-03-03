package clasesProductos;

public class ProductosHigiene extends Productos{
private int contenido;
	
	public ProductosHigiene(String nombre, int precio, int contenido) {
		super(nombre, precio);
		this.contenido = contenido;
		
	}
	public int getContenido() {
		return contenido;
	}
	
	@Override
	public String toString() {
		return "Nombre: "+ this.getNombre() + " /// Contenido: " + this.getContenido() + "ml /// Precio: $" + this.getPrecio();
	}
}
