package io.zipcoder.pets;

public class Cat extends Pet
{
    String noise;
    public Cat(String name)
    {
        super(name);
        noise = "meow";
    }

    public Cat(String name, String noise)
    {
        super(name);
        this.noise = noise;
    }

    public String speak()
    {
        return noise;
    }
}
