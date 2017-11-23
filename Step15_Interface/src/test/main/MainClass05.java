package test.main;

import java.rmi.server.SocketSecurityException;

import test.mypac.Remocon;
import test.mypac.YourRemocon;

public class MainClass05 {
	public static void main(String[] args) {
		//�͸��� local inner class �� ���� �ۼ��ϴ� ��� (Remocon r1 = new Remocon���� �ۼ��� ���� ctrl+space ���� �� ����)
		Remocon r1 = new Remocon() {
			
			@Override
			public void up() {
				System.out.println("�÷���!");				
			}
			
			@Override
			public void down() {
				System.out.println("������!");
				
			}
		};
		
		useRemocon(new Remocon() {// useRemocon ��ȣ �ȿ� new Remocon���� �ۼ��� ���� ctrl+space �� ���� �� ����)
			
			@Override
			public void up() {
				System.out.println("���𰡸� �÷���");				
			}
			
			@Override
			public void down() {
				System.out.println("���𰡸� ������");				
			}
		});
	}
	
	public static void useRemocon(Remocon r) {
		r.up();
		r.down();
	}
}
