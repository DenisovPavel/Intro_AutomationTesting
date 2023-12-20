package PatternProvider.Newspaper;

import PatternProvider.Subscriber.Subscriber;

public interface Newspaper {
    /**
     * @params registerSubscriber - регистрация подписчика газеты;
     */
    void registerSubscriber(Subscriber subscriber);

    /**
     * @params notifySubscribers - рассылка новостей;
     */
    void notifySubscribers(String news);

    /**
     * @params unSubscriber - удаление подписчика;
     */
    void unSubscriber(Subscriber subscriber);
}
