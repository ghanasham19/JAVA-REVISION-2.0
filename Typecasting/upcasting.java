//upcastring- child object sotre in parent reference
class parent{
	void fun(){
		System.out.println("Heloo in pfun");
	}
	void par(){
		System.out.println("Heloo in  par");
	}
}class child extends parent{
	 void fun(){
		System.out.println("Heloo in cfun");
	}
	void chi(){
		System.out.println("Heloo in chi");
	}
}
class up{
	public static void main(String[]args){
		System.out.println("Heloo in main");
		parent p = new child();	
		p.fun();//work
		p.par();//work
		//p.chi();//gives error

		// here probelm is that even if have created object of child class we are still restrected  to use omethds from parent calss and only one that is overrided by child by child and here this is the probelm.
	}
}