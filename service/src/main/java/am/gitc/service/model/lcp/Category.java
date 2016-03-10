package am.gitc.service.model.lcp;

/**
 * Created by Zorik Zaqaryan on 08.03.2016.
 */
public enum Category {

    JAVA(1, "Java"),
    C(2, "C"),
    ANDROID(3, "Android"),
    PHP(4, "PHP");

    public int value;
    public String type;

    Category(int value, String type) {
        this.value = value;
        this.type = type;
    }

    public static Category valueOf(int value) {
        for (Category e : Category.values()) {
            if (e.value == value) {
                return e;
            }
        }
        return null;
    }

    public int getValue() {
        return value;
    }

    public String getTitle() {
        return type;
    }

}
