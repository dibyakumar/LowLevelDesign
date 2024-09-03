package StructuralDesignPattern.CompositeDesignPattern;

import StructuralDesignPattern.CompositeDesignPattern.FileManagement.Directory;
import StructuralDesignPattern.CompositeDesignPattern.FileManagement.File;

public class Main {
	/**
	 *File System 
	 *
	 *ls -> list files 
	 */
	public static void main(String[] args) {
		
		// crate directory 
		
		Directory fs = new Directory("New Folder");
		
		fs.add(new File("video1.mp4"));
		fs.add(new File("video2.mp4"));
		fs.add(new File("video3.mp4"));
		
		Directory movie = new Directory("Movies");
		movie.add(new File("Avengers EndGame.mp4"));
		movie.add(new File("Hulk.mp4"));
		fs.add(movie);
		
		Directory notes = new Directory("Notes");
		notes.add(new File("Text1.txt"));
		notes.add(new File("Text2.txt"));
		fs.add(notes);
		
		// print the file list 
		fs.ls();
		
	}
}
