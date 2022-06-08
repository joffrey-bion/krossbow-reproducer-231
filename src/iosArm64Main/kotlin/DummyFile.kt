import org.hildan.krossbow.stomp.StompClient
import org.hildan.krossbow.stomp.conversions.kxserialization.withJsonConversions

suspend fun testCompilation() {
    val client = StompClient()
    val session = client.connect("ws://dummy.url.com")
    val typedSession = session.withJsonConversions()
}
