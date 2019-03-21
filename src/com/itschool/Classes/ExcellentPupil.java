package com.itschool.Classes;

public class ExcellentPupil extends Pupil
    {
        @Override
        public String Study()
        {
            return super.Study() + "excellent";
        }

        public ExcellentPupil()
        {
            super();
        }

        public ExcellentPupil(String name)
        {
            super(name);
        }
    }

