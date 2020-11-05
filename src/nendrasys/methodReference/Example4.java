package nendrasys.methodReference;

@FunctionalInterface
interface  Animal1
{
    void dog();

    public static void cow()
    {
        System.out.println("maa maa");
    }


    public static void bird()
    {
        System.out.println("chi chi chi");
    }

}


public class Example4
{
    public static void dog()
    {
        System.out.println("bhaw bhaw");
    }


    public static void main(String args[])
    {
        Animal1 animal1=Example4::dog;
        animal1.dog();

        Animal1.bird();
        Animal1.cow();


        

    }
}
