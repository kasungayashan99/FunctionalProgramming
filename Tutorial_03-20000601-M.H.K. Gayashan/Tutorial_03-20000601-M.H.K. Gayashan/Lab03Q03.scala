object Lab03Q03{
    def volume(r:Double)={4/3 * math.Pi*r*r*r}
    def main(args: Array[String]): Unit = {
        var r:Double = 5
        printf("Volume of sphere : %.2f",volume(r))
    }
}