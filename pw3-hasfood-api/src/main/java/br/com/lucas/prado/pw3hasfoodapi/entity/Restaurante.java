package br.com.lucas.prado.pw3hasfoodapi.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "TBL_RESTAURANTE")
@Getter
@Setter
public class Restaurante {

	@Id
	@Column(name = "ID_RESTAURANTE")
	private long idRestaurante;
	
	@Column(name = "TX_CNPJ")
	private String CNPJ;
	
	@Column(name = "TX_NOME")
	private String nome;
	
	@Column(name = "TX_DESCRICAO")
	private String descricao;
	
	@Column(name = "DT_APROVACAO")
	private Date dataAprovacao;
	
	@Column(name = "VLR_ENTREGA")
	private float valorEntrega;
	
	@Column(name = "NR_TEMPO_MIN_ENTREGA")
	private int tempoMinEntrega;
	
	@Column(name = "NR_TEMPO_MAX_ENTREGA")
	private int tempoMaxEntrega;
	
	@ManyToOne
	@JoinColumn(name = "ID_TIPO_COZINHA")
	public TipoCozinha idTipoCozinha;
	
}
