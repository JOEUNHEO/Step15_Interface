package test.mypac;
/*
 * 	[ interface ]
 * 	
 * 	- �����ڰ� ���� (�ܵ� ��ü �����Ұ�)
 * 	- ������ ��� �޼ҵ�� ���� �� ����. (�߻� �޼ҵ常 ���� �� �ִ�.)
 * 	- ����ʵ�� static final ����ʵ常 ���� �� �ִ�.
 * 	- data type �� ������ �� �� �ִ�.
 * 	- �������̽� type �� �������� �ʿ��ϸ� ����(implements) Ŭ����
 *    �� ���� ��ü�� �����ؾ� �Ѵ�.
 */
public interface Remocon {
	//����ʵ�
	public static final int VERSION = 1;
	public String COMPANY = "LG"; // static final ���� ����
	
	//�޼ҵ� �����ϱ�
	public abstract void up(); 
	public void down(); // abstract ���� ����
}
