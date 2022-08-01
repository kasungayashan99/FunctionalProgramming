object t04Q05 extends App {
//  convert lower case to upper case
  def toUpper(str:String):Any ={printf("%s\n",str.toUpperCase())}

  //convert upper case to lower case
  def toLower(str:String):Any ={printf("%s\n",str.toLowerCase())}

  //convert to first character of the last name and first name
  def formatNames(name:String,lastName:String,para:String =""):Unit =
  {
    var n:String =name.toUpperCase()
    var l:String = lastName.toLowerCase()
    var p:String = para.toUpperCase()

    var str1:String = n.concat(l)
    var str2:String = str1.concat(p)
    printf("%s\n",str2)

  }
  toUpper("Benny")
  formatNames("Ni","roshan")
  toLower("Saman")
  formatNames("K","umar","A")

}
