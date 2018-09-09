public class overload

{

    void print()

    {

        System.out.println("Null Arguments func() called");

    }

    void print(int b)

    {

        System.out.println("INT Arguments func() called : Value of X : " + b);

    }

    void print(double b)

    {

        System.out.println("Double Arguments func() called : Value of X : " + b);

    }

    public static void main(String args[])

    {

        overload obj = new overload();

        obj.print();

        obj.print(10);

        obj.print(20.11);

    }

}