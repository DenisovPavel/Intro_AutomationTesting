package PatternProvider.Newspaper;

import PatternProvider.Subscriber.Subscriber;

import java.util.ArrayList;
import java.util.List;

public class YandexNews extends AbstractNews {

    @Override
    public void notifySubscribers(String news) {
        super.notifySubscribers("Новость от YandexNews:"+news); // method from super class;
    }

}
