package com.fredwarsaw.service.neo.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NeoController {

	private static final String allNeo = null;
	private static final String threeNeo = null;
	private static final String smNeoJupiter = null;
	private static final String lgNeoMercury = null;

	@RequestMapping(value="/sayhello")
	public String sayHello() {
		return "Hello, Freddie-Ohh!";
	}
	
	public String allNearEarthObjects() {
		return allNeo;
		
	}
	
	public String displayThreeNeo() {
		return threeNeo;
	}
	
	public String smallestNEO() {
		return smNeoJupiter;
	}
	
	public String largestNEO() {
		return lgNeoMercury;
	}
}
