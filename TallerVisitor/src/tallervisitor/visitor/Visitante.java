
package tallervisitor.visitor;

import tallervisitor.model.Tablet;
import tallervisitor.model.Portatil;
import tallervisitor.model.ComputadoraTorre;
import tallervisitor.model.Television;

public interface Visitante {

    void visitar(Tablet tablet);

    void visitar(Portatil portatil);

    void visitar(ComputadoraTorre torre);

    void visitar(Television television);
}