import java.util.HashMap;

public class PlayGround {

    public static void main(String[] args)  {
        var vars = new HashMap<String,String>();
         vars.put("recentlyViewedOIds","avignon-npp-cp-uk;slim-fit-jingles-pyjamas;A05896;A06785;A01288;london-socks-set-of-3;A07003;A05863;A04948;bergamot-and-cedar-collection");
         String recentlyViewedOIds = vars.get("recentlyViewedOIds").replaceAll(";", ",");
         vars.put("recentlyViewedOIds", recentlyViewedOIds);
        System.out.println(vars.get("recentlyViewedOIds"));
    }


}
