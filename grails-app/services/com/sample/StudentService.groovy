package com.sample

import grails.transaction.Transactional

@Transactional
class StudentService {


    def getAllStudentDetail() {
        List<Student> studentList = Student.list()
        return studentList
    }
}
