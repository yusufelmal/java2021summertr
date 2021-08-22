package day34_encapsulation;

public class C03_setGetSourceGosterme {
	
	int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		
		if (age>0) {
			this.age = age;

			
		} else {
			this.age=-age;
	
		}
	}
	 

}
