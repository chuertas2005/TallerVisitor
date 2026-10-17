
package tallervisitor.model;

import java.util.Objects;

public class LineaPedido {

    private final Producto producto;
    private final int cantidad;

    public LineaPedido(Producto producto, int cantidad) {
        Objects.requireNonNull(producto, "El producto no puede ser null");

        if (cantidad <= 0) {
            throw new IllegalArgumentException(
                "La cantidad debe ser mayor que cero."
            );
        }

        this.producto = producto;
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }
}