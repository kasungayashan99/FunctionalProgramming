object Lab03Q02{
    def converter(temp:Int)={temp * 1.8000+32.00}
    def main(args: Array[String]): Unit = {
        var temp:Int = 30
        printf("temperature (Fahernheit) : %2f",converter(temp))
    }
}