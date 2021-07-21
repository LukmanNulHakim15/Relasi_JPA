package com.jpa.relation.entity;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="instruktordetail")

public class InstruktorDetail implements Serializable  {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //AutoIncrement untuk primary key	
	@Column (name="id")
	private long id;
	@Column (name="hobby")
	private String hobby;
	@Column (name="youtube_channel")	
	private String youtube_channel;
	

}
