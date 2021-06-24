package Vehiculos;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        ArrayList<String> carros = new ArrayList<>();
        ArrayList tiposAutos = new ArrayList();
        for (int i = 0; i < 20; i++) {
            System.out.println("1");
            System.out.println("2");
            System.out.println("3");
            int num = Integer.valueOf(lector.nextLine());
            switch (num) {

                case 1:
                    System.out.println("INgrese cantidad de personas");
                    int cantidad = Integer.valueOf(lector.nextLine());
                    System.out.println("INgrese cantidad de gasolina");
                    int gas = Integer.valueOf(lector.nextLine());
                    System.out.println("INgrese cantidad de velocidad");
                    double vel = Double.valueOf(lector.nextLine());
                    System.out.println("INgrese cantidad de aceleracion");
                    double ac = Double.valueOf(lector.nextLine());
                    System.out.println("INgrese cantidad de turbo");
                    int turbo = Integer.valueOf(lector.nextLine());
                    deCarreras carro = new deCarreras(gas, cantidad, vel, ac, turbo);
                    if (carro instanceof deCarreras) {
                        tiposAutos.add("Carro de carreras");
                    }
                    carros.add(carro.toString());
                    break;
                case 2:
                    System.out.println("INgrese cantidad de personas");
                    int cantidad1 = Integer.valueOf(lector.nextLine());
                    System.out.println("INgrese cantidad de gasolina");
                    int gas1 = Integer.valueOf(lector.nextLine());
                    System.out.println("INgrese cantidad de velocidad");
                    double vel1 = Double.valueOf(lector.nextLine());
                    System.out.println("INgrese cantidad de aceleracion");
                    double ac1 = Double.valueOf(lector.nextLine());
                    System.out.println("INgrese el material a cargar");
                    String material = (lector.nextLine());
                    deCarga carro1 = new deCarga(gas1, cantidad1, vel1, ac1, material);
                    if (carro1 instanceof deCarga) {
                        tiposAutos.add("Carro de carga");
                    }
                        carros.add(carro1.toString());
                        break;
                        case 3:
                            System.out.println("INgrese cantidad de personas");
                            int cantidad2 = Integer.valueOf(lector.nextLine());
                            System.out.println("INgrese cantidad de gasolina");
                            int gas2 = Integer.valueOf(lector.nextLine());
                            System.out.println("INgrese cantidad de velocidad");
                            double vel2 = Double.valueOf(lector.nextLine());
                            System.out.println("INgrese cantidad de aceleracion");
                            double ac2 = Double.valueOf(lector.nextLine());
                            boolean trasporte = true;
                            camionetas carro2 = new camionetas(gas2, cantidad2, vel2, ac2, trasporte);
                            if (carro2 instanceof camionetas) {
                                tiposAutos.add("Camioneta");

                                carros.add(carro2.toString());
                            }
                                break;



                    }


            }
            Object carreras = new Object();
            System.out.println(carros.toString());
            System.out.println(tiposAutos);



    }
    }
