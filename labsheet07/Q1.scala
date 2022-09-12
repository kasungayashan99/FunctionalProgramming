class Rational(x:Int, y:Int){

    private def GCD(a:Int, b:Int):Int = if (b==0) a else GCD(b, a%b)

    def numer = x / GCD(x,y)
    def denom = y / GCD(x,y)

    def neg = new Rational(-this.numer,this.denom)

    def sub(r:Rational) = this+r.neg

    def +(r:Rational) = new Rational(this.numer*r.denom + this.denom*r.numer, this.denom*r.denom)
    
    override def toString = numer + "/" + denom
 }



object Q1 extends App{

 

 val rationalNumber1 = new Rational(3,4)
 val rationalNumber2 = new Rational(5,8)
 val rationalNumber3 = new Rational(2,7)

 val substraction = rationalNumber1 + rationalNumber2.neg + rationalNumber3.neg


 println(substraction)


}