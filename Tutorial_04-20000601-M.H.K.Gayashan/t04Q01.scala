object t04Q01 extends App {
  def intrest(x: Int): Any = {
    x match {
      case x if(x<0) => printf("Entered deposit amount not valid")
      case x if (x < 20000) => x * 0.2
      case x if (x > 20000 && x < 200000) => x * 0.4
      case x if (x > 200000 && x < 2000000) => x * 0.35
      case _ => x * 0.65
    }
  }
  printf("Input deposit amount : ")
  var deposit:Int = scala.io.StdIn.readInt()
  println(intrest(deposit))


}
