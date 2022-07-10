object labQ02{
    def main(args:Array[String])={
        var a:Int = 2
        var b:Int = 3
        var c:Int = 4
        var d:Int = 5
        var k:Float = 4.3f

        b=b-1
        d=d-1
        println("--b*a+c*d--",b*a+c*d)
        a=a+1
        println("a++ = ",a)
        //printf("(-2)*(g-k)+c = ",(-2)*(g-k)+c)
        c=c+1
        println("c=c++ =",c)
        c=(c+1)*(a+1)
        println("c=++c*a++",c)
    }
}
