open class Lab2(var x:Int, var y: Int) {
    open fun printInfo(){
        println("x:$x y:$y ")
    }
    open fun function() {
        x = readln().toInt()
        y = readln().toInt()
        if (x > y) {
            y *= y
            println("x:$x y:$y")
        }
        else if(x < y){
            x *= x
            println("x:$x y:$y")
        }
        else{

            println("x:$x y:$y")
        }
    }
}