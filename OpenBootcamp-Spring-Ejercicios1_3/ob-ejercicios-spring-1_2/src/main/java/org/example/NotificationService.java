package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class NotificationService {

    Saludo saludo;

@Autowired
    public NotificationService(Saludo saludo) {
        this.saludo = saludo;
    }
}
