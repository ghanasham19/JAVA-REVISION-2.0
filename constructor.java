class Animal{
	int a=10;
	int ans;
	Animal(){
		this(20);
		System.out.println("in parent constructor: ");
		
	}
	Animal(int a){
		this(a+10,10);
	}
	Animal(int b,int c){
		this(b+c,1,0);
	}
	Animal(int d,int e,int f){
		this.ans=d;
		System.out.println(ans);
	}
	
		
}

  
class constructor {
	public static void main(String[]args){
		Animal A = new Animal();

	}
}                                 










 


       