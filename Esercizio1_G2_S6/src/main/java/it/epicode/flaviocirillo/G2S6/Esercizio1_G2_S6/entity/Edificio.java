package it.epicode.flaviocirillo.G2S6.Esercizio1_G2_S6.entity;

import java.util.Set;



import org.springframework.context.annotation.Scope;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "edifici")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Scope("prototype")
@Builder
public class Edificio {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int edificio_id;
	
	private String nome;
	private String indirizzo;
	private String citta;
	
	@OneToMany(mappedBy = "edificio")
	private Set<Postazione> postazioni;
	
}
