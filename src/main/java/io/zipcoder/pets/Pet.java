package io.zipcoder.pets;

abstract public class Pet
{
    private String name;

    public Pet(String name)
    {
        this.name = name;
    }

    abstract public String speak();

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return this.name;
    }
}