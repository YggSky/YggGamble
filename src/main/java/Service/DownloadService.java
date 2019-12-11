package Service;



import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class DownloadService {
    public String Download(String url)
    {
        String str="";

        try {
           Map<String, String> cookies = null;
           Connection.Response res1 = Jsoup.connect("https://blog.csdn.net/u010287873/article/details/82595294").timeout(30000).execute();
            cookies = res1.cookies();
         //   Document doc1 = null;
         //   doc1 = Jsoup.connect("https://blog.csdn.net/u010287873/article/details/82595294").cookies(cookies).timeout(31000).get();

            String url1="https://blog.csdn.net/u010287873/article/details/82595294";
            Connection connect=Jsoup.connect(url1);
            HashMap<String,String> headers=new HashMap<String,String>();
            headers.put( "authority","blog.csdn.net");
            headers.put( "method","GET");
            headers.put( "path","/u010287873/article/details/82595294");
           headers.put( "scheme","https");
            headers.put( "referer","https://blog.csdn.net/u010287873/article/details/82595294");
            headers.put( "sec-fetch-mode","GET");
            headers.put( "sec-fetch-site","same-origin");
            headers.put( "sec-fetch-user","?1");
            headers.put( "upgrade-insecure-requests","1");
         headers.put( "cookie","smidV2=20180704162247f260748c58e9a8dc8bee2c12c592014d00ebcc2d37ebd5bb0; __utma=17226283.1449705891.1529914844.1529914844.1531122252.2; csdn_cart_user_id=-939006149; cache_cart_num=0; ARK_ID=JS5ccc8f1ff82408492565d835aa762c0e5ccc; uuid_tt_dd=10_28867322970-1540546797183-164059; _ga=GA1.2.1449705891.1529914844; Hm_ct_6bcd52f51e9b3dce32bec4a3997715ac=1788*1*PC_VC!5744*1*likey3!6525*1*10_28867322970-1540546797183-164059; dc_session_id=10_1556155092112.862080; __yadk_uid=8nXBv4SUhEwWFxbYv9Zo4SzNgf3AAfit; Hm_lvt_1db42b1b8e695a0d4e6362691ffd5584=1567736105; Hm_ct_1db42b1b8e695a0d4e6362691ffd5584=6525*1*10_28867322970-1540546797183-164059; Hm_lvt_8dd4f8848a8213d76d185b72cde67a7d=1571385019; Hm_ct_8dd4f8848a8213d76d185b72cde67a7d=6525*1*10_28867322970-1540546797183-164059; Hm_lvt_349ec9eb163e9bf61450dfea54530d88=1572514834; Hm_ct_349ec9eb163e9bf61450dfea54530d88=6525*1*10_28867322970-1540546797183-164059; acw_tc=2760825f15736426866131337ebc6a50e5d75cd78d7a03cbb3656e0c33b653; __gads=Test; SESSION=e8960d91-28fa-44bd-a585-0d1bf167a784; firstDie=1; BAIDU_SSP_lcr=https://www.baidu.com/link?url=4Qf5Y6xkbHxd9zk_XnFZW10v10lI3JRPzBTdJFQKZ3QsasORfRBP89BAO0qebjfc&wd=&eqid=d39bcc070009a4b8000000045def3541; Hm_lvt_2248d4891bed179207840680070a8ef3=1575957829; Hm_ct_2248d4891bed179207840680070a8ef3=6525*1*10_28867322970-1540546797183-164059; Hm_lvt_6bcd52f51e9b3dce32bec4a3997715ac=1575533797,1575856195,1575856354,1575957829; announcement=%257B%2522isLogin%2522%253Afalse%252C%2522announcementUrl%2522%253A%2522https%253A%252F%252Fblogdev.blog.csdn.net%252Farticle%252Fdetails%252F103053996%2522%252C%2522announcementCount%2522%253A0%252C%2522announcementExpire%2522%253A3600000%257D; acw_sc__v2=5def3546be0e54f2229fe440a19fcc9c914418d9; dc_tos=q2a8uf; Hm_lpvt_2248d4891bed179207840680070a8ef3=1575957832; Hm_lpvt_6bcd52f51e9b3dce32bec4a3997715ac=1575957832; c-login-auto=16");
            headers.put( "user-agent","Chrome/78.0.3904.70");

            connect.headers(headers);

            Connection.Response res=connect.ignoreContentType(true).method(Connection.Method.POST).execute();
            str=res.body();

            Document doc = Jsoup.connect("https://www.19letou.com/cn/gb_sport").get();


            str=doc.html();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            Document doc = Jsoup.parse(getHtml("https://www.19letou.com/cn/")); // 解析网页 得到文档对象
        } catch (IOException e) {
            e.printStackTrace();
        }
        return  str;
    }
    public String getHtml(String str) throws IOException {
        CloseableHttpClient httpclient = HttpClients.createDefault(); // 创建httpclient实例
        HttpGet httpget = new HttpGet(str); // 创建httpget实例
        CloseableHttpResponse response = httpclient.execute(httpget); // 执行get请求
        HttpEntity entity = response.getEntity(); // 获取返回实体
        String content = EntityUtils.toString(entity, "utf-8");
        response.close(); // 关闭流和释放系统资源
        return content;
    }

}
