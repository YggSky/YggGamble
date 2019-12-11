package ServiceImp;

import Service.IPaserToGambleEntity;
import WebsocketClientEx.WebsocketClientEx;
import entity.GambleMarket;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import java.util.HashMap;
import java.util.Map;

/**
 * www.19letou.com 网站
 */
public class WWW19letou extends IPaserToGambleEntity {
    public void Parse(GambleMarket market) throws IOException, URISyntaxException {
String url="wss://msp2.19letou.com/signalr/connect?transport=webSockets&clientProtocol=1.5&connectionToken=EFbhN9pF0X849BdVn9Vi4mlZDJOri41m9BYaI15bn1XBrLxtuggAXpYXniyAeDCFHJtxLcoeK2A3D64hxSE6wl%2BX8VTc9F09F4d1pn0BrN9CVTS5&connectionData=%5B%7B%22name%22%3A%22sport_lotterytimespanasia%22%7D%5D&tid=3";
        WebsocketClientEx webSocket = new WebsocketClientEx(new URI(url) );
     String sendStr0=  "\"{\"H\":\"sport_lotterytimespanasia\",\"M\":\"ClientCall_AC_Balance\",\"A\":[\"9b70a072c2ec5718c834dc257885af2ae338bcced4538564e946db75e09ae430\"],\"I\":0}\"";

        String sendStr1="\"{\"H\":\"sport_lotterytimespanasia\",\"M\":\"ClientJoinGroup\",\"A\":[\"AW_SPORT_ASIA\"],\"I\":1}\"";
        String  sendStr2="\"{\"H\":\"sport_lotterytimespanasia\",\"M\":\"ClientJoinGroup\",\"A\":[\"menu_zh-cn\"],\"I\":2}\"";
        String sendStr3="\"{\"H\":\"sport_lotterytimespanasia\",\"M\":\"ClientJoinGroup\",\"A\":[\"sport_asia_bet_option_live_rate_zh-cn_000_1000_1\"],\"I\":3}\"";
        String sendStr4="\"{\"H\":\"sport_lotterytimespanasia\",\"M\":\"ClientJoinGroup\",\"A\":[\"AW_SPORT_ASIA\"],\"I\":4}\"";
        webSocket.connect();
        webSocket.send(sendStr0);
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        webSocket.send(sendStr1);
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        webSocket.send(sendStr2);
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        webSocket.send(sendStr3);
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        webSocket.send(sendStr4);
        webSocket.run();

    }

    public Map<String, String> GetHeaders() {
        Map<String, String> headers = new HashMap<String, String>();
        String Accept_Encoding = "gzip, deflate, br";
        String Accept_Language = "zh-CN,zh;q=0.9";
        String Cache_Control = "no-cache";
        String Connection = "Upgrade";
        String Host = "msp2.19letou.com";
        String Origin = "https://msp2.19letou.com";
        String Pragma = "no-cache";
        String Sec_WebSocket_Extensions = "permessage-deflate; client_max_window_bits";
        String Sec_WebSocket_Key = "paf7vMdsasJXyveaQuaSEA==";
        String Sec_WebSocket_Version = "13";
        String Upgrade = "websocket";
        String User_Agent = "Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/78.0.3904.70 Safari/537.36";

        headers.put("Accept-Encoding", Accept_Encoding);
        headers.put("Accept-Language", Accept_Language);
        headers.put("Cache-Control", Cache_Control);
        headers.put("Connection", Connection);
        headers.put("Host", Host);
        headers.put("Origin", Origin);
        headers.put("Pragma", Pragma);
        headers.put("Sec-WebSocket-Extensions", Sec_WebSocket_Extensions);
        headers.put("Sec-WebSocket-Key", Sec_WebSocket_Key);
        headers.put("Sec_WebSocket_Version", Sec_WebSocket_Version);
        headers.put("Upgrade", Upgrade);
        headers.put("User-Agent", User_Agent);

        return headers;
    }

    protected String RequestByURI(String url) throws IOException {
        connect= Jsoup.connect(url).ignoreContentType(true);
        connect.headers(GetHeaders());
        Document doc=connect.get();

        return  "";
    }


}
