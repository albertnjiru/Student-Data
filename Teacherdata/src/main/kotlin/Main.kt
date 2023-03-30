fun main(){
    var student1= Student()
    student1.gender="Male and Female"
    student1.course="Technical Trainer"
    println("The class has  ${student1.gender} gender  pursuing ${student1.course} course ")
    student1.curriculum()
    val ladies=Ladies()
    ladies.gender="female"
    ladies.course="Technical Trainer"
    println("The class has 30  ${ladies.gender}  pursuing ${ladies.course} course")
    ladies.hockey()
    var boys1=Boys()
    boys1.gender="male"
    boys1.course="Technical Trainer"
    println("The class has 27  ${boys1.gender}  pursuing ${boys1.course } course")
    boys1.football()
}
open class Student {
    var  gender: String=""
    var course:String=""
    fun curriculum(){
        println("Students are using CBET curriculum")
    }
}
class Ladies:Student(){
    fun hockey(){
        println("The ladies playing hockey are 30")
    }
}
class Boys:Student(){
    fun football(){
        println("The boys playing football are 27")
    }
}
