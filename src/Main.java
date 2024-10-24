import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer numero:");
        double valorUno = scanner.nextDouble();
        System.out.println("Ingrese la operacion: *, /, +, -");
        String operacion = scanner.next();
        System.out.println("Ingrese el segundo valor");
        double valorDos = scanner.nextDouble();



        switch (operacion.trim()) {
            case "*":
                double multiplicacion = valorUno * valorDos;
                System.out.println(multiplicacion);
                break;
            case "/":
                double division = valorUno / valorDos;
                System.out.println(division);
                break;
            case "+":
                double suma = valorUno + valorDos;
                System.out.println(suma);
                break;
            case "-":
                double resta = valorUno - valorDos;
                System.out.println(resta);
                break;
            default:
                System.out.println("Seleccion erronea :c");
        }

        JFrame ventana = new JFrame("mi primer ventana");
        ventana.setSize(800, 500);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton boton = new JButton("Dame click");
        ventana.add(boton);
        ventana.setVisible(true);

    }
}