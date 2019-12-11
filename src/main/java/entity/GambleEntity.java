package entity;


import java.util.Date;
import java.util.HashMap;

public class GambleEntity {
    static int offset = 1000;

    //实体所具有的状态
    public static enum Status {
        Win(0),
        Lose(1 + offset);
        private final int value;

        Status(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

    }


    //所在域名
    String webAdress;

    //比赛实体名字
    String name;

    //时间
    Date date;

    //各个状态下所具有的赔率
    HashMap<Status, Double> statusOdds = new HashMap<Status, Double>();

    //选择的押注状态
 private    HashMap<Status, Boolean> statusSeletced = new HashMap<Status, Boolean>();

    HashMap<Status, Boolean> getStatusSeletced()
    {
        return statusSeletced;
    }

}


