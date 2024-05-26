package ao3.tracker.ao3tracker.scraper;
import org.jsoup.*;
import org.jsoup.nodes.*;

import java.io.IOException;

public class Connector {
    Document doc;
    public Connector(String link) {
        //System.out.println(Parse(link));
        try {
            doc = Jsoup
                    .connect(link)
                    .userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/108.0.0.0 Safari/537.36")
                    .header("Accept-Language", "*")
                    .get();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public Document getDocument(){
        return doc;
    }
    private String Parse(String link){
        return link.substring(0,42);
    }
}
