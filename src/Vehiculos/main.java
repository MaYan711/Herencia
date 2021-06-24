package Vehiculos;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        ArrayList<String> carros = new ArrayList<>();
        ArrayList tiposAutos = new ArrayList();
        for (int i = 0; i < 20; i++) {
            System.out.println("\nBIENVENIDO\n");
            System.out.println("1 es para personas");
            int num = Integer.valueOf(lector.nextLine());
            switch (num) {

                case 1:
                    System.out.println("Ingrese cantidad de personas");
                    int cantidad = Integer.valueOf(lector.nextLine());
                    System.out.println("Ingrese cantidad de gasolina");
                    int gas = Integer.valueOf(lector.nextLine());
                    System.out.println("Ingrese cantidad de velocidad");
                    double vel = Double.valueOf(lector.nextLine());
                    System.out.println("Ingrese cantidad de aceleracion");
                    double ac = Double.valueOf(lector.nextLine());
                    System.out.println("Ingrese cantidad de turbo");
                    int turbo = Integer.valueOf(lector.nextLine());
                    //deCarreras carro = new deCarreras(gas, cantidad, vel, ac, turbo);
                    //if (carro instanceof deCarreras) {
                       // tiposAutos.add("Carro de carreras");
                    //}
                    //carros.add(carro.toString());
                    //break;
                //case 2:
                              //  break;
                    //}
            }
            Object carreras = new Object();
            System.out.println(carros.toString());
            System.out.println(tiposAutos);
    }
    }
}
