package com.spring.model;

public class Instrumentalist {
	private String song;
	private Instrument inst;
	
	
	public Instrumentalist() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Instrumentalist(String song, Instrument inst) {
		super();
		this.song = song;
		this.inst = inst;
	}
	
	

	public String getSong() {
		return song;
	}


	public void setSong(String song) {
		this.song = song;
	}


	public Instrument getInst() {
		return inst;
	}


	public void setInst(Instrument inst) {
		this.inst = inst;
	}


	public void perform() {
		System.out.println("Instrumentlist plays :-"+song);
		inst.play();
	}


	@Override
	public String toString() {
		return "Instrumentalist [song=" + song + "\n, inst=" + inst + "\n]";
	}
	
}
