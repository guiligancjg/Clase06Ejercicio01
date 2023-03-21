package Clase06Ejercicio01;

public class Main {

    public static void main(String[] args) {
        Producto producto1 = new Producto("Obleas Rellenas",170,3,"De Naranja");
        Producto producto2 = new Producto("Galletitas Dulces",350,2,"Maná Vainilla");
        Producto producto3 = new Producto("Bebida de Avena",422,5,"Fortificada con Vitaminas");

        Carrito carrito = new Carrito();
        carrito.agregardescuento("Llevate 3 productos con un descuento del %10",3,10);

        System.out.println("---El descuento del 10% se aplica si el Cliente lleva 3 productos o más---");
        System.out.println("cant\tPrecio\tProducto\t\t\tDescuento\t\tPrecioFinal");
        System.out.println(producto1.getCantidad()+"\t\t"+ producto1.getPrecio() + "\t" + producto1.getNombre() + "\t\t" + carrito.tieneDescuento(producto1) + "%" + "\t\t\t\t" + carrito.calcularTotal(producto1));
        System.out.println(producto2.getCantidad()+"\t\t"+ producto2.getPrecio() + "\t" + producto2.getNombre() + "\t" + carrito.tieneDescuento(producto2) + "%" + "\t\t\t\t" +carrito.calcularTotal(producto2));
        System.out.println(producto3.getCantidad()+"\t\t"+ producto3.getPrecio() + "\t" + producto3.getNombre() + "\t\t" + carrito.tieneDescuento(producto3) + "%" + "\t\t\t\t" +carrito.calcularTotal(producto3));

        System.out.println("Costo Final a pagar: $" + carrito.costoFinal());
    }
}
