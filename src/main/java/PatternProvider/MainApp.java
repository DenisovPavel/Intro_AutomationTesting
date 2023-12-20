package PatternProvider;

import PatternProvider.Newspaper.MailNews;
import PatternProvider.Newspaper.YandexNews;
import PatternProvider.Subscriber.BaseSubscriber;
import PatternProvider.Subscriber.Subscriber;
import PatternProvider.Subscriber.SubscriberMemoryMember;

public class MainApp {
    public static void main(String[] args) {

        MailNews mailNews = new MailNews(); // Mail newspaper;
        YandexNews yandexNews = new YandexNews(); // Yandex newspaper;

        BaseSubscriber subscriberFedor = new BaseSubscriber("Fedor");
        BaseSubscriber subscriberPetr = new BaseSubscriber("Petr");
        BaseSubscriber subscriberMisha = new BaseSubscriber("Misha");
        BaseSubscriber subscriberKolya = new BaseSubscriber("Kolya");
        SubscriberMemoryMember subscriberOleg = new SubscriberMemoryMember("Oleg");

        mailNews.registerSubscriber(subscriberFedor); // Mail add Fedor;
        yandexNews.registerSubscriber(subscriberFedor); // Yandex add Fedor;
        mailNews.registerSubscriber(subscriberPetr); // Mail add Petr;
        yandexNews.registerSubscriber(subscriberMisha); //Yandex add Misha;
        yandexNews.registerSubscriber(subscriberKolya); //Yandex add Kolya;

        yandexNews.registerSubscriber(subscriberOleg);
        System.out.println(subscriberOleg.getNews());

        String newsYandex = "\"Яндекс\" перерегистрировал часть приложений на сербского провайдера";
        String newsMail = "Mail.ru Group (MAIL) сменит название на VK, объявила компания.";
        String newsYandexTwo = "Winter coming slowly";


        yandexNews.notifySubscribers(newsYandex); // Yandex send to subscribers new news
        mailNews.notifySubscribers(newsMail); // Mail send to subscribers new news
        yandexNews.notifySubscribers(newsYandexTwo);  // Yandex send to subscribers new news = 2 news
        yandexNews.unSubscriber(subscriberFedor); // subscriberFedor leave YandexNews

        yandexNews.notifySubscribers("Yandex remove Petr from Subscribers!");

        System.out.println(subscriberOleg.getNews());

    }

}
