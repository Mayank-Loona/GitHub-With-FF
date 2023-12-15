package Presentation;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Read_Or_Write_Data {

	public static void main(String[] args) {
//		String path="c:/Writingdat";
//		File f=new File(path);
//		f.mkdir();
		
		//Writing data
		FileWriter fw=null;
		
		try {
			fw=new FileWriter("c:/Writingdat/data.txt");
			fw.write("Java is programing");
			fw.flush();
			System.out.println("dATA HAS");
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				fw.close();
				
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		
		//Read a data
		FileReader fr=null;
		
		try {
			fr=new FileReader("c:/Writingdat/data.txt");
			int ch=fr.read();
			System.out.println("Readed Successfully");
			while(ch!=-1)
			{
				System.out.println(ch);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
