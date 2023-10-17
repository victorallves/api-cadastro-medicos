package med.vol.api.paciente;

import med.vol.api.medico.DadosEndereco;

public record DadosCadastroPaciente(
		String nome, 
		String email,
		String telefone,
		String cpf, 
		DadosEndereco endereco
		) {
}
