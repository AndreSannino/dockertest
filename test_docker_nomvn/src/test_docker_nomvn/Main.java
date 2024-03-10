package test_docker_nomvn;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("Eseguendo il test: " + System.getenv("idtest"));
		
		for(int i = 0;i < 5; i ++) {
			System.out.println("testando...");
			Thread.sleep(1000);
		}
		
		System.out.println("Test Completato!");
	}

}
