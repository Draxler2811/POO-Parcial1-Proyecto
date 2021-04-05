/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MenuProyecto;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author ol196
 */
public class MainProyecto {

    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Proyecto1[] productos;
        int tam = 0;
        System.out.println("De que tamaño es la cartela ");
        tam = sc.nextInt();
        productos = new Proyecto1[tam];
        int tam2 = 0;
        
        

        for (int i = 0; i < productos.length; i++) {
            productos[i] = new Proyecto1();
        }

        int opc = 100;//Menu principAL
        int opc2 = 100;//Producto a mostrar
        int opc3 = 100;//menu secundario
        String opc4 = "";
      
        tam2 = tam;
        
        while (opc != 0) {
            System.out.println("Tamaño de la cartera : " + tam);
            System.out.println("te quedan estos registro: " + tam2);
            System.out.println("1) Agregar clientes ");
            System.out.println("2) Mostrar clientes ");
            System.out.println("3) Buscar cliente ");
            System.out.println("0) Cerrar Systema ");
            System.out.println("Elige una opcion: ");
            opc = sc.nextInt();
            tam2=tam2-tam;
            switch (opc) {
                case 1:
                    try {

                        for (int i = 0; i < productos.length; i++) {
                            System.out.print("Ingresa el codigo cliente: ");
                            productos[i].setCodigoCliente(sc.nextInt());
                            System.out.print("Nombre o nombres:");
                            productos[i].setNombre(bf.readLine());
                            System.out.print("Apellido Paterno:");
                            productos[i].setApellidoPaterno(bf.readLine());
                            System.out.print("Apeliido Materno:");
                            productos[i].setApellidoMaterno(bf.readLine());
                            System.out.print("Telefono:");
                            productos[i].setTelefono(bf.readLine());
                            System.out.print("Direccion: ");
                            productos[i].setDirrecion(bf.readLine());
                            System.out.print("Edad: ");
                            productos[i].setEdad(sc.nextInt());
                        }
                    } catch (Exception e) {
                        System.out.println("Ya no hay espacio en la cartera:");
                    }
                    break;
                case 2:
                    System.out.println("---Clientes");
                    for (int i = 0; i < productos.length; i++) {
                        System.out.println("Codigo cliennte: " + productos[i].getCodigoCliente());
                        System.out.println("Nombre o  Nombre: " + productos[i].getNombre());
                        System.out.println("Apelldio Paterno: " + productos[i].getApellidoPaterno());
                        System.out.println("Apelldio Materno:" + productos[i].getApellidoMaterno());
                        System.out.println("Telefono:" + productos[i].getTelefono());
                        System.out.println("Dirrecion: " + productos[i].getDirrecion());
                        System.out.println("Edad: " + productos[i].getTelefono());

                    }
                    break;
                case 3:
                    while (opc3 != 0) {
                        System.out.println("-----Sub Menu------");
                        System.out.println("1) Buscar por codigo ");
                        System.out.println("2) Buscar por nombre  ");
                        System.out.println("0) Regresar");
                        System.out.print("Elige una opcion : ");
                        opc3 = sc.nextInt();
                        switch (opc3) {
                            case 1:
                                System.out.println("Dijite el codigo a buscar: ");
                                opc2 = sc.nextInt();
                                if (opc2 >= 0 && opc2 < productos.length) {
                                    System.out.println("codigo cliente: " + productos[opc2].getCodigoCliente());
                                    System.out.println("Nombre: " + productos[opc2].getNombre());
                                    System.out.println("Apellido Paterno: " + productos[opc2].getApellidoPaterno());
                                    System.out.println("Apellido Materno: " + productos[opc2].getApellidoMaterno());
                                    System.out.println("Telefono: " + productos[opc2].getTelefono());
                                    System.out.println("Dirrecion: " + productos[opc2].getDirrecion());
                                    System.out.println("edad: " + productos[opc2].getEdad());
                                } else {
                                    System.out.println("ese no existe");
                                }
                                break;
                            case 2:
                                boolean valid;
                                do {
                                    try {
                                        System.out.println("Nombre a buscar: ");
                                        opc4 = (bf.readLine());
                                        valid = true;
                                        for (int i = 0; i < productos.length; i++) {
                                            if (opc4.equals(productos[i].getNombre())) {
                                                System.out.println("codigo cliente: " + productos[i].getCodigoCliente());
                                                System.out.println("Nombre: " + productos[i].getNombre());
                                                System.out.println("Apellido Paterno: " + productos[i].getApellidoPaterno());
                                                System.out.println("Apellido Materno: " + productos[i].getApellidoMaterno());
                                                System.out.println("Telefono: " + productos[i].getTelefono());
                                                System.out.println("Dirrecion: " + productos[i].getDirrecion());
                                                System.out.println("edad: " + productos[i].getEdad());

                                            }
                                        }
                                    } catch (Exception e) {
                                        System.out.print("Ese no nombre no existe aqui :");
                                        valid = false;
                                    }
                                } while (valid == false);

                                break;
                            case 0:
                                System.out.println("Regresaste al otro menu");
                        }
                    }
                    break;
                case 0:
                    System.out.println("Cerra Systema ");
                    break;
            }
        }
    }
}
