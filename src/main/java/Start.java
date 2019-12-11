import Service.DownloadService;
import Service.IPaserToGambleEntity;
import ServiceImp.WWW19letou;
import entity.GambleEntity;
import entity.GambleMarket;

import java.io.IOException;
import java.net.URISyntaxException;

public class Start {
    public static void main(String[] args) throws IOException {

        test();

    }
  static void test() throws IOException {
        IPaserToGambleEntity fd=new WWW19letou();
      try {
          fd.Parse(new GambleMarket());
      } catch (URISyntaxException e) {
          e.printStackTrace();
      }
  };
};

