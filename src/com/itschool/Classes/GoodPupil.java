package com.itschool.Classes;

public class GoodPupil extends Pupil
{
    @Override
    public String Study()
    {
        return super.Study() + "good";
    }

    public GoodPupil()
    {
        super();
    }

    public GoodPupil(String name)
    {
        super(name);
    }
}
