
class Demo{
	String a;
	Demo(String a){
		this.a=a;
	}
	public String toString(){
			return a;
		}
	public static void main(String[]args){
		Demo d = new Demo("mamau");
		System.out.println(d);
	}
}