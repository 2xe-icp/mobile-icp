package sample

import io.ktor.client.*
import io.ktor.client.request.get
import io.ktor.client.request.url

class EventApi() {
    private val client = HttpClient()
    suspend fun fetchEvents(): String {
        return client.get<String> {
            url("$baseUrl")
        }
    }
    companion object {
        private const val baseUrl = "http://10.0.2.2:8080/"
    }
}