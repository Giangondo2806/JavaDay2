class Dog {
	int age;
	String name;
	public Dog() {
		
	}
	
	public Dog(int age) {
		this.age = age;
	}
	
	

	
	// overload
	void initDog(int age, String name) {
		this.age = age;
		this.name = name;
		
	}
	
	
	void initDog(int age) {
		this.age = age;
		
	}
	
	
	
	void initDog(String name) {
		this.name = name;
	}
}