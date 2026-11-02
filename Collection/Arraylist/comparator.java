import java.util.*;
class Student{
	int id;
	String name;
	Student(int id,String name){
		this.id=id;
		this.name=name;
	}
	public String toString(){
		return "id:"+id+" name:"+name;
	}
	
}
class StudentSortByName implements Comparator<Student>{


	public int compare(Student s1,Student s2){

		return Integer.compare(s1.id,s2.id);
	
	} 
		
}
class Demo{	
	public static void main(String[]args){
		System.out.println("main is created");
		ArrayList<Student> al = new ArrayList();
		
		Student s1= new Student(3,"z");
		Student s2= new Student(2,"d");
		Student s3= new Student(1,"c");
		al.add(s1);
		al.add(s2);
		al.add(s3);
		System.out.println("Student object is added to arraylist");
		System.out.println(al);
		StudentSortByName ssbn = new StudentSortByName();
		//al.sort(ssbn);
		Collections.sort(al,ssbn);
		System.out.println("our arraylist iss sorted succesfully");
		System.out.println(al);
	}
}