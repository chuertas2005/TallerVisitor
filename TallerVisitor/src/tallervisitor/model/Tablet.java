
package tallervisitor.model;

import tallervisitor.visitor.Visitante;

public class Tablet implements Producto {

    private String nombre;
    private double precio;
    private double pesoEnGramos;

    public Tablet(String nombre, double precio, double pesoEnGramos) {
        this.nombre = nombre;
        this.precio = precio;
        this.pesoEnGramos = pesoEnGramos;
    }

    @Override
    public void aceptar(Visitante visitante) {
        visitante.visitar(this);
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public double getPesoEnGramos() {
        return pesoEnGramos;
    }
}
