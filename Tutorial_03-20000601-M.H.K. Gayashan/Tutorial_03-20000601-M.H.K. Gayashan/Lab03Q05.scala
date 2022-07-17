object Lab03Q05n{
    def easyPase(distance:Double)={distance*8}

    def tempoPase(distance:Double)={distance*7}

    def main(args: Array[String]): Unit = {
        printf("Total running Time : %.2f",easyPase(2)+tempoPase(3)+easyPase(2))
    }
}