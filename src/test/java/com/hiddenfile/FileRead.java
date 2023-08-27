package com.hiddenfile;

import java.io.IOException;

public class FileRead {
	
	
	
	private FileRead() {
		
	}
	
	
	public static FileRead FileReadManager() {

		FileRead fi = new FileRead();
		
		return fi;
	}
	
	
	public Con_Read ConfigRead() throws IOException {
		
		Con_Read cr = new Con_Read();
		
		return cr;
	}

}
