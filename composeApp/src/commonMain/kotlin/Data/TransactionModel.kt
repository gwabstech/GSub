// YApi QuickType插件生成，具体参考文档:https://plugins.jetbrains.com/plugin/18847-yapi-quicktype/documentation

package Data

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class TransactionModel(
    @SerialName("responseBody")
    val responseBody: ResponseBody,
    @SerialName("requestSuccessful")
    val requestSuccessful: Boolean,
    @SerialName("responseMessage")
    val responseMessage: String,
    @SerialName("responseCode")
    val responseCode: String
)

@Serializable
data class ResponseBody(
    @SerialName("transactionReference")
    val transactionReference: String,
    @SerialName("paymentReference")
    val paymentReference: String,
    @SerialName("paidOn")
    val paidOn: String,
    @SerialName("paymentDescription")
    val paymentDescription: String,
    @SerialName("amountPaid")
    val amountPaid: String,
    @SerialName("totalPayable")
    val totalPayable: String,
    @SerialName("paymentMethod")
    val paymentMethod: String,
    @SerialName("currency")
    val currency: String,
    @SerialName("settlementAmount")
    val settlementAmount: String,
    @SerialName("paymentStatus")
    val paymentStatus: String,
)







