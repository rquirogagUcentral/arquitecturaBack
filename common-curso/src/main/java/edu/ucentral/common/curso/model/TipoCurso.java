package edu.ucentral.common.curso.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tipo_curso")
public class TipoCurso implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name="tipo_curso")
	private String tipoCurso;
	
	
	
	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getTipoCurso() {
		return tipoCurso;
	}



	public void setTipoCurso(String tipoCurso) {
		this.tipoCurso = tipoCurso;
	}



	private static final long serialVersionUID = 1L;

}
