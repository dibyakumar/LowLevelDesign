package StructuralDesignPattern.ProxyDesign;

public class RealImage implements Image{
	String file;
	
	public RealImage(String file) {
		this.file = file;
		loadImageFromLoc(file);
	}
	
	@Override
	public void display(String file) {
		System.out.println("Image is Showing form Location "+file);
	}
	
	public void loadImageFromLoc(String loc) {
		System.out.println("Image is Loading... form Location "+loc);
	}
}
