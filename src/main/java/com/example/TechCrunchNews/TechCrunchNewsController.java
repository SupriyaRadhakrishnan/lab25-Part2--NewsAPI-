package com.example.TechCrunchNews;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TechCrunchNewsController {
	
	@Autowired
	private TechCrunchNewsService tcnservice;
	
	@GetMapping("/")
	public String index(String search, Model model)
	{
		List<Articles> articles = tcnservice.getArticles(search);
		model.addAttribute("articles",articles);
		return "index";
	}
	

}
