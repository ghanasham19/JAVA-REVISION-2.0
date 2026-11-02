//downcasting - in this parent object sotred in child reference by typecasting use
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
		
		//***
		// for solving this problem we use down casting
	
		child c =(child)p; //*** this is downcasting storing paernt reference in child ref and it work becouse parent refernce already has child boject in it like parent pp = new child(); her if new child() are not present then this down casting will never be work;
		
		c.chi(); // like that we can acces all methoda from parent and as well as child
		c.par();
		
		
	}
}