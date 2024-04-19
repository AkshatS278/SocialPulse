package userinfo;
import user.User;

public class InstagramUserInfo implements User{
    private String userName;
    private String gender;
    private int age;
    private String platform;
    private String followers;
    private int highlight_reel_count;
    private int posts;

    public InstagramUserInfo(String userName, String gender, int age, String platform, String followers, int highlight_reel_count, int posts) {
        this.userName = userName;
        this.gender = gender;
        this.age = age;
        this.platform = platform;
        this.followers = followers;
        this.highlight_reel_count = highlight_reel_count;
        this.posts = posts;
    }

    @Override
    public String getUserName() {
        return this.userName;
    }

    @Override
    public String getGender() {
        return this.gender;
    }

    @Override
    public int getAge() {
        return this.age;
    }

    @Override
    public String getPlatform() {
        return this.platform;
    }

    @Override
    public String getFollowers() {
        return this.followers;
    }

    @Override
    public int getHighlightReelCount() {
        return this.highlight_reel_count;
    }

    public int getPosts() {
        return this.posts;
    }

}
