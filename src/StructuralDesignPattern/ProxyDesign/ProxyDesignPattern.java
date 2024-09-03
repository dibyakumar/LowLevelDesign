package StructuralDesignPattern.ProxyDesign;

public class ProxyDesignPattern {
public static void main(String[] args) {
	/**
	 * In this Design , we are going to add a placeholder or proxy before accessing a file or server or class
	 * 
	 * In that proxy we will do some pre-processing or post-processing or any caching related code 
	 * 
	 * In this example we will load an image from HDD or from a Server , which is very time consuming but 
	 * we are going introduce a proxy before loading the image , which will cache the image one loaded .
	 */
	
	ImageProxy imageProxy = new ImageProxy("pic.png");
	
	imageProxy.display();
	
	imageProxy.display();
}
}
