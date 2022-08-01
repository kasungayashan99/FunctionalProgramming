object t04Q04 extends App {
  printf("Enter number : ")
  var num = scala.io.StdIn.readInt()
  num match {
    case num if (num<=0)=>printf("Negative/Zero")
    case num if (num%2==0) => printf("Even")
    case _ => printf("Odd")
  }
}
