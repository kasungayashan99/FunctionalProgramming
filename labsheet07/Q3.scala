class Account(id:String,no:Int, b:Double){

    val nic:String= id
    val accountNo:Int = no
    var balance:Double = b

    def transfer(a:Account, b:Double) ={
           this.balance= this.balance-b 
           a.balance = a.balance + b
    } 


    override def toString = "["+nic+":"+ accountNo+ ":"+ balance+"]"
 }



object Q3 extends App{


 val Account1 = new Account("10001",202201,500)
 val Account2 = new Account("10002",202202,200)

 Account1.transfer(Account2,500)

 println(Account1)
 println(Account2)


}