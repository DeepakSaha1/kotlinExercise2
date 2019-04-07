open class Bank {
    var ROI: Int = 0
    open fun getDetails() {
        ROI = 4
        println("ROI for Bank is $ROI")
    }
}

class SBI : Bank() {
    override fun getDetails() {
        ROI = 5
        println("ROI for SBI is $ROI")
    }
}

class BOI : Bank() {
    override fun getDetails() {
        ROI = 6
        println("ROI for BOI is $ROI")
    }
}

class ICICI : Bank() {
    override fun getDetails() {
        ROI = 7
        println("ROI for ICICI is $ROI")
    }
}

fun main() {

    val bank = Bank()
    val sbi = SBI()
    val boi = BOI()
    val icici = ICICI()

    bank.getDetails()
    sbi.getDetails()
    boi.getDetails()
    icici.getDetails()
}
