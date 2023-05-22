package Stock;

public class Producto {

	private String id;
	private String nombre;
	private int cantidad;
	private double precio;

	public Producto(String id, String nombre, int cantidad, double precio) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.precio = precio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public String getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public double getPrecio() {
		return precio;
	}
}
