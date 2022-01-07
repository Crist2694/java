package com.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="Pelicula")
public class Pelicula {
	
	public Pelicula() {}
	public Pelicula(int d) {
		this.idpelicula = d;
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="cid_auto")
	@SequenceGenerator(name="cid_auto", sequenceName="Peliculas_SEQ")
	@Column(name="idpelicula", columnDefinition="number")
	int idpelicula;
	
	@Column(name="nombre", columnDefinition="nvarchar2(50)")
	String nombre;
	@Column(name="horario_pases", columnDefinition="nvarchar2(50)")
	String horario_pases;
	@Column(name="director", columnDefinition="nvarchar2(50)")
	String director;
	@Column(name="protagonistas", columnDefinition="nvarchar2(100)")
	String protagonistas;
	@Column(name="genero", columnDefinition="nvarchar2(20)")
	String genero;
	
	@OneToMany(mappedBy = "pelicula")
	List<Transmision> list;
	
	//getters and setters
	
	public int getIdpelicula() {
		return idpelicula;
	}
	public void setIdpelicula(int idpelicula) {
		this.idpelicula = idpelicula;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getHorario_pases() {
		return horario_pases;
	}
	public void setHorario_pases(String horario_pases) {
		this.horario_pases = horario_pases;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getProtagonistas() {
		return protagonistas;
	}
	public void setProtagonistas(String protagonistas) {
		this.protagonistas = protagonistas;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	
	
	

}
