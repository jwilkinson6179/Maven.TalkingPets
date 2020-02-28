package io.zipcoder.pets;

public class Gorilla extends Pet
{
    String noise;
    public Gorilla(String name)
    {
        super(name);
        noise = "waaaaaah";
    }

    public Gorilla(String name, String noise)
    {
        super(name);
        this.noise = noise;
    }

    public String speak()
    {
        return noise;
    }
}
