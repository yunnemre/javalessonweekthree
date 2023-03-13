package com.kodlamaio.core.Logger;

public class DatabaseLogger implements ILogger {

	@Override
	public void log(String data) {
		System.out.println("Veri tabanına Loglandı " + data);
		
	}
}
