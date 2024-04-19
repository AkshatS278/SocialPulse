package socialMedia;

import user.User;

import java.util.ArrayList;

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
        // json file read krna h

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
    public class FacebookPost {
        private String postTitle;
        private int likes;
        private int shares;
        private int numberOfComments;
        private String postType;
        private ArrayList<String> hashtags;

        public FacebookPost(String postTitle, int likes, int shares, int numberOfComments, String postType, ArrayList<String> hashtags) {
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
    }
}