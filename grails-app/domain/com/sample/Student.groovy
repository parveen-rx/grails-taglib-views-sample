package com.sample

class Student {

    Long id
    Integer age
    String city
    String country
    Boolean deleted = false
    String gender
    String name

    static constraints = {
        id nullable: false, generator: 'uuid'
        age nullable: true
        city nullable: true, maxSize: 255
        country nullable: true, maxSize: 255
        gender nullable: true, maxSize: 255
        name nullable: false, maxSize: 255
    }

    static mapping = {
        table "STUDENT"
        version false   //disable version field in DB
        //cache: "read-only"    // enable read-only operation to DB for the mapped table
        //name column: "STUDENT_NAME"   //enable this in case domain prop name is different DB column name
       // datasource 'db2'  //enable this if connected to other DB
    }

    /*default constructor of domain*/
    Student(String age, String city, String country, String gender, String name) {
        this.name = name
        this.city = city
        this.country = country
        this.gender = gender
        this.name = name
    }



    static hibernateFilters = {
        activeFilter(condition:'deleted=0',default:true)
    }

    @Override
    String toString() {
        return  name + " - " + gender +" - "  + age + " - " + city + " - " + country
    }
}
