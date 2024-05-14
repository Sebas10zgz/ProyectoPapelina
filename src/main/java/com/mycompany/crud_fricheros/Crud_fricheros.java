/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.crud_fricheros;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author jorge
 */
public class Crud_fricheros {

    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);
        
        List<Productos> products = new ArrayList<>();
        products.add(new Productos(1, "Camion", 100));
        products.add(new Productos(2, "Selec", 150.99));
        products.add(new Productos(3, "Armario", 1039.50));
        products.add(new Productos(4, "Ordenador", 521.10));

        Escribir escribir = new Escribir();
        

        int opcion, posicion_a_borrar, posicion_de_compra, id;
        String nombre;
        double precio;
        double newPrecio;
        LocalDate fechaActual = LocalDate.now();
        int dia = fechaActual.getDayOfMonth();
        

        JOptionPane.showMessageDialog(null,"BIENVENIDO A BENI BENITO\nHOY ESTAMOS A DIA " +dia);

        do {

            opcion = menu();

            switch (opcion) {

                case 1: {

                        opcion = menuAdmin();

                            switch (opcion) {

                                case 1: {
                                    Productos producto = new Productos();
                                    System.out.println("Escriba el ID del producto");
                                    id = entrada.nextInt();
                                    producto.setId(id);

                                    System.out.println("Escriba el nombre del producto");
                                    nombre = entrada.next();
                                    producto.setNombre(nombre);

                                    System.out.println("Escriba el precio del producto");
                                    precio = (entrada.nextDouble());
                                    producto.setPrecio(precio);
                                    products.add(producto);
                                    break;
                                }
                                case 2: {
                                    for (int i = 0; i < products.size(); i++) {
                                        System.out.println("Posicion: " + i);
                                        System.out.println("ID: " + products.get(i).getId());
                                        System.out.println("Nombre: " + products.get(i).getNombre());
                                        System.out.println("Precio: " + products.get(i).getPrecio());
                                        System.out.println("---------");
                                    }
                                    break;
                                }
                                case 3: {
                                    System.out.println("Dime la posicion del producto a borrar: ");
                                    posicion_a_borrar = entrada.nextInt();
                                    products.remove(posicion_a_borrar);
                                    break;
                                }
                                case 4: {  
                                    
                                    
                                    escribir.escritura(String.valueOf(products));

                                    break;
                                }
                                case 5:{
                                 break;   
                                }
                            }
                    
                    break;
                }
                case 2: {

                    

                        opcion = menuCliente();

                        switch (opcion) {

                            case 1: {
                                System.out.println(Files.readAllLines(Path.of("Catalogo.txt")));
                                break;
                            }

                            case 2: {
                                break;
                            }
                        }
                    
                    break;
                }
                
                case 3: {
                    break;
                }
            }
        } while (opcion != 3);
    }
    public static int menu() {
        Scanner in = new Scanner(System.in);
        String resp;

        System.out.println(ANSI_YELLOW + "-----BENI BENITO-----");
        System.out.println("---------------------" + ANSI_RESET);
        System.out.println(ANSI_GREEN+"\n    1.- Admin"+ANSI_RESET);
        System.out.println(ANSI_BLUE+"    2.- Cliente"+ANSI_RESET);
        System.out.println(ANSI_RED+"    3.- Salir"+ANSI_RESET);


        do {
            System.out.print("\nSelecciona una opción (1-3): ");
            resp = in.nextLine();
        } while (!resp.matches("[1-3]"));

        return Integer.parseInt(resp);
    }
    
    public static int menuCliente() {
        Scanner in = new Scanner(System.in);
        String resp;

        System.out.println("\nHa accedido al menu cliente...");
        System.out.println(ANSI_BLUE + "-----BENI BENITO clientes-----");
        System.out.println("------------------------------" + ANSI_RESET);
        System.out.println("\n    1.- Ver catalogo en Catalogo.txt");
        System.out.println(ANSI_RED+"    2.- Salir"+ANSI_RESET);


        do {
            System.out.print("\nSelecciona una opción (1-2): ");
            resp = in.nextLine();
        } while (!resp.matches("[1-2]"));

        return Integer.parseInt(resp);
    }
    
    public static int menuAdmin() {
        Scanner in = new Scanner(System.in);
        String resp;

        System.out.println("\nHa accedido al menu admin...");
        System.out.println(ANSI_GREEN + "-----BENI BENITO admin-----");
        System.out.println("---------------------------" + ANSI_RESET);
        System.out.println("\n    1.- Ingresar producto");
        System.out.println("    2.- Ver catalogo");
        System.out.println("    3.- Dar de baja un producto");
        System.out.println("    4.- Escribir el catalogo en catalogo.txt");
        System.out.println(ANSI_RED+"    5.- Salir"+ANSI_RESET);

        do {
            System.out.print("\nSelecciona una opción (1-5): ");
            resp = in.nextLine();
        } while (!resp.matches("[1-5]"));

        return Integer.parseInt(resp);

    }
    
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLUE = "\u001B[34m";
}
