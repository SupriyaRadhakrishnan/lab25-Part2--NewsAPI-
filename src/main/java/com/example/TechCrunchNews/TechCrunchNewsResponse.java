package com.example.TechCrunchNews;

import java.util.List;

public class TechCrunchNewsResponse {
	
	
	private List<Articles> articles;
	
	
	public TechCrunchNewsResponse()
	{
		
	}

	public List<Articles> getArticles() {
		return articles;
	}

	public void setArticles(List<Articles> articles) {
		this.articles = articles;
	}

}
