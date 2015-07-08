package me.ugurcan.dictionaryapi;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ZarganAPI extends DictionaryAPI {

    public ZarganAPI() {

    }

    @Override
    public Results translate(String input) {

        input = Utils.replaceTurkishChars(input);

        //System.out.println(input);

        Results results = new Results();

        try {

            Document doc = Jsoup.connect("http://www2.zargan.com/tr/page/search?Text=" + input + "&FromLanguage=en").get();
            Elements elements = doc.getElementsByClass("resultsRow");
            results.addAll(translateSub(elements));

            doc = Jsoup.connect("http://www2.zargan.com/tr/page/search?Text=" + input + "&FromLanguage=tr").get();
            elements = doc.getElementsByClass("resultsRow");
            results.addAll(translateSub(elements));

        } catch (Exception ex) {
            results.clear();
        }

        if (results.isEmpty())
            results.add(new Result("No result found!", "-", "-", "-", "-"));

        return results;

    }

    private Results translateSub(Elements elements) {

        Results results = new Results();

        for (Element element : elements) {
            if (element.getElementsByClass("resultLink").isEmpty())
                continue;

            String sourceLang = element.select("img").get(1).attr("data-from-lang");
            String source = element.getElementsByClass("resultLink").get(0).text();

            String translationLang = element.select("img").get(1).attr("data-to-lang");
            String translation = element.getElementsByClass("resultLink").get(1).text();

            String lang2lang = sourceLang + "-" + translationLang;
            String type = element.getElementsByClass("categoryTypeStyle").get(1).text();
            String category = element.getElementsByClass("categoryTypeStyle").get(3).text();

            results.add(new Result(source, translation, lang2lang, type, category));
        }

        return results;
    }

}
