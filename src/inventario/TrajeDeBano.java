package inventario;

import java.time.LocalDate;

public class TrajeDeBano extends Producto{

    public TrajeDeBano(int codigo, String nombre, String descripcion, String talla, String marca, int stock, Double precio, enumTipo tipo, enumCategoria categoria, String sexo, LocalDate fecha) {
        super(codigo, nombre, descripcion, talla, marca, stock, precio, tipo, categoria, sexo, fecha);
    }

    /*public TrajeDeBano(int codigo, String nombre, String descripcion, String talla, String marca, int stock, Double precio, String categoria, String sexo, Date fecha, String trajedebano) {
        super(codigo, nombre, descripcion, talla, marca, stock, precio, categoria, sexo, fecha, trajedebano);
    }*/
    
}
