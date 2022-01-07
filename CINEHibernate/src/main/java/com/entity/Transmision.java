package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="Transmision")
public class Transmision {
	
	public Transmision() {}
	public Transmision(int d) {
		this.idtransmision = d;
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="cid_auto")
	@SequenceGenerator(name="cid_auto", sequenceName="Transmision_SEQ")
	@Column(name="idtransmision", columnDefinition="number")
	int idtransmision;
	
	@Column(name="horario", columnDefinition="mvarchar2(20)")
	String horario;
	@Column(name="sala", columnDefinition="nvarchar2(20)")
	String sala;
	
	///llaves foraneas
//	@Column(name="idcine", columnDefinition="number")
//	int idcine;
//	@Column(name="idpelicula", columnDefinition="number")
//	int idpelicula;
	
	@ManyToOne
	@JoinColumn(name="idcine", columnDefinition = "number")
	public Cine cine;
	
	@ManyToOne
	@JoinColumn(name="idpelicula", columnDefinition = "number")
	public Pelicula pelicula;

	public int getIdtransmision() {
		return idtransmision;
	}
	public void setIdtransmision(int idtransmision) {
		this.idtransmision = idtransmision;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	public String getSala() {
		return sala;
	}
	public void setSala(String sala) {
		this.sala = sala;
	}
	public Cine getCine() {
		return cine;
	}
	public void setCine(Cine cine) {
		this.cine = cine;
	}
	public Pelicula getPelicula() {
		return pelicula;
	}
	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}
	
	// Getters and Setters
	
	
	
}
