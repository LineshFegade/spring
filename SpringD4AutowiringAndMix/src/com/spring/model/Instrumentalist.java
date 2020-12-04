package com.spring.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("instrumentList")
public class Instrumentalist {
	
	private String songs;
	
	@Autowired
	@Qualifier("insts2")
	private Instrument insts;
	
	public Instrumentalist() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Instrumentalist(String songs, Instrument insts) {
		super();
		this.songs = songs;
		this.insts = insts;
	}
	public String getSongs() {
		return songs;
	}
	public void setSongs(String songs) {
		this.songs = songs;
	}
	public Instrument getInsts() {
		return insts;
	}
	public void setInsts(Instrument insts) {
		this.insts = insts;
	}
	
	public void perform() {
		insts.play();
	}
	@Override
	public String toString() {
		return "Instrumentalist [songs=" + songs + ", insts=" + insts + "]";
	}
	
}
