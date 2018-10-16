package com.java.inheritance;

import javax.swing.JButton;

public class app {
	public static void main(String[] args) {
		inheritance_Test x = new inheritance_Test();
		JButton y = new inheritance_Test(3);
		inheritance_Test z = new inheritance_Test(3);
		
		
		inheritance_Test w = (inheritance_Test)y;
//		왜 0이 출력 되는지 알아볼 것!!!!
		System.out.println(x.number_t_howl);
//		오류
//		System.out.println(y.number_t_howl);
		System.out.println(z.number_t_howl);
		System.out.println(w.number_t_howl);
	}
}
