case class Point(a:Int,b:Int){
    var x:Int = a;
    var y:Int = b;

    //adding two points
    def add(p:Point) = Point(p.a+a,p.b +b);

    //move the point 
    def move(dx:Int,dy:Int) = Point(this.a+dx , this.b + dy);

    //get the distance   
    def distance(p:Point) = Point(p.a-a,p.b-b);

    //exchanging the points
    def invert() = Point(this.b,this.a); 
    
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