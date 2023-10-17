package med.vol.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import med.vol.api.medico.DadosCadastrosMedico;
import med.vol.api.medico.Medico;
import med.vol.api.medico.MedicoRepository;

@RestController
@RequestMapping("/medicos")
public class MedicoController {
	
	@Autowired
	private MedicoRepository repository;

	@PostMapping
	public void cadastrar(@RequestBody DadosCadastrosMedico dados) {
		repository.save(new Medico(dados));
	}
	
}
