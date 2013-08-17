package fileIO.reader;

import java.io.File;
import java.io.IOException;

//* */
public class Reader {
	
	private File file;
	
	public Reader() {
		// TODO Auto-generated constructor stub
		
		
		file = new File("./Tyh_books/src/res/Mankdrake.txt");
		
		System.out.println(file.isFile());
		
		System.out.println(file.getName());
		
		
		try {
			System.out.println(file.getCanonicalPath());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println(file.getPath());
		
		System.out.println(file.isAbsolute());
		
	}
	
	public void setFile(String uri){
		
	}
}