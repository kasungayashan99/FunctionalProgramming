object labQ03{
    def normalSalary(hours:Int):Int=250*hours

    def OTSalary(hours:Int):Int=85*hours

    def netSalary(normalHours:Int, OTHours:Int):Int=normalSalary(normalHours)+OTSalary(OTHours)

    def tax(normalHours:Int, OTHours:Int):Double=netSalary(normalHours,OTHours)*0.12

    def TakeHomeSalary(normalHours:Int,OTHours:Int):Double=netSalary(normalHours,OTHours)-tax(normalHours,OTHours)

    def main(args:Array[String])={
        printf("Take home salary = %f",TakeHomeSalary(40,30))
    }
}