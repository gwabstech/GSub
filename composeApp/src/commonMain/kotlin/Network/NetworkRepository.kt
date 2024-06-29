package Network

import io.ktor.client.HttpClient
import io.ktor.client.request.get
import kotlinx.coroutines.flow.Flow

class NetworkRepository(private val httpClient: HttpClient) {

    // TODO: functions to send or get request 
    /*
    
    fun getProductList(): Flow<NetWorkResult<ApiResponse?>> {
        return toResultFlow {
            val response = httpClient.get().body<ApiResponse>()
            NetWorkResult.Success(response)
        }
    }
    
     */
}