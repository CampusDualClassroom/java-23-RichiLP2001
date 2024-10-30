package com.campusdual.classroom;

import com.sun.jdi.Value;

import java.util.HashMap;
import java.util.Map;

public class Exercise23 {

    public static Map<String, Person> createHashMap() {
            //creamo el mapa
        Map<String, Person> elMapa = new HashMap<>();
            //Agregamos elemento al mapa--> su CLAVE + CONTENIDO
        elMapa.put("person",new Person("John","Smith"));
        elMapa.put("teacher",new Teacher("María","Montessori","Educación"));
        elMapa.put("police", new PoliceOfficer("Jake","Peralta","B-99"));
        elMapa.put("doctor", new Doctor("Gregory","House","Nefrología e infectología"));

        return elMapa;
    }

    public static Person addMapValue(Map<String, Person> map, String key, Person value) {
        //devolvemos el codigo de agregar un elemento al mapa por parametros
        map.put(key,value);

        return value;}

    public static void printMapValues(Map<String, Person> map) {
        for(Map.Entry<String,Person> entrada : map.entrySet()){
            Person alguien = entrada.getValue();
            alguien.getDetails();
                //entrada.getValue().getDetails();
             }

    }

    public static void main(String[] args) {
        //Creamos el mapa
        System.out.println("Creamos el mapa");
        Map<String,Person> mapaPrueba = createHashMap();
        System.out.println("\nAgregamos algo al mapa: ");


        Person nuevaPersona = addMapValue(mapaPrueba,"police",new PoliceOfficer("Charles","Boyle","B-99"));
        System.out.println(nuevaPersona.name);

        System.out.println("Pasamos a IMPRIMIR contenido del mapa: ");
        printMapValues(mapaPrueba);



    }
    
}
