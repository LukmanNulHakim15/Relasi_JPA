package com.jpa.relation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jpa.relation.entity.Instruktor;
import com.jpa.relation.entity.InstruktorDetail;
import com.jpa.relation.repository.InstruktorRepository;

@SpringBootApplication
public class JpaRelationTableApplication implements CommandLineRunner {
	
	private static final String InstruktorRepository = null;

	public static void main(String[] args) {
		SpringApplication.run(JpaRelationTableApplication.class, args);
	}
	
	@Autowired
	InstruktorRepository instruktorRepository;
	
	//@Autowired
	//PostRepository postrepository;
	//private Object postRepository;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Instruktor instruktur = new Instruktor();
		instruktur.setEmail("lukmannul15@gmail.com.com");
		instruktur.setFirst_name("Lukman");
		instruktur.setLast_name("Hakim");
		
		InstruktorDetail detail1 = new InstruktorDetail();
		detail1.setHobby("Makan");
		detail1.setYoutube_channel("youtube/buluk15");
		
		instruktur.setInstruktorDetail(detail1);
		
		this.instruktorRepository.save(instruktur); 
		
	/*	Post post = new Post();
		post.setTitle("tiktok Keren");
		post.setDescription("Cerita tiktok gw");
		
		Comment comment1 = new Comment();
		comment1.setText("Wuih keren banget");
		
		Comment comment2 = new Comment();
		comment2.setText("Upload lagi dong");
		
		List<Comment> lstComment = new ArrayList<Comment>();
		lstComment.add(comment1);
		lstComment.add(comment2);
		
		post.setLstComment(lstComment);
		this.postrepository.save(post); */
		
		
		
		
	}

}
