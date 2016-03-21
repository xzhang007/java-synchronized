class MyThread2 implements Runnable {
	private Service service;
	
	MyThread2(Service service) {
		this.service = service;
	}
	
	public void run() {
		service.fun2();
	}
}