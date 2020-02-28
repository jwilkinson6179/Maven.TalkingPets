package io.zipcoder.pets;

public class Dog extends Pet
{
    String noise;
    public Dog(String name)
    {
        super(name);
        noise = "woof woof";
    }

    public Dog(String name, String noise)
    {
        super(name);
        this.noise = noise;
    }

    public String speak()
    {
        return noise;
    }
}
