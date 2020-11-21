package com.example.TechCrunchNews;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TechCrunchNewsService {
	
private RestTemplate rt = new RestTemplate();
    
    @Value("${apiKey}")
     private String apikey;
     
	public List<Articles> getArticles(String keyword) {
		
		//language=en&country=us ,language=en
		String url = "http://newsapi.org/v2/top-headlines?q={keyword}&sources=techcrunch&apiKey={apikey}";
		TechCrunchNewsResponse tcnres = rt.getForObject(url, TechCrunchNewsResponse.class,keyword,apikey);
		return tcnres.getArticles();

}
}

