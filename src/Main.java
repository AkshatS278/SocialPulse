import analysis.SocialMediaAnalyzer;
import analysis.UserMediaAnalyzer;
import socialMedia.Facebook;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String[] posttype = { "pic", "vid", "pic", "pic", "pic", "vid", "vid", "vid", "pic", "pic" };
        // Define arrays for hashtags
        ArrayList<ArrayList<String>> hashtag = new ArrayList<>(Arrays.asList(
                new ArrayList<>(Arrays.asList("#a", "#b")),
                new ArrayList<>(Arrays.asList("#a")),
                new ArrayList<>(Arrays.asList("#b")),
                new ArrayList<>(Arrays.asList("#c", "#a")),
                new ArrayList<>(Arrays.asList("#c", "#a", "#s")) // Adding an empty list for the 5th user
        ));

        // Adding content to the remaining users
        hashtag.add(new ArrayList<>(Arrays.asList("#d", "#e", "#f"))); // User 6
        hashtag.add(new ArrayList<>(Arrays.asList("#g", "t"))); // User 7
        hashtag.add(new ArrayList<>(Arrays.asList("#h", "#i"))); // User 8
        hashtag.add(new ArrayList<>(Arrays.asList("#j", "#k", "#l"))); // User 9
        hashtag.add(new ArrayList<>(Arrays.asList("#m", "#y"))); // User 10

        // Initialize variables
        Map<String, Integer> hashtags1 = null;
        int totalLikes = 0;
        int totalComments = 0;
        int totalShares = 0;
        int totalPosts = 0;

        // Loop through the hashtags and perform analysis
        for (int i = 0; i < 10; i++) {
            ArrayList<String> hashtags = hashtag.get(i);
            // Replace Facebook.FacebookPost with your actual class and constructor
            // parameters accordingly
            Facebook.FacebookPost post = new Facebook.FacebookPost("Random" + i, 2 * i + 200, 3 * i + 10, 4 * i + 40,
                    posttype[i], hashtags);
            hashtags1 = post.analyzeContentPerformance(hashtags);
            totalLikes += post.getLikes();
            totalComments += post.getNumberOfComments();
            totalShares += post.getShares();
            totalPosts++;
        }

        // Create an instance of SocialMediaAnalyzer
        SocialMediaAnalyzer analyzer = new SocialMediaAnalyzer(
                totalLikes,
                totalComments,
                totalShares,
                totalPosts,
                hashtags1);

        // Perform all analysis
        analyzer.performAllAnalysis();
        System.out.println("General analysis completed");
        // Define user data arrays
        String[] users = { "user1", "user2", "user3", "user4", "user5", "user6", "user7", "user8", "user9", "user10" };
        String[] genders = { "female", "female", "female", "female", "female", "male", "male", "female", "male",
                "male" };
        int[] ages = { 46, 49, 33, 18, 35, 31, 35, 21, 34, 48 };
        String[] platforms = { "twitter", "instagram", "instagram", "instagram", "instagram", "twitter", "facebook",
                "instagram", "facebook", "instagram" };
        int[] followers = { 92, 940, 670, 554, 424, 117, 599, 559, 313, 558 };
        int[] following = { 20, 503, 208, 987, 41, 259, 224, 565, 9, 171 };
        int[] reelsCount = { 0, 10, 9, 3, 7, 5, 6, 5, 4, 5 };
        int[] totalPostsArray = { 10, 9, 8, 4, 10, 6, 4, 5, 10, 3 }; // Renamed to avoid conflict with the variable name
        int[] totalLikesArray = { 2171, 1535, 1639, 669, 1717, 1121, 599, 983, 1660, 666 }; // Renamed to avoid conflict
                                                                                            // with the variable name
        int[] totalCommentsArray = { 258, 236, 252, 71, 278, 199, 157, 148, 282, 83 }; // Renamed to avoid conflict with
                                                                                       // the variable name
        int[] totalSharesArray = { 103, 105, 98, 54, 111, 57, 48, 54, 140, 46 }; // Renamed to avoid conflict with the
                                                                                 // variable name

        int totalLikes1 = 0; // Renamed to avoid conflict with the variable name
        int totalComments1 = 0; // Renamed to avoid conflict with the variable name
        int totalShares1 = 0; // Renamed to avoid conflict with the variable name
        int totalPosts1 = 0; // Renamed to avoid conflict with the variable name

        // Loop through the data and calculate totals
        for (int i = 0; i < 10; i++) {
            totalLikes1 += totalLikesArray[i];
            totalComments1 += totalCommentsArray[i];
            totalShares1 += totalSharesArray[i];
            totalPosts1 += totalPostsArray[i];
        }

        // Print user media analysis
        UserMediaAnalyzer userAnalyzer = new UserMediaAnalyzer(
                users,
                genders,
                ages,
                platforms,
                followers,
                following,
                reelsCount,
                totalPosts1,
                totalLikes1,
                totalComments1,
                totalShares1);
        userAnalyzer.performAllAnalysis();
    }

}