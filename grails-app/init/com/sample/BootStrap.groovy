package com.sample

class BootStrap {

    def init = { servletContext ->

        println """
        **************************************************************
                BootStrap Grails TagLib-views Sample Application
        **************************************************************
        """
    }
    def destroy = {

    }
}
