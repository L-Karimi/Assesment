import java.util.SplittableRandom

fun main() {
    var sentence = CurrentAccount(1234, "Jordan Sparks", 123000.0)
    sentence.accountName
    sentence.accountNumber
    sentence.balance
    sentence.details(12350, 345.7, "Junnet Mohammed")

//    deposit(123.5)
    println("$sentence.accountName")
    var y = evenIndices(arrayOf("Christine","Annitah","Hannah"))

}


open class CurrentAccount(var accountNumber: Int, var accountName: String, var balance: Double) {

    fun withdraw(amount: Double) {
        balance -= amount
        println(amount)
    }

    fun deposit(amount: Double) {
        var balance = 0.0
        balance += amount
        println(amount)

    }

    fun details(i: Int, d: Double, s: String) {
        println("Account number $accountNumber with balance $balance is operated by $accountName")

    }

}
open  class savingsAccount(accountName: String,balance: Double,withdraw:Int):CurrentAccount(var accountName:Int,var accountNumber,var balance){
    override fun withdraw(amount: Double){
        if (withdraw<=4){
    }

}

data class Product(var name :String,var weight:String,var price:Int,var category: String){
    fun category(k:List<Product>){
        var newlist= mutableListOf<String>()
        k.forEach { b->

        }

    }

}

    fun evenIndices(girls: Array<String>): String {
        var s = mutableListOf<String>()
        girls.forEach { d ->

            if (d.length % 2 == 0) {
                s.add(d)
                println(d)
            }
        }
        return s.toString()

    }

