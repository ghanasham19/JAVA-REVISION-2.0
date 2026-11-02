import java.util.*;
class Demo{
	public static void main(String[]args){
		System.out.println("hello");
		ArrayList<Integer> ar= new ArrayList();
		System.out.println("Array list created::");
		ar.add(10);
		ar.add(20);
		ar.add(30);
		ar.add(40);
		System.out.println(ar);
		System.out.println(ar.size());
		ar.add(2,50);	
		System.out.println(ar);
		System.out.println(ar.indexOf(30));
		ar.set(2,60); // replace element in given index
		System.out.println(ar);
		ar.sort(null);
		
 	
		ar.forEach(a->{
			System.out.println(a);
		});

		

		// now we try to convert this arraylist into array if integer
		Integer arr [] = ar.toArray(new Integer[0]);

		
		
	}
}
