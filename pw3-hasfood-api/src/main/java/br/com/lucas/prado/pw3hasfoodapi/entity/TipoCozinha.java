package br.com.lucas.prado.pw3hasfoodapi.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "TBL_TIPO_COZINHA")
@Getter
@Setter
public class TipoCozinha {

	@Id
	@Column(name = "ID_TIPO_COZINHA")
	private long idTipoCozinha;
	
	@Column(name = "TX_NOME")
	private String nome;
	
	@Column(name = "DT_EXCLUSAO")
	private Date dataExclusao;
	
}
