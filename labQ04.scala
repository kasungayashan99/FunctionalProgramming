object labQ04{
    def attendence(price:Int):Int= 120+(15-price)/5*20

    def cost(price:Int):Int= 500+attendence(price)*3
    
    def revenue(price:Int):Int = price * attendence(price)

    def profit(price:Int):Int = revenue(price) - cost(price)

    def main(args:Array[String])={
        var price:Int =10
        var prof:Int =0
        var flag:Boolean = true
        var properPrice:Int= 0
        for(a <- 11 to 50){
            if( prof< profit(price)){
                prof=profit(price)
                properPrice=price
            }
            price=price+1
        }
        println(properPrice)
    }
}