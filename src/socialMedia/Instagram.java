package socialMedia;

import java.util.ArrayList;

public class Instagram implements SocialMediaPlatform {
    private String apiUrl;
    private int numberOfPosts;


    public Instagram(String apiUrl,  int numberOfPosts) {
        this.apiUrl = apiUrl;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    @Override
    public String fetchData() {
       // json file read krna h
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

    // creating a class of insta post using the data
    public class InstagramPost {
        private String postTitle;
        private String image;
        private String caption;
        private int likes;
        private int numberOfComments;
        private String postType;
        private ArrayList<String> hashtags;


        public InstagramPost(String postTitle, String image, String caption, int likes, int numberOfComments, String postType, ArrayList<String> hashtags) {
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

        public int getComments() {
            return numberOfComments;
        }
    }
}