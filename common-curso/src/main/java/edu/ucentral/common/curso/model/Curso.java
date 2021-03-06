package edu.ucentral.common.curso.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import edu.ucentral.common.usuario.model.Usuario;

@Entity
@Table(name="cursos")
public class Curso implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name="nombre_curso")
	private String nombreCurso;
	@OneToOne
	@JoinColumn(name="tipo_curso")
	private TipoCurso idCurso;
	private String objetivo;
	private String ubicacion;
	@OneToOne
	@JoinColumn(name="id_usuario")
	private Usuario docente;
	private int precio;
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name="curso_estudiantes", joinColumns= @JoinColumn(name="curso_id"), 
				inverseJoinColumns = @JoinColumn(name="estudiante_id"),
				uniqueConstraints = {@UniqueConstraint(columnNames = {"curso_id","estudiante_id"})})
	private List<Usuario> estudiantes;
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@JoinColumn(name = "curso_id")
	private List<Leccion> lecciones;
	
	public Curso ()
	{
		this.estudiantes = new ArrayList<Usuario>();
		this.lecciones = new ArrayList<Leccion>();
	}
	
	
	public Long getId() {
		return id;
	}




	public void setId(Long id) {
		this.id = id;
	}




	public String getNombreCurso() {
		return nombreCurso;
	}




	public void setNombreCurso(String nombreCurso) {
		this.nombreCurso = nombreCurso;
	}




	public TipoCurso getIdCurso() {
		return idCurso;
	}




	public void setIdCurso(TipoCurso idCurso) {
		this.idCurso = idCurso;
	}


	

	public String getObjetivo() {
		return objetivo;
	}




	public void setObjetivo(String objetivo) {
		this.objetivo = objetivo;
	}




	public String getUbicacion() {
		return ubicacion;
	}




	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}




	public Usuario getDocente() {
		return docente;
	}




	public void setDocente(Usuario docente) {
		this.docente = docente;
	}




	public int getPrecio() {
		return precio;
	}




	public void setPrecio(int precio) {
		this.precio = precio;
	}




	public List<Usuario> getEstudiantes() {
		return estudiantes;
	}




	public void setEstudiantes(List<Usuario> estudiantes) {
		this.estudiantes = estudiantes;
	}




	public List<Leccion> getLecciones() {
		return lecciones;
	}




	public void setLecciones(List<Leccion> lecciones) {
		this.lecciones = lecciones;
	}

	
	public void addEstudiantes(Usuario estudiante)
	{
		estudiantes.add(estudiante);
	}

	public void addLecciones(Leccion leccion)
	{
		lecciones.add(leccion);
	}
	
	public void removeEstudiantes(Usuario estudiante)
	{
		estudiantes.remove(estudiante);
	}

	public void removeLecciones(Leccion leccion)
	{
		lecciones.remove(leccion);
	}

	private static final long serialVersionUID = 1L;

}
