package main;
import java.util.ArrayList;

import clasesProductos.*;
import fecha.*;

public class Main {
	public static void imprimirProductos(ArrayList<Productos> mapaProductos) {
		for (int i = 0; i < mapaProductos.size(); i++) {
			System.out.println(mapaProductos.get(i).toString());
		}
	}
	public static String obtenerMasCaroYMasBarato(ArrayList<Productos> mapaProductos) {
		Productos max = mapaProductos.get(0);
		Productos min = mapaProductos.get(0);
		for (int i = 0; i < mapaProductos.size(); i++) {
			if(max.compareTo(mapaProductos.get(i)) < 0) {
				max = mapaProductos.get(i);
			}if(min.compareTo(mapaProductos.get(i)) > 0) {
				min = mapaProductos.get(i);
			}
		}
		String respuesta = "Producto más caro: " + max.getNombre() +"\nProducto más barato: " + min.getNombre();
		return respuesta;
	}
	public static void main(String[] args) {	
		ArrayList<Productos> mapaProductos = new ArrayList<Productos>();
		Bebidas cocacolaZero = new Bebidas("Coca-Cola Zero", 20, 1.5);
		Bebidas cocacola = new Bebidas("Coca-Cola", 18, 1.5);
		ProductosHigiene shampoo = new ProductosHigiene("Shampoo Sedal", 19, 500);
		Frutas frutillas = new Frutas("Frutillas", 64, "kilo");
		mapaProductos.add(cocacolaZero);
		mapaProductos.add(cocacola);
		mapaProductos.add(shampoo);
		mapaProductos.add(frutillas);
		Fecha fecha = new Fecha();
		System.out.println(fecha.toString() + "\n\nProductos:\n=============================");
		imprimirProductos(mapaProductos);
		System.out.println("=============================\n");
		System.out.println(obtenerMasCaroYMasBarato(mapaProductos));
		
	}

}
