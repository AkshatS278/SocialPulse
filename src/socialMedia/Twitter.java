package socialMedia;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        // Placeholder code to simulate fetching data from Twitter API
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

    // Inner class representing a Twitter post
    public class TwitterPost {
        private String tweetContent;
        private int retweets;
        private int likes;
        private boolean isExclusive;
        private ArrayList<String> hashtags;

        public TwitterPost(String tweetContent, int retweets, int likes, boolean isExclusive,
                ArrayList<String> hashtags) {
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

        // Method to analyze content performance based on hashtags
        public Map<String, Integer> analyzeContentPerformance(List<String> hashtags) {
            Map<String, Integer> performanceMetrics = new HashMap<>();
            for (String hashtag : hashtags) {
                performanceMetrics.put(hashtag, performanceMetrics.getOrDefault(hashtag, 0) + 1);
            }
            return performanceMetrics;
        }
    }
}