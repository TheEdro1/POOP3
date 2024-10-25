/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop3;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Month;
import java.util.ArrayList;  // Necesaria para ArrayList
import java.util.Date;
import java.util.Enumeration;
import java.util.Hashtable;  // Necesaria para Hashtable
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author estudiante
 */
public class POOP3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Formas de declarar arreglos en Java
        int nums[];   // Heredado de C
        int [] nums2 = {1,2,3,4,5}; // Forma recomendada
        int[] nums3 = new int [5];
        int[] nums4;
        nums4 = new int [5];
        
        System.out.println("######### for each #########");
        for (int temp : nums2) {
            System.out.println("Cuenta: "+ temp);           // Se puede concatenar con el +
        }
        
        System.out.println("######### for #########");
        
        for (int i = 0; i < nums4.length; i++) {            // Toma el nums4 debido a que fue el ultimo
            nums4[i] = i*10;                                // en declarar
        }
        
        for (int i = 0; i < nums4.length; i++) {            // Imprimir elementos inicializados
            int j = nums4[i];
            System.out.println(j);
        }
        
        System.out.println("######### String #########");  // Son Objetos inmutables
        
        // No es recomendada, se ceclara como un dato primitivo
        String cadena = new String("Hola mundo");  // Forma canonica
        System.out.println(cadena);
        
        String cadena1 = "Hola mundo de forma recomendada"; // Forma recomendada
        System.out.println(cadena1);
        
        String nombre = "Alan";
        String apellido = "Hernandez";
        System.out.println(nombre);
        System.out.println(apellido);
        System.out.println(nombre + " " + apellido);  // Concatenar cadenas
        
        String nombreCompleto = nombre + " " + apellido;  
        System.out.println(nombreCompleto);
        
        System.out.println("######### Wrapper #########");
        int a = 4;
        Integer b = new Integer(4);   // No es necesario escribir el segundo Integer
        System.out.println(b);      // en versiones posteriores no se usa esta forma
        Integer c = 4;
        System.out.println(c);
        
        // Autoboxing:
        Integer d = a;
        // String cadena3 = 4 es incorrecto
        
        //Convertir numeros en cadena: 
        String cadena3 = d.toString();  // Gracias al wrapper
        String cadena4 = 4 + "";
        System.out.println(cadena3);
        System.out.println(cadena4);
        
        // Almacena la direccionde memoria de objetos, se puede modificar dinamicamente
        System.out.println("######### Colecciones #########");
        System.out.println("######### ArrayList #########");  // java.util
        
        ArrayList<Integer> miArrayList = new ArrayList<Integer>(); 
        miArrayList.add(d);
        miArrayList.add(33);
        miArrayList.add(77);
        System.out.println(miArrayList.size());  // Cuantos elementos tiene la lista
        System.out.println(miArrayList.get(0)); // Seleccionar elemento
        miArrayList.add(1, 10);   // Inserta elementos, no sobre escribe
        System.out.println(miArrayList.size());
        
        System.out.println("**");
        for (Integer temp : miArrayList) {
            System.out.println(temp);
        }
        
        miArrayList.add(77); //  Mantiene el orden de inserción y permite elementos duplicados
        System.out.println("**");
        for (Integer temp : miArrayList) {
            System.out.println(temp);
        }
        System.out.println("Nuevo tamaño: "+ miArrayList.size());
        
        // Set: Sin orden de insercion y no permite elementos duplicados
        System.out.println("######### Hashtable #########");
        
        // Hashtable<Llave, valor>
        Hashtable<Integer, String> miTabla = new Hashtable<Integer, String>();
        miTabla.put(1, "uno");
        miTabla.put(55566778, "Antonio");
        miTabla.put(44778899, "Diana");
        System.out.println("Elementos en tabla: "+miTabla.size());
        
        // Asigna indices aleatoriamente a las llaves para poder llamar a los elementos
        System.out.println("######### Enumerador #########");
        // Necesita variables temporales para la llave y el valor
        Integer llave;
        String valor;
        
        Enumeration<Integer> enumeradorLlaves = miTabla.keys();  // Sacamos el conjunto de llaves para enumerarlos
        while (enumeradorLlaves.hasMoreElements()) {  // Mientras hayan elementos
            llave = enumeradorLlaves.nextElement();   // Pasa a enumerar el siguiete elemento
            valor = miTabla.get(llave);   // Para ver el elemento conseguido
            System.out.println(llave + " " + valor);
        }
        
        // Realizar diccionario de 5 palabras con Hashtable e imprimirlo
        System.out.println("\"######### Diccionario #########");
        Hashtable<String, String> diccionario = new Hashtable<String, String>();  // Creando el Hashtable
        diccionario.put("Celaje", " Aspecto que presenta el cielo cuando hay nubes tenues y de varios matices.");   // Agregando elementos
        diccionario.put("Depauperar", "Debilitar, extenuar fisica o moralmente, ya sea uno mismo o hacia otra persona");
        diccionario.put("Farmacopea", "Repertorio o libro de recetas medicinales, pudiendo ser estas tanto farmacos como fitoterapeuticas.");
        diccionario.put("Hermeneuta", "Persona que interpreta textos, normalmente de caracter religioso o etico, para fijar su verdadero sentido.");
        diccionario.put("Limerencia", "Locura de amor. Estado mental involuntario en el que la atraccion de un persona hacia la otra le impide pensar de forma racional.");
        
        System.out.println("Elementos en el diccionario: "+diccionario.size());  // Comprobando el tamanio
        
        String palabra;
        String significado;
        
        Enumeration<String> enumeradorPalabras = diccionario.keys();  // Enumerando las llaves
        while (enumeradorPalabras.hasMoreElements()) {    // Imprimiendo todos los elementos 
            palabra = enumeradorPalabras.nextElement();
            significado = diccionario.get(palabra);
            System.out.println(palabra + ": " + significado + "\n");
        }
        
        // Realizar agenda con 5 registros, guardando nombre y su cumpleaños usando el elemento calendar e imprimirlo
        
        System.out.println("######### Usando Date #########");
        
        Date dia = new Date();         // Nos avisa la fecha de hoy, necesita java.util.Date
        System.out.println(dia);      
        
        System.out.println("######### Agenda usando Calendar #########");
        
        Hashtable<String, Calendar> agenda = new Hashtable<String, Calendar>();
        
        // Formas de crear un objeto calendar
        Calendar fecha1 = Calendar.getInstance();
        fecha1.set(2005, 8, 19);
        System.out.println(fecha1.getTime());
        
        Calendar fecha2 = new GregorianCalendar(1975, 11, 25);
        System.out.println(fecha2.getTime());
        
        Calendar fecha3 = new GregorianCalendar(2005, 3, 19);
        Calendar fecha4 = new GregorianCalendar(2000, 11, 12);
        Calendar fecha5 = new GregorianCalendar(2004, 2, 14);
        
        agenda.put("Alan", fecha1);
        agenda.put("Ivonne", fecha2);
        agenda.put("Jokabed", fecha3);
        agenda.put("Iris", fecha4);
        agenda.put("Karla", fecha5);
        
       // Calendar cumpleanos = Calendar.getInstance();
        
        String nombres;
        
        Calendar birthday;
        
        Enumeration<String> enumeradorPersonas = agenda.keys();
        
        // Imprimiendo todos los elementos 
        while (enumeradorPersonas.hasMoreElements()) {    
            nombres = enumeradorPersonas.nextElement();
            birthday = agenda.get(nombres);
            System.out.println("Nombre: " + nombres + "\nCumple el dia " 
                    + birthday.get(Calendar.DAY_OF_MONTH) + " del mes " 
                    + birthday.get(Calendar.MONTH) + "\n");
        }
        
       
        //define el formato de la fecha
        DateFormat formateador= new SimpleDateFormat("dd/M/yy");
        try {
            // convierte un String en formato fecha en una fecha real
            Date fecha= formateador.parse("10/01/2022");
            // creamos un calendario
            Calendar calendario= new GregorianCalendar();
            //hacemos calculos sobre el calendario
            calendario.setTime(fecha);
            //movemos el ccalendario
            calendario.add(Calendar.DATE,5);
            //usamos el formateador y volvemos a mostrar la fecha
            System.out.println(formateador.format(calendario.getTime()));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        
    }
    
}