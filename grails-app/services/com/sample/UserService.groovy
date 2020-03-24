package com.sample

import grails.transaction.Transactional

@Transactional
class UserService {

    //use all search here
    def getAllUsers() {
        User.useAllSearchParamsStaticValues()
    }

    //use with criteria method
    def getWithCriteria(String countryName) {
        User.useWithCriteria(countryName)
    }

    //use projection on property and aggregate functions
    def getWithProjections() {
        User.createCriteria().list {
            projections {
               // distinct('firstName')
                count("id")
                sum("age")
                avg("age")

            }
            eq('countryName', "INDIA")
        }
    }

    //use and or conditions
    def getWithAndOrConditions() {
        User.createCriteria().list {
            and {
                between("age", 20, 30)
                eq("country", "INDIA")
            }
            or {
                eq("address", "BLR")
                eq("country", "INDIA")
            }
        }
    }

    //use distinct list
    def getDistinctList() {
        User.createCriteria().listDistinct {
            ilike("country", "%IN%")
            between("age", 18, 60)
            order("firstName","desc")
        }
    }

    //use HQL - execute query
    def runExecuteQuery() {
        User.executeQuery("select firstName, lastName from User where age >:age ", [age:20])
    }

    //use HQL - update query
    def runUpdateQuery() {
        User.executeUpdate("update User set firstName=:firstName where id=:id", [firstName:"NEW USER", id:1.toLong()])
        //same can be achieved with below code:
        /*User user  = User.findById(1L) //User.get(1L)
        user.firstName = "NEW USER"
        user.save(flush: true)*/
    }

    //use named query
    def runNamedQuery() {
        User user = new User(id:100L, firstName: "WILL", age: 20)
        User.searchViaNamed(user).list()
        //User.searchViaNamed(user).count()
    }

}
