package Day2.Basic;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;


public class FileReaderDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		URL res= FileReaderDemo.class.getResource("sample.txt");
		if(res==null) {
			System.out.println("File Not found");
			return;
		}
		
		File file=new File(res.getFile());
		FileReader filereader = new FileReader(file);
		BufferedReader reader =new BufferedReader(filereader);
		String line;
		while((line=reader.readLine())!=null) {
			System.out.println(line);
			
		}
		
		
		
		
		
		

	}

}
