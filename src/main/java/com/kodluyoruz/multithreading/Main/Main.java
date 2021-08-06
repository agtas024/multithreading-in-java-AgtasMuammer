package com.kodluyoruz.multithreading.Main;


public class Main {
	public static void main(String[] args) {
		new Thread(new MultiThreading()).start();
	}
}

class MultiThreading implements Runnable {
	int number = 10, wait = 1500;

	public void run() {
		try {
			for (int i = 1; i <= number; i++) {
				System.out.println(i + ". step");
				Thread.sleep(wait);
			}

		} catch (Exception ex) {
			System.out.println(ex);
		}
	}
}
