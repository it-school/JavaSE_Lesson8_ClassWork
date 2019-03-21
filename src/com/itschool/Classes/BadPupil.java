package com.itschool.Classes;

public class BadPupil extends Pupil
{
    @Override
    public String Study()
    {
        return super.Study() + "badly";
    }

    public BadPupil()
    {
        super();
    }

    public BadPupil(String name)
    {
        super(name);
    }
}
