package test.mariya.flexton.patientlogger;

import java.io.IOException;
import java.io.RandomAccessFile;

public class Logger {
	RandomAccessFile rafile;
	
	public Logger(){
		try{
			rafile = new RandomAccessFile( "default.txt", "rw" );
		}
		catch(Exception e){
			System.out.println(e);
		}
		
	}
	public Logger(String fileName){
		if(fileName != ""){
			try{
				rafile = new RandomAccessFile(fileName, "rw");
			}
			catch(Exception e){
				System.out.println(e);
			}
		}
	}
	
	public void writeLine(String line){
		try{
			rafile.seek( rafile.length() );
			rafile.writeBytes( line );
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	public void closeFile() throws IOException{
		rafile.close();
	}

}
