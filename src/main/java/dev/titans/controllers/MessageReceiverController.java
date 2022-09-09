package dev.titans.controllers;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Controller;

@Controller
public class MessageReceiverController {
    @JmsListener(destination = "titan-important-events", containerFactory = "jmsListenerContainerFactory")
    public void recieveMessages(String message){
        System.out.println(message);

    }

}
