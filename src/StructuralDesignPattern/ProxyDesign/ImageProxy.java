package StructuralDesignPattern.ProxyDesign;

public class ImageProxy {
	RealImage realImage;
	String file;
	
	public ImageProxy(String file) {
		this.file = file;
	}
	
	public void display() {
		// caching
		if(realImage == null)
			realImage = new RealImage(file);
		
		System.out.println("\n "+realImage.hashCode()+" \n");
		realImage.display(file);
	}
	
}
