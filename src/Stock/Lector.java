package Stock;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Lector {
	Map<String, Producto> Productos;

	public Lector() {
		Productos = new HashMap<>();
	}

	public void LeerFichero(String nombreFichero) throws IOException, PrecioDiferenteException {
		BufferedReader br = new BufferedReader(new FileReader(nombreFichero));
		String id, nombre, cantidadStr, precioStr;

		while ((id = br.readLine()) != null) {
			nombre = br.readLine();
			cantidadStr = br.readLine();
			precioStr = br.readLine();

			int cantidad = Integer.parseInt(cantidadStr);
			double precio = Double.parseDouble(precioStr);

			if (Productos.containsKey(id)) {
				Producto producto = Productos.get(id);

				if (producto.getPrecio() != precio) {
					throw new PrecioDiferenteException("El precio no coincide ");
				}

				int cantidadTotal = producto.getCantidad() + cantidad;
				producto.setCantidad(cantidadTotal);
			} else {
				Producto producto = new Producto(id, nombre, cantidad, precio);
				Productos.put(id, producto);
			}
		}

		br.close();
	}

	public void EscribirFichero(String nombreFichero) throws IOException {
		FileWriter bw = new FileWriter(nombreFichero);

		for (Producto producto : Productos.values()) {
			bw.write(producto.getId() + "\n");
			bw.write(producto.getNombre() + "\n");
			bw.write(producto.getCantidad() + "\n");
			bw.write(producto.getPrecio() + "\n");
		}

		bw.close();
	}
}