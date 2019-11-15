public class DogDriver
{ public static void main (String[] arg)
{
    Dog someDog = new Dog();
    Dog Fang = new Dog("Fang", "Husky", 5, 80.0);
    Dog Nutmeg = new Dog("Nutmeg", "Australian Sheepdog", 12, 45.0);
    Dog ChumChum = new Dog("ChumChum", "Pug", 9 , 16.2);

    System.out.println(Fang.getBreed() + " - This is Fang's breed.");
    System.out.println (Fang.getAge() + " - This is Fang's age.");
    System.out.println ("\n" + Nutmeg.getWeight() + " - This is Nutmeg's weight.");
    System.out.println ("\n" + ChumChum);
    System.out.println ();

    System.out.println ("\nThere are " + Dog.getCount() + " dogs.\n");
    if (Nutmeg.getAge() == Fang.getAge())
    {
        System.out.println ("\nNutmeg and Fang are the same age\n");
    }//ends if
    else if (Nutmeg.getAge() <= Fang.getAge())
    {
        System.out.println ("Fang is older.");
    }//end else if
    else
    {
        System.out.println ("Nutmeg is older.");
    }//ends else


    if (Fang.getAge() == ChumChum.getAge())
    {
        System.out.println ("They are the same age.");
    }//ends if
    else if (Fang.getAge() <= ChumChum.getAge())
    {
        System.out.println ("ChumChum is older.");
    }//end else if
    else
    {
        System.out.println ("Fang is older.");
    }
}//end main method
}//end class
//Isabela Francisco
