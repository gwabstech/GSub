package Data

import io.ktor.http.Url

data class User(
    val fullName:String,
    val email:String,
    val phoneNumber:String,
    val imageUrl: Url,
    val accountBalance: Double,
    val transactionPin:String,
    val transactions:List<TransactionModel>

)
