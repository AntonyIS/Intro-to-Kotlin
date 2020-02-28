
fun main() {
//    print("Hello world ")
//    print("Hello world ")
    println()
    println("helo again")

//    variables in Kotlin
//    You can declare a variable in Kotlin using var and val keywords.
//    Implicit type inference
    val name = "John Doe"
    var language = "Kotlin"
//    reassign
    language = "Php"
    println(name)
    println(language)
//    Explicit type inference
    val age:Int = 23
    val country: String = "China"

    println(age)
    println(country)

    //age =  24 wont work

    println("I come from " + country + " and i am " + age)
    println("I come from $country and i am $age years old")
    println("I come from $country and i am $age years old and i will be ${age + 10} in ten")

    println(100 *100)

}