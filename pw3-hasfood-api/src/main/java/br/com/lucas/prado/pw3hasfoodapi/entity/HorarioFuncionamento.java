package br.com.lucas.prado.pw3hasfoodapi.entity;

import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import br.com.lucas.prado.pw3hasfoodapi.enums.DiaSemanaEnum;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "TBL_HORARIO_FUNCIONAMENTO")
@Getter
@Setter
public class HorarioFuncionamento {

	@Id
	@Column(name = "ID_HORARIO_FUNCIONAMENTO")
	private long idHorarioFuncionamento;
	
	@Column(name = "TX_DIA_SEMANA")
	private DiaSemanaEnum diaSemana;
	
	@Column(name = "HR_ABERTURA")
	private Time horaAbertura;
	
	@Column(name = "HR_FECHAMENTO")
	private Time horaFechamento;
	
	@OneToOne
	@JoinColumn(name = "ID_RESTAURANTE")
	public Restaurante idRestaurante;
	
}
