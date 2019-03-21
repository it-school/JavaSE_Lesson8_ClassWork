package com.itschool.Classes;

public class Pupil
{
    private String name;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String Study(){
        return "Studies ";
    }

    public Pupil(String name)
    {
        this.name = name;
    }

    public Pupil()
    {
    }

    @Override
    public String toString()
    {
        return "Pupil{" +
                "name='" + name + '\'' +
                " ("+this.Study()+")} - " + this.getClass() + "\n";
    }
}
