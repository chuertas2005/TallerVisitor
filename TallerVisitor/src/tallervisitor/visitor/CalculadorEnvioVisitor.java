
package tallervisitor.visitor;

import tallervisitor.model.Tablet;
import tallervisitor.model.Portatil;
import tallervisitor.model.ComputadoraTorre;
import tallervisitor.model.Television;

public class CalculadorEnvioVisitor implements Visitante {

    private double costoEnvio;

    public CalculadorEnvioVisitor() {
        this.costoEnvio = 0.0;
    }

    private double calcularEnvio(double precio, double pesoEnGramos) {
        double porcentajeEnvio = (pesoEnGramos / 100.0) * 2.0;
        return precio * porcentajeEnvio / 100.0;
    }

    @Override
    public void visitar(Tablet tablet) {
        costoEnvio += calcularEnvio(
            tablet.getPrecio(),
            tablet.getPesoEnGramos()
        );
    }

    @Override
    public void visitar(Portatil portatil) {
        costoEnvio += calcularEnvio(
            portatil.getPrecio(),
            portatil.getPesoEnGramos()
        );
    }

    @Override
    public void visitar(ComputadoraTorre torre) {
        costoEnvio += calcularEnvio(
            torre.getPrecio(),
            torre.getPesoEnGramos()
        );
    }

    @Override
    public void visitar(Television television) {
        costoEnvio += calcularEnvio(
            television.getPrecio(),
            television.getPesoEnGramos()
        );
    }

    public double getCostoEnvio() {
        return costoEnvio;
    }
}
