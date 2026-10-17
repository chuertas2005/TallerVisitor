
package tallervisitor.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import tallervisitor.visitor.Visitante;

public class Pedido {

    private final List<LineaPedido> lineas;

    public Pedido() {
        this.lineas = new ArrayList<>();
    }

    public void agregarProducto(Producto producto, int cantidad) {
        // LineaPedido valida el producto y la cantidad.
        lineas.add(new LineaPedido(producto, cantidad));
    }

    public void aplicar(Visitante visitante) {
        Objects.requireNonNull(
            visitante,
            "El visitante no puede ser null"
        );

        for (LineaPedido linea : lineas) {
            for (int i = 0; i < linea.getCantidad(); i++) {
                linea.getProducto().aceptar(visitante);
            }
        }
    }
}