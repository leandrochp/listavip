package br.com.alura.listavip;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.alura.listavip.model.Convidado;
import br.com.alura.listavip.service.ConvidadoService;

@Controller
public class ConvidadoController {
	
	@Autowired
	private ConvidadoService service;
	
    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("listaconvidados")
    public String listaConvidados(Model model) {
    	
        model.addAttribute("convidados", service.obterTodos());
        return "listaconvidados";
    }
    
    @PostMapping("/salvar")
	public String salvar(@RequestParam("nome") String nome, 
			@RequestParam("email") String email, @RequestParam("telefone") String telefone, Model model) {	

    	service.salvar(new Convidado(nome, email, telefone));
    	
    	model.addAttribute("convidados", service.obterTodos());
    	return "listaconvidados";
    	
    }
}
