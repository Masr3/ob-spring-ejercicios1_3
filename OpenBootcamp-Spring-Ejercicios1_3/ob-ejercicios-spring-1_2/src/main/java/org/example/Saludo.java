package org.example;

import org.springframework.stereotype.Component;

@Component
public class Saludo {

    public void imprimirSaludo(){
        System.out.println("Hola, este es un saludo desde Spring!");
    }

}
