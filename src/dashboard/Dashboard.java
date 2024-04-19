package dashboard;

import java.util.List;
import java.util.Map;

public class Dashboard {
    // Method to display engagement rate
    public void displayEngagementRate(double engagementRate) {
        System.out.println("Engagement Rate: " + engagementRate);
    }

    // Method to display sentiment analysis
    public void displaySentimentAnalysis(String sentiment) {
        System.out.println("Sentiment Analysis: " + sentiment);
    }

    // Method to display audience demographics
    public void displayAudienceDemographics(Map<String, Integer> demographics) {
        System.out.println("Audience Demographics:");
        for (Map.Entry<String, Integer> entry : demographics.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    // Method to display top-performing posts
    public void displayTopPerformingPosts(List<String> topPosts) {
        System.out.println("Top Performing Posts:");
        for (String post : topPosts) {
            System.out.println(post);
        }
    }

    // Method to display content performance metrics
    public void displayContentPerformance(Map<String, Double> contentMetrics) {
        System.out.println("Content Performance Metrics:");
        for (Map.Entry<String, Double> entry : contentMetrics.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    // Method to display campaign effectiveness
    public void displayCampaignEffectiveness(Map<String, Double> campaignMetrics) {
        System.out.println("Campaign Effectiveness Metrics:");
        for (Map.Entry<String, Double> entry : campaignMetrics.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    // Additional methods for displaying other types of analytics data can be added here
}