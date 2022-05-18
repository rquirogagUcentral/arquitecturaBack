package edu.ucentral.common.usuario.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="usuarios")
public class Usuario implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "tipo_identificacion")
	private String tipoIdentificacion;
	@Column(unique = true, length = 20)
	private String identificacion;
	private String contrasena;
	private Boolean habilitado;
	private String correo;
	private String nombre;
	private String telefono;
	@Column(name ="fecha_nacimiento")
	private Date fechaNacimiento; 
	@OneToOne
	// @JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	@JoinColumn(name = "perfil_id")
	private Perfil perfil;
	@Column(name="id_empresa")
	private String idEmpresa;
	
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}



	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}



	public String getIdEmpresa() {
		return idEmpresa;
	}



	public void setIdEmpresa(String idEmpresa) {
		this.idEmpresa = idEmpresa;
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getTipoIdentificacion() {
		return tipoIdentificacion;
	}



	public void setTipoIdentificacion(String tipoIdentificacion) {
		this.tipoIdentificacion = tipoIdentificacion;
	}



	public String getIdentificacion() {
		return identificacion;
	}



	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}



	public String getContrasena() {
		return contrasena;
	}



	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}



	public Boolean getHabilitado() {
		return habilitado;
	}



	public void setHabilitado(Boolean habilitado) {
		this.habilitado = habilitado;
	}



	public String getCorreo() {
		return correo;
	}



	public void setCorreo(String correo) {
		this.correo = correo;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getTelefono() {
		return telefono;
	}



	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}



	public Perfil getPerfil() {
		return perfil;
	}



	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}



	private static final long serialVersionUID = 1L;

}
