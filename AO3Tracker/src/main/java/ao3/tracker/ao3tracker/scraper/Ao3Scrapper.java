package ao3.tracker.ao3tracker.scraper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
public class Ao3Scrapper {
    //work class
    String Title;
    String Url;
    String Author;
    String Summary;
    //stats
    String datePublished;
    String dateLastUpdate;
    String numberOfChapters;
    String expectedChapters;
    String numberOfWords;

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
            datePublished= element.select("dd.published").text();
            dateLastUpdate= element.select("dd.status").text();
            String chapters= element.select("dd.chapters").text();
            numberOfChapters= chapters.substring(0,chapters.lastIndexOf('/'));
            expectedChapters=chapters.substring(chapters.lastIndexOf('/')+1);
            numberOfWords=element.select("dd.words").text();
        }
    }

    @Override
    public String toString() {
        return "{ \"url\":\"" + Url + "\", "
                + " \"title\": \"" + Title + "\", "
                + "\"author\":\"" + Author + "\","
                + "\"published\":\"" + datePublished + "\","
                + "\"updated\":\"" + dateLastUpdate + "\","
                + "\"words\":\"" + numberOfWords + "\","
                + "\"chapters\":\"" + numberOfChapters + "\"}";
    }
}
