package test.mypac;
/*
 * 	�������̽��� ���� �� ���� implements ���� ����Ѵ�.
 * 	���� ���� �������̽��� ���� �� ���� �ִ�. (���� ���� ����)
 * 	�������̽��� ���ǵ� ��� �߻�޼ҵ带 �������̵� �ؾ� �Ѵ�.
 */
public class MyRemocon implements Remocon{

	@Override
	public void up() {
		System.out.println("�µ��� �÷���");	
	}

	@Override
	public void down() {
		System.out.println("�µ��� ������");
	} 

}
