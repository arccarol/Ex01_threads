package controller;

public class Ex01_threads extends Thread{
	
	private int id;
	
	public Ex01_threads(int id) {
		this.id = id;
		
	}

	@Override
	public void run() {
		System.out.println(id);
	}

	
}
