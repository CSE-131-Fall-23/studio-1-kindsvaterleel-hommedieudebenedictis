package studio1;

import java.util.Scanner;

public class Ordered {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Value for x?");
		int x = in.nextInt();
		System.out.println("Value for y?");
		int y = in.nextInt();
		System.out.println("Value for z?");
		int z = in.nextInt();
		boolean isOrdered=true;
		boolean isOrdered1=true;
		isOrdered1=(x<y&&x<z)&&(y<z);
		boolean isOrdered2=true;
		isOrdered2=(x>y&&x>z)&&(y>z);
		isOrdered=isOrdered1||isOrdered2;
		System.out.println(isOrdered);
	}

}
