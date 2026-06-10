package banking;

public class Employee implements Company{
  int salary = 10000;
  public void show() {
	  System.out.println("Employee Salary"+salary);
	  System.out.println("Company Name"+cn);
  }
  
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.show();

	}

}
