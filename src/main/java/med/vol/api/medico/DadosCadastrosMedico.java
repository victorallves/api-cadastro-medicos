package med.vol.api.medico;

public record DadosCadastrosMedico(
		String nome, 
		String email, 
		String crm, 
		Especialidade especialidade, 
		DadosEndereco endereco
		) {
}
