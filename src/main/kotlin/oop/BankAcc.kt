package oop

fun main(args: Array<String>) {

    val BobAccount = Account("Bob")
    BobAccount.deposit(20000)
    BobAccount.withdraw(1000)
    BobAccount.deposit(-6000)

    val balance = BobAccount.calculateBalance()
    println("Your balance is $balance")
}

class Account(val accountName:String){
    private var balance = 0
    private var transactions = mutableListOf<Int>()


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
            println("$withdrawal withdrawn. Balance is now ${this.balance}")
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