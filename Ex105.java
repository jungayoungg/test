package test;

import java.util.Scanner;

class Ex104 {
	String[] product = { "����", "����", "�Ѷ��" };
	int[] price = { 100, 200, 300 };
	int name;
	int nank;
	int na;

}

public class Ex105 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Ex104 ex=new Ex104();
		System.out.println("�����Է�");
		String name = input.next();
		System.out.println("���ϼ���");
		int nank = input.nextInt();
		System.out.println("��������");
		int na = input.nextInt();
		
		System.out.println(name+" : "+ex.product[nank]+ex.price[nank]*na);
	}
}
