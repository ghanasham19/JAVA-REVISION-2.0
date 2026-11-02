import java.util.*;

class Student implements Comparable<Student> {
	int id;
	String name;
	Student(int id,String name){
		this.id=id;
		this.name=name;
	}

	public String toString(){
		return String.format("ID is:%d and Name is:%s ",id,name);
	}

	public int compareTo(Student s){
		return this.name.compareTo(s.name);
	}

}
class Demo{
	public static void main(String[]args){
		System.out.println("hello");
		ArrayList al = new ArrayList();
		
		Student s1=new Student(2,"sham");
		Student s2=new Student(3,"ram");
		Student s3=new Student(1,"kam");
	
	
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		System.out.println(al);
		al.sort(null);
		System.out.println(al);
	

	}
}