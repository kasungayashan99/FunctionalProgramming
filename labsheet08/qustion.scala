import scala.math
case class Point(a:Double,b:Double){
    var x:Double = a;
    var y:Double = b;

    //adding two points
    def add(p:Point) = Point(p.x+x,p.y +y);

    //move the point 
    def move(dx:Int,dy:Int) = Point(x+dx , y + dy);

    //get the distance   
    def distance(p:Point) = math.sqrt(math.pow((p.x-x),2.0) + math.pow((p.y-y),2.0));

    //exchanging the points
    def invert() = Point(x,y); 
    
}
object qustion extends App{
    //create objects
    var p1 =Point(10,20);
    var p2 = Point(3,5);

    //call the functions in class
    println(p1.add(p2));
    println(p2.move(2,10));
    println(p2.distance(p1));
    println(p1.invert());
    
}