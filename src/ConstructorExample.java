public class ConstructorExample
{
    public static void main(String[] args)
    {
        Abc obj = new Abc(6,5.5);        //This Abc() called Constructor

    }
}
class Abc
{
    public Abc()        // Constructor Overloading
    {
        System.out.println("In Abc Constructor");
    }
    public Abc(int i)
    {
        System.out.println("In Abc Const Para");
    }
    public Abc(int i,double d)
    {
        System.out.println("In Abc Const intDouble");
    }
}
