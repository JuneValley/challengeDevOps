package com.challengeDevOps.challengeDevOps.models;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Quiz {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String content;
	
	@OneToMany(mappedBy = "quiz", cascade = CascadeType.ALL)
    private List<Question> reponses;
	
	public Quiz(Long id, String content, List<Question> reponses) {
		super();
		this.id = id;
		this.content = content;
		this.reponses = reponses;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public List<Question> getReponses() {
		return reponses;
	}

	public void setReponses(List<Question> reponses) {
		this.reponses = reponses;
	}
}
