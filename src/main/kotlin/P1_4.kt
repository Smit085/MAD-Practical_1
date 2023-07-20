fun main(args : Array<String>){
    print("Enter any number: ")
    val num = readln().toInt()
    println(if (num % 2 == 0) "Your number is Even" else "Your number is Odd")
}