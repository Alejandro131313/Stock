package Stock;

import java.io.IOException;

public class Start {
	public static void main(String[] args) {
        try {
            Lector lector = new Lector();
            lector.LeerFichero("C:\\Users\\Alex\\Downloads\\Txt1.txt");
            lector.LeerFichero("C:\\Users\\Alex\\Downloads\\Txt2.txt");
            lector.EscribirFichero("C:\\Users\\Alex\\Downloads\\Txt+.txt");
            System.out.println("Operación completada con éxito.");
        } catch (IOException e) {
            System.out.println("Error al leer/escribir los ficheros: " + e.getMessage());
        } catch (PrecioDiferenteException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

