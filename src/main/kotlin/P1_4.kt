//4.Find the number is odd or even by using Control Flow inside println() method.
fun main(args : Array<String>){
    print("Enter any number: ")
    val num = readln().toInt()
    print(if (num % 2 == 0) "Your number is Even" else "Your number is Odd")
}