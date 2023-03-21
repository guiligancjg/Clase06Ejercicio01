package Clase06Ejercicio01;

public class Producto {
    private String nombre;
    private Double precio;
    private int cantidad;
    private String detalle;

    public Producto(){}

    public Producto(String nombre, double precio, int cantidad, String detalle){
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.detalle = detalle;
    }

    public Double getPrecio() {
        return this.precio;
    }

    public String getNombre() { return this.nombre; }

    public int getCantidad() {
        return this.cantidad;
    }

}
