
package tallervisitor.visitor;

import tallervisitor.model.Tablet;
import tallervisitor.model.Portatil;
import tallervisitor.model.ComputadoraTorre;
import tallervisitor.model.Television;

public class CalculadorSubtotalVisitor implements Visitante {

    private double subtotal;

    public CalculadorSubtotalVisitor() {
        this.subtotal = 0.0;
    }

    @Override
    public void visitar(Tablet tablet) {
        subtotal += tablet.getPrecio();
    }

    @Override
    public void visitar(Portatil portatil) {
        subtotal += portatil.getPrecio();
    }

    @Override
    public void visitar(ComputadoraTorre torre) {
        subtotal += torre.getPrecio();
    }

    @Override
    public void visitar(Television television) {
        subtotal += television.getPrecio();
    }

    public double getSubtotal() {
        return subtotal;
    }
}