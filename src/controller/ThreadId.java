package controller;

public class ThreadId extends Thread{
	
private int idThread; 
	
	public ThreadId(int idThread) {
		
		this.idThread = idThread;
	}

	@Override
	public void run() {
		//só se executa o que está aqui dentro
		System.out.println("TID #" + getId() + "  " + idThread);
	}
}
