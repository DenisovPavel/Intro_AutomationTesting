package PatternProvider.Newspaper;

import PatternProvider.Subscriber.Subscriber;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractNews implements Newspaper {

    protected List<Subscriber> subscriberList = new ArrayList<>();

    @Override
    public void registerSubscriber(Subscriber subscriber) {
        subscriberList.add(subscriber);
    }

    @Override
    public void unSubscriber(Subscriber subscriber) {
        subscriberList.remove(subscriber);
    }
    /**
     * @params notifySubscribers - update всего списка подписчиков новой новостью;
     */
    @Override
    public void notifySubscribers(String news) {
        for (Subscriber subscriber:subscriberList) {
            subscriber.updateSubscribers(news);
        }
    }

}
