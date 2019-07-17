package com.sample

class CustomTagLib {

    static defaultEncodeAs = [taglib:'raw'] //if html then render html as text
    //static encodeAsForTags = [tagName: [taglib:'html'], otherTagName: [taglib:'none']]

    static namespace = "ctl" //custom tag lib

    /*table custom data render*/
    def renderCustomTable = {attrs, body ->
        List<Student> studentList = attrs.studentList as List<Student>
        studentList.each { Student st ->
            Map jsonValueMap = [name: st.name, age: st.age + " years", city: st.city, country: st.country, gender: st.gender]
            out << ctl.drawTd(jsonValueMap)
        }
    }

    /*each record custom renderer*/
    def drawTd = { attrs, body ->
        Map model = [name: attrs.name, age: attrs.age, city: attrs.city, country: attrs.country, gender: attrs.gender]
        out << g.render(template: '/common/tableData', model: model)
    }
}
