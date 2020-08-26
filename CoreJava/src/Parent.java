class Grand
{
   public void m1()
   {
     System.out.println("Class Grand method");
    }
}
class Parent extends Grand
{
    public void m2()
    {
        System.out.println("Class Parent method");
     }
}
class Child extends Parent
{
    public void m3()
    {
      System.out.println("Class Child method");
    }
    public static void main(String args[])
    {
      Child obj = new Child();
      obj.m1();
      obj.m2();
      obj.m3();
    }
}

