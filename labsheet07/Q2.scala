object Q2 extends App{
    case class rationalNumbers(numerator1:Int,denominator1:Int,numerator2:Int,denominator2:Int,numerator3:Int,denominator3:Int){
        var num1:Int =numerator1;
        var deno1:Int =denominator1;
        var num2:Int = numerator2;
        var deno2:Int = denominator2;
        var num3:Int =numerator3;
        var deno3:Int =denominator3;

        def sub()={
           val gcdNumber = GCD(((num1*deno2*this.deno3)-(this.num2*this.deno1*this.deno3)-(this.num3*this.deno1*this.deno2)),(this.deno1*this.deno2*this.deno3))
           printf("substract %d/%d - %d/%d - %d/%d = %d/%d",numerator1,denominator1,numerator2,denominator2,numerator3,denominator3,((num1*deno2*deno3)-(num2*deno1*deno3)-(num3*deno1*deno2))/gcdNumber,(deno1*deno2*deno3)/gcdNumber)
        }

    }

    //find the gratest common diviser
    def GCD(number1:Int,number2:Int):Int=number2 match{
        case 0 => number1;
        case number2 if number2>number1 => GCD(number2,number1);
        case _ => GCD(number2,number1%number2);
}

    var num1:Int = 3;
    var demo1:Int = 4;
    var num2:Int = 5;
    var demo2:Int = 8
    var num3:Int = 2;
    var demo3:Int = 7;
    

    //find the gcd number
    val rationalnumber = rationalNumbers(num1,demo1,num2,demo2,num3,demo3);
    rationalnumber.sub();
    
    
    
    
}