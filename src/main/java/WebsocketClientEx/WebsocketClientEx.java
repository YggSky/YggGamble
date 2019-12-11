package WebsocketClientEx;

import org.java_websocket.client.WebSocketClient;
import org.java_websocket.handshake.ServerHandshake;

import java.net.URI;

public class WebsocketClientEx extends WebSocketClient {

    public WebsocketClientEx(URI serverUri) {
        super(serverUri);
    }

    public void onOpen(ServerHandshake serverHandshake) {

    }

    public void onMessage(String s) {
String a=s;
    }

    public void onClose(int i, String s, boolean b) {

    }

    public void onError(Exception e) {

    }
}
