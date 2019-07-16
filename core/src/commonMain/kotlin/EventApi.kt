package sample

import io.ktor.client.*
import io.ktor.client.engine.HttpClientEngine
import io.ktor.client.features.json.JsonFeature
import io.ktor.client.features.json.serializer.KotlinxSerializer
import io.ktor.client.request.get
import io.ktor.client.request.url
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JSON

class EventApi(private val engine: HttpClientEngine) {
    private val client by lazy {
        HttpClient(engine) {
            install(JsonFeature) {
                serializer = KotlinxSerializer(JSON.nonstrict)
            }
        }
    }

    suspend fun fetchEvents(): Event {
        return client.get {
            url("$baseUrl")
        }
    }
    companion object {
        private const val baseUrl = "http://10.0.2.2:8080/"
    }

    @Serializable
    data class Event(val title: String, val description: String)
}