package ao3.tracker.ao3tracker.scraper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import javax.swing.*;

public class Ao3Scrapper {
    //work class
    String Title;
    String Url;
    String Author;
    String Fandom;
    String Summary;
    //stats
    String dateStarted;
    String dataUploaded;
    String chapterCurrently;
    String chapterExpected;
    String wordCount;


    public Ao3Scrapper(String link){
        Url=link.substring(0,link.lastIndexOf('c')-1);
        Connector connector=new Connector(Url);
        Document document= getDoc(connector);
        setTitle(document);
        setAuthor(document);
        setSummary(document);
        setStats(document);
    }
    private Document getDoc(Connector connector){
        return connector.getDocument();
    }

    private void setTitle(Document doc){
        Element work=doc.getElementById("workskin");
        Title=work.selectFirst("h2").addClass("title heading").text();
    }

    private void setAuthor(Document doc){
        Element work=doc.getElementById("workskin");
        Author=work.selectFirst("h3").addClass("byline heading").text();
    }

    private void setFandom(Document doc){
        Elements work=doc.getElementsByClass("fandom tags");
        //Elements tags=doc.select("dd.fandom.tags ul.commas li a.tag");
        Fandom="";
        for(Element el:work){
            Fandom+=el.select("ul.commas li a.tag").text()+",";
        }
    }

    private void setSummary(Document doc){
        Elements summery=doc.getElementsByClass("summary module");
        Summary="";
        for (Element el: summery) {
            Summary += el.select("p").text();
        }
        //System.out.println(Summary);
    }

    private void setStats(Document doc){
        Elements stats=doc.select("dl.stats");
        for (Element element:stats){
            dateStarted= element.select("dd.published").text();
            dataUploaded= element.select("dd.status").text();
            String chapters= element.select("dd.chapters").text();
            chapterCurrently= chapters.substring(0,chapters.lastIndexOf('/'));
            chapterExpected=chapters.substring(chapters.lastIndexOf('/')+1);
            wordCount=element.select("dd.words").text();
        }
    }

    @Override
    public String toString() {
        return "{ \"url\":\"" + Url + "\", "
                + " \"title\": \"" + Title + "\", "
                + "\"author\":\"" + Author + "\","
                + "\"published\":\"" + dateStarted + "\","
                + "\"updated\":\"" + dataUploaded + "\","
                + "\"words\":\"" + wordCount + "\","
                + "\"chapters\":\"" + chapterCurrently + "\"}";
    }
}
