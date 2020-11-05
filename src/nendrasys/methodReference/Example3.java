package nendrasys.methodReference;

@FunctionalInterface
interface Animal
{
    void cow();

}


public class Example3
{


    public static void cow()
    {
        System.out.println("maa maa");
    }

    public static void main(String args[])
    {
        Animal animal=Example3::cow;

        animal.cow();

    }
}
