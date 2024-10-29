package ifrn.pi.eventos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import ifrn.pi.eventos.models.Evento;

@Controller
public class EventosController {

	@RequestMapping("/eventos/form")
	public String form() {
		return "FormEvento";
	}
		
	@RequestMapping("/eventos/form/envio")
	public String envio(Evento evento) {
		System.out.println("Seus dados estão corretos:" + evento.getId() + "," + evento.getNome() + "," + evento.getLocal() + "," + evento.getData() + "," + evento.getHorario());
		return "enviar";
	}
	}

