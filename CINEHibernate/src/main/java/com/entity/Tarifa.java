package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name="Tarifa")
public class Tarifa {
	
	public Tarifa() {}
	public Tarifa(int id) {
		this.idtarifa = id;
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="cid_auto")
	@SequenceGenerator(name="cid_auto", sequenceName="Tarifa_SEQ")
	@Column(name="idtarifa", columnDefinition="Number")
	int idtarifa;
	
	@Column(name="dia", columnDefinition="nvarchar2(10)")
	String dia;
	@Column(name="precio", columnDefinition="Number")
	int precio;
	
	@OneToOne(mappedBy="tarifa")
	private Cine cine;
	
//	@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property="@id")

	public int getIdtarifa() {
		return idtarifa;
	}
	public void setIdtarifa(int idtarifa) {
		this.idtarifa = idtarifa;
	}
	public String getDia() {
		return dia;
	}
	public void setDia(String dia) {
		this.dia = dia;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "Tarifa [idtarifa=" + idtarifa + ", dia=" + dia + ", precio=" + precio + ", cine=" + cine + "]";
	}
	
	
	//Getters and Setters
	
	

}
