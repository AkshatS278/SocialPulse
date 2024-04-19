package socialMedia;

import java.util.ArrayList;

public class Twitter implements SocialMediaPlatform {
    private String apiUrl;
    private int numberOfPosts;

    public Twitter(String apiUrl, int numberOfPosts) {
        this.apiUrl = apiUrl;
        this.numberOfPosts = numberOfPosts;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    @Override
    public String fetchData() {
        // json file
        return "Data fetched from Twitter";
    }

    @Override
    public void setApiUrl(String apiUrl) {
        this.apiUrl = apiUrl;
    }

    @Override
    public String getApiUrl() {
        return apiUrl;
    }

    // creating a class of tweet using the data
    public class TwitterPost {
        private String tweetContent;
        private int retweets;
        private int likes;
        private boolean isExclusive;
        private ArrayList<String> hashtags;

        public TwitterPost(String tweetContent, int retweets, int likes, boolean isExclusive, ArrayList<String> hashtags) {
            this.tweetContent = tweetContent;
            this.retweets = retweets;
            this.likes = likes;
            this.isExclusive = isExclusive;
            this.hashtags = hashtags;
        }

        public ArrayList<String> getHashtags() {
            return hashtags;
        }

        public String getTweetContent() {
            return tweetContent;
        }

        public void setTweetContent(String tweetContent) {
            this.tweetContent = tweetContent;
        }

        public int getRetweets() {
            return retweets;
        }

        public void setRetweets(int retweets) {
            this.retweets = retweets;
        }

        public int getLikes() {
            return likes;
        }

        public void setLikes(int likes) {
            this.likes = likes;
        }

        public boolean isExclusive() {
            return isExclusive;
        }

        public void setExclusive(boolean exclusive) {
            isExclusive = exclusive;
        }
    }
}