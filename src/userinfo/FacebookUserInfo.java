package userinfo;

import user.User;

public class FacebookUserInfo implements User {
    private String userName;
    private String gender;
    private int age;
    private String platform;
    private int followers;
    private int highlightReelCount;
    private int posts;

    public FacebookUserInfo(String userName, String gender, int age, String platform, int followers,
            int highlightReelCount, int posts) {
        this.userName = userName;
        this.gender = gender;
        this.age = age;
        this.platform = platform;
        this.followers = followers;
        this.highlightReelCount = highlightReelCount;
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
    public int getFollowers() {
        return this.followers;
    }

    @Override
    public int getHighlightReelCount() {
        return this.highlightReelCount;
    }

    public int getPosts() {
        return this.posts;
    }

}
