package zone.cyclops.estoque.endpoint;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import zone.cyclops.estoque.domain.Item;
import zone.cyclops.estoque.domain.Teste;
import zone.cyclops.estoque.repository.TesteRepository;
import zone.cyclops.estoque.service.SqsSender;

@RestController
@RequestMapping(value = "/testes")
public class TesteRest {
	
	@Autowired
	private TesteRepository testeRepository;
	
	@Autowired
	private SqsSender sqsSender;
	
	@RequestMapping(method = RequestMethod.GET)
    @ResponseBody
	private List<Teste> index(){
		return (List<Teste>) testeRepository.findAll();
	}
	
	
	@RequestMapping(value = "/{texto}", method = RequestMethod.GET)
    @ResponseBody
	private List<Teste> show(@PathVariable String texto){
		return (List<Teste>) testeRepository.findByTexto(texto);
	}
	
	
	
	@RequestMapping(method = RequestMethod.POST)
    @ResponseBody
	private void enfilerar(@RequestBody Item item){
		sqsSender.send(item);
	}

}
