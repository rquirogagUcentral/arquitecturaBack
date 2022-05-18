package edu.ucentral.common.curso.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="lecciones")
public class Leccion implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nombreLeccion;
	private String contenidoLeccion;
	private String pregunta;
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@JoinColumn(name = "leccion_id")
	private List<Respuesta> respuestas; 
	
	public Leccion()
	{
		this.respuestas = new ArrayList<Respuesta>();
	}
	
	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getNombreLeccion() {
		return nombreLeccion;
	}



	public void setNombreLeccion(String nombreLeccion) {
		this.nombreLeccion = nombreLeccion;
	}



	public String getContenidoLeccion() {
		return contenidoLeccion;
	}



	public void setContenidoLeccion(String contenidoLeccion) {
		this.contenidoLeccion = contenidoLeccion;
	}



	public String getPregunta() {
		return pregunta;
	}



	public void setPregunta(String pregunta) {
		this.pregunta = pregunta;
	}



	public List<Respuesta> getRespuestas() {
		return respuestas;
	}



	public void setRespuestas(List<Respuesta> respuestas) {
		this.respuestas = respuestas;
	}


	public void addRespuesta(Respuesta respuesta)
	{
		respuestas.add(respuesta);
	}
	
	public void removerRespuesta(Respuesta respuesta)
	{
		respuestas.remove(respuesta);
	}

	private static final long serialVersionUID = 1L;

}
