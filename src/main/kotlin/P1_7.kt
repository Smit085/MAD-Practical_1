//7.Find the factorial of number by recursion. Explain "tailrec" keyword.
tailrec fun fact(n:Int,y:Int): Int{
    return if(n<=1) n else fact((n-1),n*y)
}
fun main(args: Array<String>){
    println(fact(5,1))
}