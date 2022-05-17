package edu.ucentral.common.curso.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="respuestas")
public class Respuesta implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String respuesta;
	private boolean value;
	
	
	
	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getRespuesta() {
		return respuesta;
	}



	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}



	public boolean isValue() {
		return value;
	}



	public void setValue(boolean value) {
		this.value = value;
	}



	private static final long serialVersionUID = 1L;
	
}
