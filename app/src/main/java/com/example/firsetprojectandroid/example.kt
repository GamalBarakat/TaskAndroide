fun main(){
//  var x : Int =5
//    var y : Double =5.55
//    var k="Gamal"
//    println("-----------------------------------")
//    println(x)
//    println(y)
//    println(k)
//
//    println("********************************")
//    println(x.toDouble())
//    println(y.toInt())
//    println(k.toBoolean())

//    var cin=Scanner(System.`in`);
//    var name=cin.nextLine();
//      println(name);
//    println(name.length);
//    println(name.uppercase());
//    print(name.lowercase());
//    print(name.substring(2,4))

//    println("Enter Age:")
//    var age= Scanner(System.`in`);
//    var score=readLine()?.toIntOrNull() ?: 0
//
//    val Age = when (score) {
//        in 0..12 -> "Child"
//        in 13..19 -> "Teenager"
//        in 20..64 -> "Adult"
//
//
//        else -> "Senior"
//    }
//
//    println(score)
//    print(Age);





//        println("Enter a number (1-7):")
//        val dayNumber = readLine()?.toIntOrNull()



//        val dayName = when (dayNumber) {
//            1 -> "Sunday"
//            2 -> "Monday"
//            3 -> "Tuesday"
//            4 -> "Wednesday"
//            5 -> "Thursday"
//            6 -> "Friday"
//            7 -> "Saturday"
//            else -> "Invalid day"
//        }
//
//        println("The day of the week is: $dayName")

//    val lightColor = readLine()?.lowercase()
//
//    val action = when (lightColor) {
//        "red" -> "stop"
//        "yellow" -> "wait"
//        "green" -> "go"
//        else -> "Invalid color. Please enter red, yellow, or green."
//    }
//
//    println("The driver should: $action")


















//
//
//
//
//
//
//
//    var x: Int =155
//    var y=20.55
//    var df="gamal"
//    println(x)
//    println(y);
//    println(df)
//
//    var v=1.5
//    var c:Int
//    c=v.toInt()
//var kj="GAMAL"
//    println("GAMAL.length equ ${kj.length}")
//
//println(c)
//
//    val number=10
//    if(number in 1..100)
//        print("GAMALLLLL")
//
//    var f=false
// var l5=if(f) {
//     45
// }
//    else
//     {
//         450
//     }
//
//    var e=10
//   var q= when(e) {
//       10 -> 10;
//       20 -> 20;
//       30 -> 30
//       40 -> 40
//
//       else -> "Individa"
//   }
//
//println(q)
//
//    println("Enter the score (0-100):")
//    val score = readLine()?.toIntOrNull() ?: 0
//
//    val grade = when (score) {
//        in 90..100 -> "A"
//        in 80..89 -> "B"
//        in 70..79 -> "C"
//        in 60..69 -> "D"
//        in 0..59 -> "F"
//        else -> "Invalid score"
//    }
//
//    println("The grade is: $grade")

//
//
//
//
//
//
//
//
//
//
//
//    val  encodelowercase={woe:String ->woe.lowercase()};
//    val  encodeuppercase={woe:String ->woe.uppercase()};
//    fun encodeM(mes:String,encode:(String)->String): String {
//        return encode(mes);
//
//
//
//
//
//
//
//
//
//    }
//val ss= listOf(5,10,52,1,5,2)
//    println(ss.filter {it > 4  });
//    val s= listOf(setOf(1,8),setOf(8,78),setOf(45,0),)
//    println(s)
//    println(s.flatten());
//    println(s.flatten().filter { it>0 })


//    var n=Employ(name = "GAMAL", age = 25)
//    var n1=Employ(name = "BARAKAT", age = 58)

var sudent = student()
    sudent.name="GAMAAL"
    sudent.age=22



    print(sudent.display())

}

open  class Employ(var name: String ="", var age: Int =1){
init {
    println("NAME IS $name       AGE $age" )
}

    fun display(){
        print(name)
    }
     open  fun printName(){
         println("GAMAAL BARAKAT")
     }
}

class student :Employ(){

override fun printName(){
        println("GAMAAL BARAKAT")
    }

}
