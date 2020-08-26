class Employee
{
     String companyName = "HCL.com";
     public Employee(int empId, String name)
     {
          System.out.println("Employee Id : "+empId+"\nEmployee Name : "+name);
     }
     public void EmpMethod()
     {
          System.out.println("Company Name : "+companyName);
     }
     public static void main(String args[])
     {
          Employee emp = new Employee(9,"Laila");
          emp.EmpMethod();
     }
}