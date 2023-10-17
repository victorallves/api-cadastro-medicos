package med.vol.api.paciente;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import med.vol.api.endereco.Endereco;

	@Table(name = "paciente")
	@Entity(name = "Paciente")
	@Getter
	@NoArgsConstructor
	@AllArgsConstructor
	@EqualsAndHashCode(of = "id")

	public class Paciente {

		@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String nome;
	    private String email;
	    private String telefone;
	    private String cpf;

	    @Embedded
	    private Endereco endereco;
	 
	    public Paciente(DadosCadastroPaciente dadoPaciente) {
	    	this.nome = dadoPaciente.nome();
	    	this.email = dadoPaciente.email();
	    	this.telefone = dadoPaciente.telefone();
	    	this.cpf = dadoPaciente.cpf();
	    	this.endereco = new Endereco(dadoPaciente.endereco());
	    	
	    }
	}
	    
