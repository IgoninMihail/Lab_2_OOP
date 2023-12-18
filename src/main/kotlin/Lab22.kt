class Lab22(private var z:Int) : Lab2(0,0) {
    override fun printInfo(){
        println("z:$z")
    }
    fun function2(x:Int,y:Int){
        z = readln().toInt()
        if (x > y) {
            println("x:$x y:${y*z}")
        }
        else if(x < y){
            println("x:${x*z} y:$y")
        }
        else{
            println("x:$x y:$y")
        }
    }
}