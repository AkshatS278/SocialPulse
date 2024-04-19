package socialMedia;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Facebook implements SocialMediaPlatform {
    private String apiUrl;
    private int numberOfPosts;

    public Facebook(String apiUrl, int numberOfPosts) {
        this.apiUrl = apiUrl;
        this.numberOfPosts = numberOfPosts;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    // override the fetchData method
    @Override
    public String fetchData() {
        return "Data fetched from Facebook";
    }

    @Override
    public void setApiUrl(String apiUrl) {
        this.apiUrl = apiUrl;
    }

    @Override
    public String getApiUrl() {
        return apiUrl;
    }

    // nested class for a post analysis
    public static class FacebookPost {
        private String postTitle;
        private int likes;
        private int shares;
        private int numberOfComments;
        private String postType;
        private ArrayList<String> hashtags;

        public FacebookPost(String postTitle, int likes, int shares, int numberOfComments, String postType,
                ArrayList<String> hashtags) {
            this.postTitle = postTitle;
            this.likes = likes;
            this.shares = shares;
            this.numberOfComments = numberOfComments;
            this.postType = postType;
            this.hashtags = hashtags;
        }

        public ArrayList<String> getHashtags() {
            return hashtags;
        }

        public String getPostTitle() {
            return postTitle;
        }

        public int getLikes() {
            return likes;
        }

        public int getShares() {
            return shares;
        }

        public int getNumberOfComments() {
            return numberOfComments;
        }

        public String getPostType() {
            return postType;
        }

        // Analyze content performance based on hashtags
        public Map<String, Integer> analyzeContentPerformance(ArrayList<String> hashtags) {
            Map<String, Integer> performanceMetrics = new HashMap<>();
            for (String hashtag : hashtags) {
                performanceMetrics.put(hashtag, performanceMetrics.getOrDefault(hashtag, 0) + 1);
            }
            return performanceMetrics;
        }
    }
}