public class Dog implements Comparable<Dog>
{
    private String name;
    private String breed;
    private int age;// in years
    private double weight;  //in lbs
    private static int count = 0; //number of dogs

    public Dog() {
        name = null;
        breed = null;
        age = 0;
        weight = 0.0;
        count++;
    }//ends the default constructor

    //The this notation is added with the constructor
    public Dog(String name, String breed, int age, double weight) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.weight = weight;
        count++;
    }//ends the this notation

    //These are the getters
    public static int getCount()
    {
        return count;
    }//ends method for getCount
    public String getName() {
        return name;
    }//ends getter for name
    public String getBreed() {
        return breed;
    }//ends getter for breed
    public int getAge() {
        return age;
    }//ends the getter for age
    public double getWeight() {
        return weight;
    }//ends getter for weight

    //These are the setters
    public void setName(String newName) {
        name = newName;
    }//ends setter for name
    public void setBreed(String newBreed)
    {
        breed = newBreed;
    }//ends setter for breed
    public void setAge(int newAge)
    {
        age = newAge;
    }//ends setter for age
    public void setWeight(double newWeight)
    {
        weight = newWeight;
    }//ends setter for weight


    //This is for the comparable
    public int compareTo(Dog someDog)
    {
        if (this.age < someDog.age)
        {
            return -1;
        }//ends if
        else if (this.age == someDog.age)
        {
            return 0;
        }
        else
        {
            return 1;
        }
    }//This is the end of comparable





    //This is the toString
    public String toString()
    {
        String output = "";
        output += "Name: " + name;
        output += "\nBreed: " + breed;
        output += "\nAge: " + age;
        output += "\nWeight: " + weight;
        return output;
    }//ends the toString

    //This is the brain method
    public String toKg()
    {
        double lbs = weight/2.204;
        return lbs + " ";
    }


}//end class


