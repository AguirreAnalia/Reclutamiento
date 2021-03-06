
package com.Grupo6.ReclutamientoEmpleados.Servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailService {
    
    @Autowired
    private JavaMailSender javaMailSender;
    
    public void enviarMail(String destinatario, String asunto, String contenido) {
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setTo(destinatario);
        simpleMailMessage.setSubject(asunto);
        simpleMailMessage.setText(contenido);
        javaMailSender.send(simpleMailMessage);
        
    }
}
