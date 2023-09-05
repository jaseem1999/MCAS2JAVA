package ExternalExam.SimplePrograms;

class Parent
{
 public static int i = 2;
 void show()
  {
    System.out.println("Parent");
  }
}

class Child extends Parent
{
 void disp()
  {
    System.out.println("Child");
    System.out.println(i);
    show();
  }
}

class Anony
{
 public Anony()
  {
   
    System.out.println(Parent.i);
    //Parent.show();
  }
}

class Main
{
 public static void main(String args[])
  {
    Child a1 = new Child();
    a1.disp();
    Anony b1 = new Anony();
    
  }
}
