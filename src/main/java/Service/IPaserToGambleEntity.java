package Service;

import entity.GambleEntity;
import entity.GambleMarket;
import org.jsoup.Connection;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 解析接口
 */
public abstract class IPaserToGambleEntity {

    //连接对象
    protected Connection connect = null;

    /**
     * 将需要的数据序列化为GambleMarket类
     *
     * @param market 需要解析的盘口
     */
    public abstract void Parse(GambleMarket market) throws IOException, URISyntaxException;

    /**
     * 生成请求头
     *
     * @return
     */
    protected abstract Map<String, String> GetHeaders();

    /**
     * 根据特定的uri请求资源
     *
     * @param url 资源地址
     * @return
     */
    protected abstract String RequestByURI(String url) throws IOException;
}
