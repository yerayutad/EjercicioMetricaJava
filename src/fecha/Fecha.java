package fecha;

import java.time.*;

public class Fecha {
	private static LocalDate fecha = LocalDate.now();

	public LocalDate getFecha() {
		return fecha;
	}
	
	public int aniosContigo() {
		int anioActual = fecha.getYear();
		int aniosContigo = anioActual - 2000;
		return aniosContigo;
	}

	@Override
	public String toString() {
		return "La empresa Manolita es una experta en la venta y distribución de productos de alimentación. \nFundada en el año 2000. Contigo desde hace: " + aniosContigo() + " anios.";
	}
}
