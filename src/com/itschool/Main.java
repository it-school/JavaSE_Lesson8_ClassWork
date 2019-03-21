package com.itschool;

import com.itschool.Classes.ClassRoom;
import com.itschool.Classes.ExcellentPupil;
import com.itschool.Classes.Pupil;

public class Main {

    public static void main(String[] args) {
        ClassRoom classRoom = new ClassRoom("Dave", "Pit", "John", "Fedor");
        System.out.println(classRoom);
        Pupil pupil = classRoom.getPupil1();
        System.out.println(pupil);
    }
}
