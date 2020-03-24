package ua.lviv.lgs.cars;

public class Wheel {
	
	private String season;
	private double size;
	
	public Wheel(String season, double size) {
		this.season = season;
		this.size = size;
	}

	public String getSeason() {
		return season;
	}

	public void setSeason(String season) {
		this.season = season;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}
	public void changesize() {
		this.size = size*2;
		
	}
	public void changeseason(String preseason) {
		this.season = preseason + " - " + season;
		
	}

	@Override
	public String toString() {
		return "season= " + season + ", size= " + size + " ";
	}
	
	
}
