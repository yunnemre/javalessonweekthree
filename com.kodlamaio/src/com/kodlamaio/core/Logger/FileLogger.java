package com.kodlamaio.core.Logger;

public class FileLogger implements ILogger {
	
	@Override
	public void log(String data) {
		System.out.println("Dosyaya Loglandı " + data);
		
	}
	
}
