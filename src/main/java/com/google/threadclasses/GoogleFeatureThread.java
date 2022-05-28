package com.google.threadclasses;

import com.Pages.GooglePage;

public class GoogleFeatureThread extends Thread {

	// Achieving mulit-threading in Java
	// 1. extends Thread class
	// 2. implements Runnable Interface

	public String browserName;
	GooglePage googlePage;

	public GoogleFeatureThread(String threadName, String browserName) {
		super(threadName);
		this.browserName = browserName;
		googlePage = new GooglePage();
	}

	public void run() {
		System.out.println("thread -- started " + Thread.currentThread().getName());

		try {
			Thread.sleep(1000);
			googlePage.setUp(this.browserName);
			googlePage.googleSearchTest();
		}

		catch (Exception e) {
			e.printStackTrace();
		}

		finally {
			googlePage.tearDown();
		}
		
		System.out.println("thread  ended--" + Thread.currentThread().getName());

	}

}
