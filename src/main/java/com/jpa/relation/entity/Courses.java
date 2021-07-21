package com.jpa.relation.entity;

/*import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table (name="courses") */
public class Courses {
	
	/*@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column (name="id")
	private long id;
	@Column (name="abbreviation")
	private String abbreviation;
	@Column (name="fee")
	private Double fee;
	@Column (name="modulus")
	private int modulus;
	@Column (name="title")
	private String title;
	
	@ManyToMany(fetch= FetchType.LAZY, cascade = cascadeType.PERSIST)
	@JoinTable(name="students_course",JoinColumns {
			@JoinColumn(name="student_id", referencedColumnName = "id", nullable = false, updatable = false)}
		@inverseJoinColumns = {
			@JoinColumn(name = "course_id", referencedColumnName = "id",
					nullable = false, updatable = false)})
	private set<Course> courses = new Hashset<>(); */
	
	
	

}
