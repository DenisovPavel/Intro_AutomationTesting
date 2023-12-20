package PatternProvider.Newspaper;

import PatternProvider.Subscriber.Subscriber;

import java.util.ArrayList;
import java.util.List;

public class MailNews extends AbstractNews {
    @Override
    public void notifySubscribers(String news) {
        super.notifySubscribers("Новость от MailNews:"+news); // method from super class;
    }

}
