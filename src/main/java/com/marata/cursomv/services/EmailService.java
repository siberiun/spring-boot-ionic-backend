package com.marata.cursomv.services;

import org.springframework.mail.SimpleMailMessage;

import com.marata.cursomv.domain.Pedido;

public interface EmailService {
	
	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);

}
