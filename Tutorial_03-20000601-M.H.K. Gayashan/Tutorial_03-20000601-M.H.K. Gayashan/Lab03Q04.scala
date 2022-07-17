object Lab03Q04n{
    def bookCost(copies:Int)={24.95 * copies}
    def shippingCost(copies:Int)={
        if(copies>50){
            3*50+(copies-50)*0.75
        }
        else{
            3*copies
        }
    }
    def discount(copies:Int)={bookCost(copies)*0.4}
    def totalCost(copies:Int)={bookCost(copies)-discount(copies)+shippingCost(copies)}
    def main(args: Array[String]): Unit = {
        var copies:Int =60
        printf("Total cost : %.2f", totalCost(copies))
    }
    
}