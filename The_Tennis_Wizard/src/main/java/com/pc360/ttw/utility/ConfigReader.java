package com.pc360.ttw.utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

	Properties prop;
	String path = (System.getProperty("user.dir") + "\\src\\test\\resources\\TestData.properties");

	public ConfigReader() throws IOException {
		prop = new Properties();
		FileInputStream fis = new FileInputStream(path);
		prop.load(fis);
	}

	public String getBrowser() {
		String browser = prop.getProperty("Browser");
		if (browser != null)
			return browser;
		else
			throw new RuntimeException("Browser Not Found");
	}

	public String getUrl() {
		String url = prop.getProperty("WebURL");
		if (url != null)
			return url;
		else
			throw new RuntimeException("url Not Found");
	}

	public String getFirstName() {
		String firstName = prop.getProperty("First_Name");
		if (firstName != null)
			return firstName;
		else
			throw new RuntimeException("firstName Not Found");
	}

	public String getLastName() {
		String lastName = prop.getProperty("Last_Name");
		if (lastName != null)
			return lastName;
		else
			throw new RuntimeException("lastName Not Found");
	}

	public String getEmail() {
		String email = prop.getProperty("Email");
		if (email != null)
			return email;
		else
			throw new RuntimeException("email Not Found");
	}
	
	public String getComment() {
		String comment = prop.getProperty("Comment");
		if (comment != null)
			return comment;
		else
			throw new RuntimeException("comment Not Found");
	}
	
	public String getSubject() {
		String subject = prop.getProperty("Subject");
		if (subject != null)
			return subject;
		else
			throw new RuntimeException("subject Not Found");
	}
	
	public String getMobileNo() {
		String mobileNo = prop.getProperty("Mobile_Number");
		if (mobileNo != null)
			return mobileNo;
		else
			throw new RuntimeException("Mobile_Number Not Found");
	}
}
