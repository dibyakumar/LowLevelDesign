package StructuralDesignPattern.CompositeDesignPattern.FileManagement;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem{
	
	private List<FileSystem> files;
	private String name;
	
	public Directory(String name) {
		files = new ArrayList<>();
		this.name = name;
	}
	
	public void add(FileSystem fs) {
		files.add(fs);
	}
	
	@Override
	public void ls() {
		System.out.println("Inside : ' "+name+" ' Directory");
		for(FileSystem fs : files) {
			fs.ls();
		}
	}
	
}
