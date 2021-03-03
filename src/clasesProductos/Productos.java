package clasesProductos;

public class Productos implements Comparable<Productos>{
	private String nombre;
	private int precio;

	public Productos(String nombre, int precio) {
		this.nombre = nombre;
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public int getPrecio() {
		return precio;
	}

	@Override
	public int compareTo(Productos producto) {
		int res;
		if(this.precio < producto.precio) {
		res = -1;
		}else if(this.precio == producto.precio) {
			res = 0;
		}else {
			res = 1;
		}
		return res;
	}
	
}

