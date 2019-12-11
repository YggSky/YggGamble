package entity;

import java.util.HashMap;
import java.util.List;

public class GambleMarket {
    public static enum  Categories{BASKETBALL};
    //所在域名
    String webAdress;

    //用户名与密码
    String userName;
    String userPassword;


    //该盘口所具有的所有比赛
    HashMap<Categories, List<GambleEntity>> allRaces;

}
