package analysis;

import java.util.Map;

public class SocialMediaAnalyzer {

    Map<String, Integer> Hashtags;
    int totalLikes;
    int totalComments;
    int totalShares;
    int totalPosts;
    double engagementRate;
    String maxHastags;

    public String getHastags() {
        return maxHastags;
    }

    public double getEngagementRate() {
        return engagementRate;
    }

    public SocialMediaAnalyzer(int totalLikes, int totalComments, int totalShares, int totalPosts,
                               Map<String, Integer> Hashtags, String platformString) {
        this.Hashtags = Hashtags;
        this.totalLikes = totalLikes;
        this.totalComments = totalComments;
        this.totalShares = totalShares;
        this.totalPosts = totalPosts;
    }

    public void performAllAnalysis() {
        calculateEngagementRate engagementRate = new calculateEngagementRate(totalLikes, totalComments, totalShares,
                totalPosts);
        performHashtagAnalysis hashtagAnalysis = new performHashtagAnalysis(Hashtags);
        hashtagAnalysis.run();
        engagementRate.run();
        this.maxHastags = hashtagAnalysis.getMaxHashtags();
        this.engagementRate = engagementRate.getEngagementRate();
        System.out.println("Finished Analysis.");
    }
}

class calculateEngagementRate implements Runnable {

    int totalLikes;
    int totalComments;
    int totalShares;
    int totalPosts;
    double engagementRate;

    public calculateEngagementRate(int totalLikes, int totalComments, int totalShares, int totalPosts) {
        this.totalLikes = totalLikes;
        this.totalComments = totalComments;
        this.totalShares = totalShares;
        this.totalPosts = totalPosts;
    }

    public double getEngagementRate() {
        return engagementRate;
    }

    public void run() {
        try {
            engagementRate = ((double) (totalLikes + totalComments + totalShares) / totalPosts);
        } catch (Exception e) {
            System.out.println("This account does not have any posts.");
        }
    }
}

class performHashtagAnalysis implements Runnable {

    Map<String, Integer> Hashtags;
    String keyWithMaxValue = null;

    public performHashtagAnalysis(Map<String, Integer> Hashtags) {
        this.Hashtags = Hashtags;
    }

    public String getMaxHashtags() {
        return keyWithMaxValue;
    }

    public void run() {
        try {

            int maxValue = Integer.MIN_VALUE;

            for (Map.Entry<String, Integer> entry : Hashtags.entrySet()) {
                if (entry.getValue() > maxValue) {
                    maxValue = entry.getValue();
                    keyWithMaxValue = entry.getKey();
                }
            }

            System.out.println("Most used Hashtag: " + keyWithMaxValue);

        } catch (Exception e) {
            System.out.println("Exception caught.");
        }
    }
}