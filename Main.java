import java.util.Scanner;
//Complete this program that the user will be able to choose the quadilateral it wants to calculate its perimeter and area

class Main {
  public static void main(String[] args) {
    //Declare a char to store the chosen quadilateral
    
    char chosen;
    
    //using a switch check what the user selected and use it to calculate the perimeter and area of the desired quadilateral
    System.out.println("Choose p for parallelogram, t for trapezoid, r for rhombus, s for square and R for rectangle");
    Scanner scan = new Scanner(System.in);
    chosen = scan.next().charAt(0);

    switch(chosen){
      case 'p':
       //this should be in the parallelogram case
    System.out.println("This program calculates the area and perimeter of the parallelogram.");
    System.out.println("Input the base of your Parallelogram");
    float pBase = scan.nextFloat();
    System.out.println("Input the height of your Parallelogram");
    float pHeight = scan.nextFloat();
    Parallelogram p = new Parallelogram(pBase, pHeight);
    
    Quadilateral q = p;

  
    System.out.println("Input the dimension of the first pair of your Parallelogram");
    q.setLength(scan.nextFloat());
    System.out.println("Input the second pair of your Parallelogram");
    q.setBreadth(scan.nextFloat());
    
    System.out.printf("The area of the parallelogram with base %.2f and height %.2f is %.2f", pBase, pHeight, p.Area());

    System.out.println("");
    System.out.printf("The perimeter of the parallelogram with First Pair: %.2f and SecondPair: %.2f is %.2f", q.getLength(), q.getBreadth(), q.calculatePerimeter());
    System.out.println("");
    System.out.println("");
    System.out.println("");
    break;

     case 't':

     //this should be in the Trapezoid case
     System.out.println("Calculation for a Trapezoid");
     System.out.println("Input first side");
     float a = scan.nextFloat();
     System.out.println("Input second side");
     float b = scan.nextFloat();
     System.out.println("Input third side");
     float c = scan.nextFloat();
     System.out.println("Input fourth side");
     float d = scan.nextFloat();
     Trapezoid t = new Trapezoid(a, b, c, d);
    System.out.printf("The perimeter of the Trapezoid with First Side: %.2f, Second Side: %.2f, Third Side: %.2f, and Fourth Side: %.2f is %.2f", a, b, c, d, t.calculatePerimeter()); 
    break;

    case 'r':
     System.out.println("This program calculates the Area and perimeter of a Rhombus");
      System.out.println("Since a rhombus has all equal sides, Input any side");
      a = scan.nextFloat();
       System.out.println("Input height of Rhombus");
      float h = scan.nextFloat();
      Rhombus r = new Rhombus (a, h);
       System.out.println("");
        System.out.printf("Perimeter of the Rhombus with sides %.2f is %.2f and the area is %.2f", a, r.calculatePerimeter(), r.area());
    break;

    case 's': 
    System.out.println("This program calculates the Area and perimeter of a square");
    System.out.println("Input the side of the square");
    float s = scan.nextFloat();
    Square sq = new Square (s);
    System.out.printf("Perimeter of the square with sides %.2f is %.2f and the area is %.2f", s, sq.calculatePerimeter(), sq.area());
    break;

    case 'R':
    System.out.println("This program calculates the Area and perimeter of a rectangle");
    System.out.println("Input the length");
    float le = scan.nextFloat();
    System.out.println("Input the breadth");
    float br = scan.nextFloat();
    Rectangle rc = new Rectangle(le, br);
    System.out.printf("Input the length");
    System.out.printf("Perimeter of the rectangle with sides %.2f and %.2f is %.2f and the area is %.2f", le, br, rc.calculatePerimeter(), rc.area());
    break;

    }
    
  
   
    
  }
}

//Create class for Rhombus
class Rhombus extends Quadilateral{
private float side1;
private float side2;
private float side3;
private float side4;
private float height;
public Rhombus (float a, float h){
   side1 = a;
    height = h;
}

public float calculatePerimeter(){
  return (4*side1);

}
public float area(){
  return (side1 * height);
}

}

//Create class for square
class Square extends Quadilateral{
  private float side;

  public Square(float s){
    if (s <= 0) {
      System.out.println("A side cant be 0 or less it has been set to default of 1");
      s=1;
    }
    else{
      side = s;
    }
  }
  public float calculatePerimeter(){
    return (4*side);
  }
  public float area(){
    return (side*side);
  }
}


//create class for Rectangle
class Rectangle extends Quadilateral{
  private float length;
  private float breadth;

public Rectangle (float le, float br){
  length = le;
  breadth = br;
}
public float calculatePerimeter(){
  return (2*(length + breadth));
}
public float area(){
  return length*breadth;
}
}
class Trapezoid extends Quadilateral{
  private float side1;
  private float side2;
  private float side3;
  private float side4;
  public Trapezoid (float a, float b, float c, float d){
    side1 = a;
    side2 = b;
    side3 = c;
    side4 = d;
  }

  public float calculatePerimeter(){
    return side1+side2+side3+side4;
  }
}
class Parallelogram extends Quadilateral{
  private float base;
  private float height;
  public Parallelogram (float b, float h){
    if (b <= 0){
      System.out.println("You cannot have a negative or zero base. Therfore base returns to default which is 1");
      base = 1;
    }
    else
      base = b;
    if (h <= 0){
      System.out.println("You cannot have a negative or zero height. Therfore height returns to default which is 1");
      height = 1;
    }
    else
      height = h;
  }
  public float Area(){
    return base*height;
  }

}
class Quadilateral {
  private float length;
  private float breadth;

  public void setLength(float l){
    length = l;
  }

  public float getLength(){
    return length;
  }

  public void setBreadth(float b){
    breadth = b;
  }

  public float getBreadth(){
    return breadth;
  }

  public float calculatePerimeter(){
    return 2*(length+breadth);
  }
}
