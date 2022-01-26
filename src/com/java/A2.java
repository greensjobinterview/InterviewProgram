package com.java;

public class A2 implements IOne,IOne2 {
	
	

	static int abc(int n) {
		int[] f = new int[n + 2];
		f[0] = 0;
		f[1] = 1;

		for (int i = 2; i <= n; i++) {
			f[i] = f[i - 1] + f[i - 2];
			System.out.println(i + ":" + f[i]);
		}

		return f[n];

	}

	public static int add() {
		
		return 90;
		/*try {
			throw new ArithmeticException();
		} catch (Exception e) {
			return 15;
		}
		finally {
			return 19;
		}*/
	}

	public static void main(String[] args) {
		int n = 9;
		System.out.println(abc(n));
		System.out.println(add());

	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}

}
