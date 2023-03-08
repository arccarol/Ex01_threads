package view;

import controller.Ex01_threads;

public class Principal {
	
	public static void main(String arg[]) {
		
		for(int id = 0; id < 5; id ++) {
			Thread idThread = new Ex01_threads(id);
			idThread.start();
		}
		
		
	}

}
