class Service {
	// synchronized void fun1() {
	void fun1() {
		synchronized(this) {
			try {
				Thread.sleep(3 * 1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("fun1");
	    }
	}
	void fun2() {
		synchronized(this) {
			System.out.println("fun2");
		}
	}
}