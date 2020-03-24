package com.sample

class User {

    Long id
    String firstName
    String lastName
    String address
    String country
    Integer age


    static constraints = {
        id nullable: false, generator: 'uuid'
        firstName nullable: true, maxSize: 255
        lastName nullable: true, maxSize: 255
        address nullable: true, maxSize: 255
        country nullable: true, maxSize: 255
        age nullable: true, validator: {val, obj ->
            if(!val && !obj.firstName){
                return "First Name and Age missing, Can't save the data."
            }
        }
    }

    static mapping = {
        table "USER_INFO"
        version false   //disable version field in DB
    }

    def useWithCriteria(String countryName) {
        withCriteria {
            eq("country", countryName)
            not {
                eq("country", "INDIA")
            }
        }
    }

    def useCreateCriteria(String firstName) {
        createCriteria().list {
            eq("firstName", firstName)
        }
    }

    def useILikeSearch(String searchString) {
        createCriteria().list {
            ilike("firstName", searchString+ "%")
        }
    }

    def useAllSearchParamsStaticValues() {
        createCriteria().listDistinct {
            ilike("lastName", "SMI%")
            between("age", 18, 60)
            order("firstName","desc")
            maxResults 10 // This is just for pagination
            firstResult 0 // This is just for pagination
        }
    }


    @Override
    String toString() {
        return  firstName + " - " + lastName
    }

    // reusable criteria closure
    static namedQueries = {
        searchViaNamed { User user ->
            if (user.firstName){
                eq("firstName", user.firstName)
            }
            if(user.age){
                eq("age", user.age)
            }
        }
    }

}
