package com.hiddenfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Con_Read {

	public static Properties pro;

	public Con_Read() throws IOException {
		File f = new File(
				"C:\\Users\\prabu\\eclipse-workspace\\Project_7AM\\src\\test\\java\\com\\hiddenfile\\creden.properties");

		FileInputStream fis = new FileInputStream(f);

		pro = new Properties();

		pro.load(fis);

	}

	public String getUrl() {

		String url = pro.getProperty("url");

		return url;
	}

	public String getUsername() {

		String uname = pro.getProperty("username");

		return uname;
	}

	public String getPassword() {

		String pword = pro.getProperty("password");

		return pword;
	}

}
