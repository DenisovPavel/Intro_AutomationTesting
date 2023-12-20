package PatternProvider.Subscriber;

// Subscriber with his own logic;
public class SubscriberMemoryMember implements Subscriber {
    private final String name;
    private String news;

    public SubscriberMemoryMember(String name) {
        this.name = name;

    }

    public String getNews() {
        return news;
    }

    @Override
    public void updateSubscribers(String news) {
        System.out.printf(this.news = news);
        System.out.println("<== Oleg checked this news ");
    }
}
