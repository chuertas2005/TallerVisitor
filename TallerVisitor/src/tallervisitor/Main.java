
package tallervisitor;

import java.util.Locale;

import tallervisitor.model.Pedido;
import tallervisitor.model.Tablet;
import tallervisitor.model.Portatil;
import tallervisitor.model.ComputadoraTorre;
import tallervisitor.model.Television;

import tallervisitor.visitor.CalculadorSubtotalVisitor;
import tallervisitor.visitor.CalculadorEnvioVisitor;

public class Main {

    public static void main(String[] args) {

        // Crear los productos.
        Tablet tablet = new Tablet("Tablet", 200.0, 250.0);

        Portatil portatil = new Portatil(
            "Computadora portatil", 400.0, 1000.0
        );

        ComputadoraTorre torre = new ComputadoraTorre(
            "Computadora de torre", 600.0, 6000.0
        );

        Television television = new Television(
            "Television", 300.0, 4000.0
        );

        // Crear el pedido y agregar productos con sus cantidades.
        Pedido pedido = new Pedido();

        pedido.agregarProducto(tablet, 2);
        pedido.agregarProducto(portatil, 1);
        pedido.agregarProducto(torre, 1);
        pedido.agregarProducto(television, 1);

        // Calcular el subtotal con un visitante nuevo.
        CalculadorSubtotalVisitor visitanteSubtotal =
            new CalculadorSubtotalVisitor();

        pedido.aplicar(visitanteSubtotal);

        double subtotal = visitanteSubtotal.getSubtotal();

        // Calcular el envio con otro visitante nuevo.
        CalculadorEnvioVisitor visitanteEnvio =
            new CalculadorEnvioVisitor();

        pedido.aplicar(visitanteEnvio);

        double costoEnvio = visitanteEnvio.getCostoEnvio();

        // Calcular el total.
        double total = subtotal + costoEnvio;

        // Mostrar los resultados.
        System.out.println("===== WTECH: CALCULADORA DE VENTAS =====");
        System.out.printf(
            Locale.US, "Subtotal:     $%.2f USD%n", subtotal
        );
        System.out.printf(
            Locale.US, "Costo envio:  $%.2f USD%n", costoEnvio
        );
        System.out.printf(
            Locale.US, "Total a pagar: $%.2f USD%n", total
        );
    }
}