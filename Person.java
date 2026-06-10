package banking;

public class Person implements School , Colege {
	 public void set (String u , String s) {
		 System.out.println("Person name ="+u);
		 System.out.println("Year Of College ="+s);
		 System.out.println("Student City ="+city);
		 System.out.println("Student Unversity ="+un);
	 }

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.set("Aarushi","2026");

	}

}
