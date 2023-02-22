fun main(){
group()
    info()
    list()
    loops()
    maggie("rita","rachel","sonia")

}
fun group(){
    var sentence = arrayOf("Ann","Mercian","Joyce","Maggie")
    println(sentence.contentToString())

}

fun info(){
    var cities= arrayOf("harare","mumbai","dodoma","jakarta")
    var detail= cities.map { it.capitalize()}.toTypedArray()
    println(detail.contentToString())

    }
fun list(){
    var numbers= arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
    println(numbers.indexOf(158))
    println(numbers.sortedArray().contentToString())
    }

fun loops(){//question three
    var numbers= arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
    var sum=numbers[2]+numbers[5]
    println(sum)
println(numbers.indexOf(158))
println(numbers.sortedArray().contentToString())
}

fun maggie(num1:String,num2:String,num3:String):String{
    var order= arrayOf(num1,num2,num3)
    return order.toString()

}
