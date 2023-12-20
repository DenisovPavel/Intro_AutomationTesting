package PatternProvider.Subscriber;

public class BaseSubscriber implements Subscriber {
    private final String name;

    public BaseSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void updateSubscribers(String news) {
        System.out.println("Подписчик: " + name + " узнал новость: " + news);
    }
}
