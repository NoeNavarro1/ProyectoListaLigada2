/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaligada;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestingListaLigada {
    
    
    public static void main(String[] args) throws IOException {
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;

        int dato = 0;
        char respuesta;

        ListaLigada lista = new ListaLigada();
        /*
        while (true) {
            System.out.println("Escribe un dato entero");
            entrada = bufer.readLine();
            dato = Integer.parseInt(entrada);
            lista.add(dato);
            System.out.println("Se ha agregado el dato a la lista");
            System.out.println("¿Quieres agregar mas datos? (s/n):");
            entrada = bufer.readLine();
            respuesta = entrada.charAt(0);
            if (respuesta == 'n' || respuesta == 'N') {
             break;
             
              }
            System.out.println("-------------------");
            System.out.println("Contenido de la lista Ligada:");
            lista.printList();
        }

        System.out.println("Escribe el dato entero: ");
        entrada = bufer.readLine();
        dato = Integer.parseInt(entrada);
        lista.add(dato);

        System.out.println("Escribe el dato entero: ");
        entrada = bufer.readLine();
        dato = Integer.parseInt(entrada);
        lista.add(dato);

        System.out.println("Escribe el dato entero: ");
        entrada = bufer.readLine();
        dato = Integer.parseInt(entrada);
        lista.add(dato);

        System.out.println("--------------------------");
        System.out.println("Contenido lista ligada");
        lista.printList();

        System.out.println("--------------------------");
        System.out.println("Inserción de un nuevo nodo");
        System.out.println("Escribe el elemento a inserta: ");
        entrada = bufer.readLine();
        int p = Integer.parseInt(entrada);
        lista.add(dato, p);

        System.out.println("---------------------------");
        System.out.println("Contenido de la lista");
        lista.printList();
        */
        
        //Otra lista ligada,ahora almacena Strings
        ListaLigada<String> lista2 = new ListaLigada<>();
        System.out.println("-----Creando una lista de Strings------");
        
        for(;;){
            System.out.println("Escriba el String para agregar a la lista: ");
            entrada = bufer.readLine();
            lista2.add(entrada);
            System.out.println("1.¿Quieres insertar mas datos? presione s para si, n para no");    
            entrada = bufer.readLine();
            respuesta = entrada.charAt(0);
            if(respuesta == 's'){
                System.out.println("Inserte el dato");
                bufer.readLine();
            }else if(respuesta == 'n'){
               System.out.println("2.¿Quieres eliminar el dato del inicio? presione s para si, n para no");
               bufer.readLine();
            }else if(respuesta == 's'){
                System.out.println("El dato del nodo inicial a sido eliminado correctamente");
            }else if(respuesta == 'n'){
               System.out.println("3¿Quieres eliminar el dato del final? presione s para si, n para no");
               bufer.readLine();
            }else if(respuesta == 's'){
                System.out.println("el dato del nodo final Fue eliminado correctamente");
            }else if(respuesta == 'n'){
               System.out.println("4.¿Quieres eliminar un dato especifico? presione s para si, n para no");
               bufer.readLine();
            }else if(respuesta == 's'){
                  System.out.println("¿Que dato desea eliminar?");
               bufer.readLine();     
              }
             break;
                }
           System.out.println(" Contenido de la lista String");
           lista2.printList();
    }   
}

