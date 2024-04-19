package socialMedia;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Instagram implements SocialMediaPlatform {
    private String apiUrl;
    private int numberOfPosts;

    public Instagram(String apiUrl, int numberOfPosts) {
        this.apiUrl = apiUrl;
        this.numberOfPosts = numberOfPosts;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    @Override
    public String fetchData() {
        // Placeholder code to simulate fetching data from Instagram API
        return "Data fetched from Instagram";
    }

    @Override
    public void setApiUrl(String apiUrl) {
        this.apiUrl = apiUrl;
    }

    @Override
    public String getApiUrl() {
        return apiUrl;
    }

    // Inner class representing an Instagram post
    public class InstagramPost {
        private String postTitle;
        private String image;
        private String caption;
        private int likes;
        private int numberOfComments;
        private String postType;
        private ArrayList<String> hashtags;

        public InstagramPost(String postTitle, String image, String caption, int likes, int numberOfComments,
                String postType, ArrayList<String> hashtags) {
            this.postTitle = postTitle;
            this.image = image;
            this.caption = caption;
            this.likes = likes;
            this.numberOfComments = numberOfComments;
            this.postType = postType;
            this.hashtags = hashtags;
        }

        public String getImage() {
            return image;
        }

        public ArrayList<String> getHashtags() {
            return hashtags;
        }

        public String getPostTitle() {
            return postTitle;
        }

        public String getCaption() {
            return caption;
        }

        public int getLikes() {
            return likes;
        }

        public int getNumberOfComments() {
            return numberOfComments;
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