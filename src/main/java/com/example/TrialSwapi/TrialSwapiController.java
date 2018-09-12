package com.example.TrialSwapi;

import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.example.TrialSwapi.apifilms.FilmFirstLayer;
import com.example.TrialSwapi.apipeople.PeopleFirstLayer;


@Controller
public class TrialSwapiController {
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	@RequestMapping("/filmspage")
	public ModelAndView films() {
		ModelAndView mav = new ModelAndView("filmspage");
		
		String url = "https://swapi.co/api/films/?format=json";//difference here FILMS
		
		HttpHeaders headers = new HttpHeaders();
		headers.add(HttpHeaders.USER_AGENT, "Let me in!");
		
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<FilmFirstLayer> response = restTemplate.exchange(url,
				HttpMethod.GET, new HttpEntity<>(headers),
				FilmFirstLayer.class);
		FilmFirstLayer filmdata = response.getBody();
		
		mav.addObject("films", filmdata);
		
		return mav;
	}
	
	@RequestMapping("/peoplepage")
	public ModelAndView people() {
		ModelAndView mav = new ModelAndView("peoplepage");
		
		String url = "https://swapi.co/api/people/?format=json";//difference here PEOPLE
		
		HttpHeaders headers = new HttpHeaders();
		headers.add(HttpHeaders.USER_AGENT, "Let me in!");
		
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<PeopleFirstLayer> response = restTemplate.exchange(url,
				HttpMethod.GET, new HttpEntity<>(headers),
				PeopleFirstLayer.class);
		PeopleFirstLayer peopledata = response.getBody();
		
		mav.addObject("people", peopledata);
		
		return mav;
	}

}
