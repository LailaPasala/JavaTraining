class ABC{
  
   public void disp()
   {
	System.out.println("disp() method of parent class");
   }	   
}
class Demo extends ABC{
   
   public void disp(){
	System.out.println("disp() method of Child class");
   }
   
   public static void main( String args[]) {
	
	ABC obj = new ABC();
	obj.disp();

	ABC obj2 = new Demo();
	obj2.disp();
   }
}