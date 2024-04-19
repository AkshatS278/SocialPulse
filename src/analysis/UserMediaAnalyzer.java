package analysis;

import java.util.HashMap;
import java.util.Map;

public class UserMediaAnalyzer {

    Map<String, Integer> hashtags;
    int totalLikes;
    int totalComments;
    int totalShares;
    int totalPosts;
    double engagementRate;
    String[] users;
    String[] genders;
    int[] ages;
    String[] platforms;
    int[] followers;
    int[] following;
    int[] reelsCount;

    // Constructor
    public UserMediaAnalyzer(String[] users, String[] genders, int[] ages, String[] platforms, int[] followers,
            int[] following, int[] reelsCount, int... interactions) {
        this.users = users;
        this.genders = genders;
        this.ages = ages;
        this.platforms = platforms;
        this.followers = followers;
        this.following = following;
        this.reelsCount = reelsCount;
        this.totalLikes = interactions[0];
        this.totalComments = interactions[1];
        this.totalShares = interactions[2];
        this.totalPosts = interactions[3];
    }

    public UserMediaAnalyzer(String[] users, String[] genders, int[] ages, String[] platforms, int[] followers,
            int[] following, int[] reelsCount, int totalLikes, int totalComments, int totalShares, int totalPosts) {
        this.users = users;
        this.genders = genders;
        this.ages = ages;
        this.platforms = platforms;
        this.followers = followers;
        this.following = following;
        this.reelsCount = reelsCount;
        this.totalLikes = totalLikes;
        this.totalComments = totalComments;
        this.totalShares = totalShares;
        this.totalPosts = totalPosts;
    }

    // Perform all analysis
    public void performAllAnalysis() {
        calculateEngagementRate();
        calculateAverageLikes();
        calculateAverageComments();
        calculateAverageShares();
        analyzeByGender();
        System.out.println("Finished Analysis.");
    }

    // Calculate engagement rate
    private void calculateEngagementRate() {
        try {
            engagementRate = ((double) (totalLikes + totalComments + totalShares) / totalPosts);
        } catch (Exception e) {
            System.out.println("Error calculating engagement rate: " + e.getMessage());
        }
    }

    // Calculate average likes per post
    private void calculateAverageLikes() {
        double averageLikes = ((double) totalLikes) / totalPosts;
        System.out.println("Average Likes per Post: " + averageLikes);
    }

    // Calculate average comments per post
    private void calculateAverageComments() {
        double averageComments = ((double) totalComments) / totalPosts;
        System.out.println("Average Comments per Post: " + averageComments);
    }

    // Calculate average shares per post
    private void calculateAverageShares() {
        double averageShares = ((double) totalShares) / totalPosts;
        System.out.println("Average Shares per Post: " + averageShares);
    }

    // Analyze data by gender
    private void analyzeByGender() {
        Map<String, Integer> likesByGender = new HashMap<>();
        Map<String, Integer> commentsByGender = new HashMap<>();
        Map<String, Integer> sharesByGender = new HashMap<>();

        // Initialize counters for each gender
        likesByGender.put("male", 0);
        likesByGender.put("female", 0);
        commentsByGender.put("male", 0);
        commentsByGender.put("female", 0);
        sharesByGender.put("male", 0);
        sharesByGender.put("female", 0);

        // Calculate totals for each gender
        for (int i = 0; i < users.length; i++) {
            String gender = genders[i];
            likesByGender.put(gender, likesByGender.getOrDefault(gender, 0) + totalLikes / users.length);
            commentsByGender.put(gender, commentsByGender.getOrDefault(gender, 0) + totalComments / users.length);
            sharesByGender.put(gender, sharesByGender.getOrDefault(gender, 0) + totalShares / users.length);
        }

        // Output results
        System.out.println("Analysis by Gender:");
        System.out.println("Male - Average Likes: " + likesByGender.get("male") + ", Average Comments: "
                + commentsByGender.get("male") + ", Average Shares: " + sharesByGender.get("male"));
        System.out.println("Female - Average Likes: " + likesByGender.get("female") + ", Average Comments: "
                + commentsByGender.get("female") + ", Average Shares: " + sharesByGender.get("female"));
    }

    // Getter for engagement rate
    public double getEngagementRate() {
        return engagementRate;
    }
}