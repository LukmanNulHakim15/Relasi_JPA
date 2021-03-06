package com.jpa.relation.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table (name="post")

public class Post {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column (name="id")
	private long id;
	@Column (name="description")
	private String description;
	@Column (name="title")
	private String title;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="post_id", referencedColumnName = "id")
	List<Comment> lstComment = new ArrayList<Comment>();


		
	
	
	
	

}
