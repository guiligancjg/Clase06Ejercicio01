package Clase06Ejercicio01;

import Descuentos.Descuento;

public class Carrito extends Descuento {
    private double costoFinal;

    public Carrito(){}

    public void agregardescuento(String descripcion, int unidades, int descuento) {
        this.descripcion = descripcion;
        this.unidades = unidades;
        this.descuento = descuento;
    }

    public double calcularTotal(Producto productos){
        double total = 0;
            if(productos.getCantidad() >= this.getUnidades()){
                total = productos.getCantidad() * (productos.getPrecio() - ((productos.getPrecio() * this.getDescuento()) / 100));
                costoFinal += total;
                return total;
            } else {
                total = productos.getPrecio() * productos.getCantidad();
                costoFinal += total;
                return total;
            }
    }

    public String tieneDescuento(Producto productos){
        if(productos.getCantidad() >= this.getUnidades())
            return Integer.toString(this.getDescuento());
        else
            return "0";
    }

    public double costoFinal(){
        return costoFinal;
    }
}
