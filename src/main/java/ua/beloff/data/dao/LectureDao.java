package ua.beloff.data.dao;

import ua.beloff.data.Lecture;

public interface LectureDao {
    Lecture addLecture(Lecture lecture);
    Lecture getLecture(int id);
    void saveLecture(Lecture lecture);
}
