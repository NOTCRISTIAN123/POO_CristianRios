package edu.cris_rios.reto2.cajas.process;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Calculadora_cajas {
    private static final int COSTO_COMPRA = 50;
    private static final int COSTO_VENTA = 70;
    private static final int MAX_CAJAS_DISPONIBLES = 1000;

    private int cajasCompradas;
    private int cajasVendidas;
    private int dineroEnCaja;
    private int ingresosPorVentas;
    private int egresosPorCompras;

    private Map<String, Integer> inventario = new HashMap<>();

    public void comprarCajas(int dineroEnCaja) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de cajas de papel que desea comprar:");
        int cantidad = pedirNumero();

        if (cantidad <= MAX_CAJAS_DISPONIBLES) {
            cajasCompradas += cantidad;
            ingresosPorVentas += cantidad * COSTO_VENTA;
            egresosPorCompras += cantidad * COSTO_COMPRA;
            dineroEnCaja -= cantidad * COSTO_COMPRA;

            System.out.println("Compra realizada: " + cantidad + " cajas de papel añadidas al inventario.");
        } else {
            System.out.println("No hay suficientes cajas disponibles para esa cantidad.");
        }

        this.dineroEnCaja = dineroEnCaja;
    }

    public void venderCajas() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de cajas de papel que desea vender:");
        int cantidad = pedirNumero();

        if (cantidad <= cajasCompradas) {
            cajasVendidas += cantidad;
            ingresosPorVentas += cantidad * COSTO_VENTA;
            cajasCompradas -= cantidad;

            System.out.println("Venta realizada: " + cantidad + " cajas de papel descontadas del inventario.");
        } else {
            System.out.println("No hay suficientes cajas compradas para esa cantidad.");
        }
    }

    public void mostrarReporteAdmin() {
        System.out.println("Reporte de administrador:");
        System.out.println("Cajas compradas por el cajero: " + cajasCompradas);
        System.out.println("Cajas vendidas a los clientes: " + cajasVendidas);
        System.out.println("Ingresos por ventas: $" + ingresosPorVentas);
        System.out.println("Egresos por compras: $" + egresosPorCompras);
        System.out.println("Dinero en caja: $" + dineroEnCaja);
    }

    public void mostrarResumen() {
        System.out.println("Resumen final:");
        System.out.println("Cantidad total de operaciones realizadas: " + (cajasCompradas + cajasVendidas));
        System.out.println("Cantidad total de clientes: " + cajasVendidas);
        System.out.println("Ventas totales de productos: " + cajasVendidas);
        System.out.println("Ingresos totales por ventas: $" + ingresosPorVentas);
        System.out.println("Egresos totales por compras: $" + egresosPorCompras);
        System.out.println("¡Gracias por su compra o venta, le esperamos pronto! :D");
    }

    private int pedirNumero() {
        int numero = 0;
        boolean entradaValida = false;

        Scanner scanner = new Scanner(System.in);

        do {
            try {
                // Intentamos leer un número desde la entrada
                numero = Integer.parseInt(scanner.nextLine());
                entradaValida = true;
            } catch (NumberFormatException e) {
                // Si la entrada no es un número, mostramos un mensaje y pedimos de nuevo
                System.out.println("Por favor, ingrese un número válido.");
            }
        } while (!entradaValida);

        return numero;
    }
}