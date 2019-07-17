package com.sample

import grails.converters.JSON

class StudentController {

    def studentService

    def index() {
        //index page to check mapping is fine
        render "Success"
    }

    def listWithCtl() {
        List<Student> studentList = studentService.allStudentDetail
        render (view: "list", model: [studentList: studentList])
    }

    def list(){
        //get details of all student in views
        List<Student> studentList = studentService.allStudentDetail
        render(view: "listWithOutCtl", model: [studentList: studentList])
    }

    def jsonList() {
        //get details of all student as JSON
        render studentService.allStudentDetail as JSON
    }

    def get(){
        //get student by id
    }

    def add(){
        //add student
    }

    def delete(){
        //delete student
    }
}
