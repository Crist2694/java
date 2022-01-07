package com.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name="Cine")
public class Cine {
	
	public Cine() {}
	public Cine (int id) {
		this.idcine=id;
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="cid_auto")
	@SequenceGenerator(name="cid_auto", sequenceName="Cine_SEQ")
	@Column(name="idcine", columnDefinition="number")
	int idcine;
	
	@Column(name="nombre", columnDefinition="nvarchar2(10)")
	String nombre;
	@Column(name="calle", columnDefinition="nvarchar2(50)")
	String calle;
	@Column(name="numero", columnDefinition="nvarchar2(10)")
	String numero;
	
	// llaves foraneas
//	@Column(name="idtarifa", columnDefinition="number")
//	int idtarifa;
	
	@OneToOne
	@JoinColumn(name="idtarifa")
	private Tarifa tarifa;
	@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property="@idtarifa")
	
	// relacion con trabla de Transmision
	@OneToMany(mappedBy = "cine")
	List<Transmision> list;

	public int getIdcine() {
		return idcine;
	}
	public void setIdcine(int idcine) {
		this.idcine = idcine;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public Tarifa getTarifa() {
		return tarifa;
	}
	public void setTarifa(Tarifa tarifa) {
		this.tarifa = tarifa;
	}


	//Getters and setters
	
	
	
}
