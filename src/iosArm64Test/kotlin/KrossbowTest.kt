import kotlinx.coroutines.runBlocking
import org.hildan.krossbow.stomp.StompClient
import org.hildan.krossbow.stomp.conversions.kxserialization.convertAndSend
import org.hildan.krossbow.stomp.conversions.kxserialization.withJsonConversions
import kotlin.test.Test

class KrossbowTest {

    @Test
    fun test(): Unit = runBlocking {
        val client = StompClient()
        val session = client.connect("wss://demo.piesocket.com/v3/channel_1?api_key=VCXCEuvhGcBDP7XhiJJUDvR1e1D3eiVjgZ9VRiaV&notify_self")
        val typedSession = session.withJsonConversions()
        typedSession.convertAndSend("/dest", "TEST")
    }
}
