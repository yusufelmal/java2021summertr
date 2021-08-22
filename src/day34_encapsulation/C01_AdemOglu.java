package day34_encapsulation;

public class C01_AdemOglu {
	
	String name;
	String surName;
	private int age;
	

	public static void main(String[] args) {
		
	}//aşağıda aslında setAge yaptık
public void yasAta(int age) {
	if (age<0) {
		this.age=-age;
		
	} else {
		this.age=age;
	}
}
//ve asagida da getAge yaptık. c03te de gösterilen sadece bunun
//menüden otomatik yapılışı

public int yasGoster () {
	return this.age;
}

}
