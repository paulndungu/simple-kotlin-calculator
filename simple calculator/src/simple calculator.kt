fun main(){

//    <----This is a simple beginner level Kotlin calculator---->

    println("First input: ")
    var Firstinput:Float = readLine()!!.toFloat()

    println("Second input: ")
    var Secondinput:Float = readLine()!!.toFloat()

    val Finaloutput:Float?
    Finaloutput = Firstinput * Secondinput
    println("Final output: " + Finaloutput)
    }