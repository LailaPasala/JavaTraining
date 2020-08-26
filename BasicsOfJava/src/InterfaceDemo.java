interface Results
{
   final static float pi = 3.14f;
   float areaOf(float l, float b);
}
class Rectangle implements Results
{
   public float areaOf(float l, float b)
   {
       return (l * b);
   }
}
class Square implements Results  
{
   public float areaOf(float l, float b)
   {
      return (l * l);
   }
}
class Circle implements Results
{
   public float areaOf(float r, float b)
   {
      return (pi * r * r);
   }
}
public class InterfaceDemo
{
   public static void main(String args[])
   {
      Rectangle rect = new Rectangle();
      Square square = new Square();
      Circle circle = new Circle();
      System.out.println("Area of Rectangle: "+rect.areaOf(2.0f, 2.0f));
      System.out.println("Are of square: "+square.areaOf(5.0f, 4.0f));
      System.out.println("Area of Circle: "+circle.areaOf(5.0f, 0));
   }
}