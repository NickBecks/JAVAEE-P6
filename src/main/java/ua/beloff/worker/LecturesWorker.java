package ua.beloff.worker;

import org.springframework.beans.factory.annotation.Autowired;

import ua.beloff.data.Lecture;
import ua.beloff.data.dao.LectureDao;


public class LecturesWorker {
    @Autowired
    LectureDao lecturesDao;

    public Lecture addLecture(Lecture lecture){
        lecture = lecturesDao.addLecture(lecture);
        return lecture;
    }

    public Lecture getLecture(int id){
        return lecturesDao.getLecture(id);
    }

}
