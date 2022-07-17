object Lab03Q01{
    def Area(r:Int)={
        var pi:Double = math.Pi
        pi*r*r
    }
    def main(args:Array[String])={
       var r:Int = 5
       printf("Area of the Disk : %.2f ",Area(r));
    }
}