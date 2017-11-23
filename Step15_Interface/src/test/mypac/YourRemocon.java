package test.mypac;

public class YourRemocon implements Remocon{

	@Override
	public void up() {
		System.out.println("속도를 올려요");		
	}

	@Override
	public void down() {
		System.out.println("속도를 내려요");
	}

}
