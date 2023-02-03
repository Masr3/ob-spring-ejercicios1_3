package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        //Ejercicio 1

        //ApplicationContext ctx = new ClassPathXmlApplicationContext("beansEjercicio1.xml");

        //Saludo saludo = (Saludo)ctx.getBean("saludo");
        //saludo.imprimirSaludo();

        //-----------------------------------------------------------------

        //Ejercicio 2

        //Creo la ruta de mi archivo beans.xml

        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");

        //Instancio el bean que utilizare en la variable "usuario"
        UserService usuario = (UserService)ctx.getBean("userService");

        //Ya que tenia la clase Saludo del ejercicio pasado, aproveche y la utilize en la clase
        //Notification Service
        usuario.notificationService.saludo.imprimirSaludo();
    }
}