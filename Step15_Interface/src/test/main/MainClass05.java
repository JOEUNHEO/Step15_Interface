package test.main;

import java.rmi.server.SocketSecurityException;

import test.mypac.Remocon;
import test.mypac.YourRemocon;

public class MainClass05 {
	public static void main(String[] args) {
		//익명의 local inner class 를 쉽게 작성하는 방법 (Remocon r1 = new Remocon까지 작성한 다음 ctrl+space 누른 후 선택)
		Remocon r1 = new Remocon() {
			
			@Override
			public void up() {
				System.out.println("올려요!");				
			}
			
			@Override
			public void down() {
				System.out.println("내려요!");
				
			}
		};
		
		useRemocon(new Remocon() {// useRemocon 괄호 안에 new Remocon까지 작성한 다음 ctrl+space 를 누른 후 선택)
			
			@Override
			public void up() {
				System.out.println("무언가를 올려요");				
			}
			
			@Override
			public void down() {
				System.out.println("무언가를 내려요");				
			}
		});
	}
	
	public static void useRemocon(Remocon r) {
		r.up();
		r.down();
	}
}
