package oop

fun main(args: Array<String>) {

}

class Account(val accountName:String){
    var balance = 0
    var transactions = mutableListOf<Int>()


    fun deposit(amount:Int){
        if (amount> 0){
            transactions.add(amount)
            balance += amount
            println("$amount deposited. Balance is now ${this.balance}")

        }else{
            println("Cannot deposit negative sums")
        }
    }

    fun withdraw(withdrawal:Int){
        if (-withdrawal<0){
            transactions.add(-withdrawal)
            this.balance += -withdrawal
            println("$withdrawal deposited. Balance is now ${this.balance}")
        }else{
            println("Cannot withdraw negative sums")
        }
    }

    fun  calculateBalance():Int{
        this.balance = 0
        for (transaction in transactions){
            this.balance += transaction
        }
        return this.balance
    }
}