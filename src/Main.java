import socialMedia.Facebook;
import socialMedia.Instagram;
import analysis.SocialMediaAnalyzer;
import analysis.UserMediaAnalyzer;

import java.io.*;
import java.util.*;

public class Main {
        public static void main(String[] args) {
                try {
                        // Define the file path for the output
                        File file = new File("results.txt");
                        FileWriter fw = new FileWriter(file);
                        BufferedWriter bw = new BufferedWriter(fw);
                        System.setOut(new PrintStream(new FileOutputStream(file)));

                        // Define post types and hashtags
                        String[] postType = { "pic", "vid", "pic", "pic", "pic", "vid", "vid", "vid", "pic", "pic" };
                        ArrayList<ArrayList<String>> hashtag = new ArrayList<>(Arrays.asList(
                                        new ArrayList<>(Arrays.asList("#a", "#b")),
                                        new ArrayList<>(Arrays.asList("#a")),
                                        new ArrayList<>(Arrays.asList("#b")),
                                        new ArrayList<>(Arrays.asList("#c", "#a")),
                                        new ArrayList<>(Arrays.asList("#c", "#a", "#s")),
                                        new ArrayList<>(Arrays.asList("#d", "#e", "#f")),
                                        new ArrayList<>(Arrays.asList("#g", "t")),
                                        new ArrayList<>(Arrays.asList("#h", "#i")),
                                        new ArrayList<>(Arrays.asList("#j", "#k", "#l")),
                                        new ArrayList<>(Arrays.asList("#m", "#y"))));

                        Map<String, Integer> hashtags1 = null;
                        int totalLikes = 0;
                        int totalComments = 0;
                        int totalShares = 0;
                        int totalPosts = 0;

                        // Perform analysis on Facebook posts
                        for (int i = 0; i < 10; i++) {
                                ArrayList<String> hashtagsList = hashtag.get(i);
                                // Instantiate FacebookPost with random data
                                Facebook.FacebookPost post = new Facebook.FacebookPost("Random" + i, 2 * i + 200,
                                                3 * i + 10, 4 * i + 40,
                                                postType[i], hashtagsList);
                                hashtags1 = post.analyzeContentPerformance(hashtagsList);
                                totalLikes += post.getLikes();
                                totalComments += post.getNumberOfComments();
                                totalShares += post.getShares();
                                totalPosts++;
                        }

                        // Display general analysis results for Facebook
                        System.out.println("With this analysis, we found that: in Facebook");
                        System.out.println("Total Likes: " + totalLikes);
                        System.out.println("Total Posts: " + totalPosts);
                        System.out.println("Total Comments: " + totalComments);
                        System.out.println("Total Shares: " + totalShares);

                        // Perform detailed analysis for Facebook
                        SocialMediaAnalyzer analyzer = new SocialMediaAnalyzer(
                                        totalLikes,
                                        totalComments,
                                        totalShares,
                                        totalPosts,
                                        hashtags1);
                        analyzer.performAllAnalysis();
                        System.out.println("General analysis completed\n");

                        // Reset variables for Instagram analysis
                        hashtags1 = null;
                        totalLikes = 0;
                        totalComments = 0;
                        totalPosts = 0;

                        // Perform analysis on Instagram posts
                        for (int i = 0; i < 10; i++) {
                                ArrayList<String> hashtagsList = hashtag.get(i);
                                // Instantiate InstagramPost with random data
                                Instagram.InstagramPost post = new Instagram.InstagramPost("Random" + i, "image" + i,
                                                "caption" + i, (2 * i) + 200, 3 * i + 10, postType[i], hashtag.get(i));

                                hashtags1 = post.analyzeContentPerformance(hashtagsList);
                                totalLikes += post.getLikes();
                                totalComments += post.getNumberOfComments();
                                totalPosts++;
                        }

                        // Display general analysis results for Instagram
                        System.out.println("With this analysis, we found that: in Instagram");
                        System.out.println("Total Likes: " + totalLikes);
                        System.out.println("Total Posts: " + totalPosts);
                        System.out.println("Total Comments: " + totalComments);
                        System.out.println("Total Shares: " + totalShares);

                        // Perform detailed analysis for Instagram
                        SocialMediaAnalyzer analyzerInstagram = new SocialMediaAnalyzer(
                                        totalLikes,
                                        totalComments,
                                        totalShares,
                                        totalPosts,
                                        hashtags1);
                        analyzerInstagram.performAllAnalysis();
                        System.out.println("General analysis completed\n");

                        // User data arrays
                        String[] users = { "user1", "user2", "user3", "user4", "user5", "user6", "user7", "user8",
                                        "user9", "user10" };
                        String[] genders = { "female", "female", "female", "female", "female", "male", "male", "female",
                                        "male", "male" };
                        int[] ages = { 46, 49, 33, 18, 35, 31, 35, 21, 34, 48 };
                        String[] platforms = { "twitter", "instagram", "instagram", "instagram", "instagram", "twitter",
                                        "facebook",
                                        "instagram", "facebook", "instagram" };
                        int[] followers = { 92, 940, 670, 554, 424, 117, 599, 559, 313, 558 };
                        int[] following = { 20, 503, 208, 987, 41, 259, 224, 565, 9, 171 };
                        int[] reelsCount = { 0, 10, 9, 3, 7, 5, 6, 5, 4, 5 };
                        int[] totalPostsArray = { 10, 9, 8, 4, 10, 6, 4, 5, 10, 3 };
                        int[] totalLikesArray = { 2171, 1535, 1639, 669, 1717, 1121, 599, 983, 1660, 666 };
                        int[] totalCommentsArray = { 258, 236, 252, 71, 278, 199, 157, 148, 282, 83 };
                        int[] totalSharesArray = { 103, 105, 98, 54, 111, 57, 48, 54, 140, 46 };

                        // Calculate user media statistics
                        int totalLikes1 = 0;
                        int totalComments1 = 0;
                        int totalShares1 = 0;
                        int totalPosts1 = 0;
                        int numberOfMales = 0;
                        int numberOfFemales = 0;
                        for (int i = 0; i < 10; i++) {
                                totalLikes1 += totalLikesArray[i];
                                totalComments1 += totalCommentsArray[i];
                                totalShares1 += totalSharesArray[i];
                                totalPosts1 += totalPostsArray[i];
                                if (Objects.equals(genders[i], "male")) {
                                        numberOfMales++;
                                } else {
                                        numberOfFemales++;
                                }
                        }

                        // Display user media analysis
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
                        System.out.println("With this analysis, we found that:");
                        System.out.println("Total Likes: " + totalLikes1);
                        System.out.println("Total Posts: " + totalPosts1);
                        System.out.println("Total Comments: " + totalComments1);
                        System.out.println("Total Shares: " + totalShares1);
                        System.out.println("Total Number of Males: " + numberOfMales);
                        System.out.println("Total Number of Females: " + numberOfFemales);
                        userAnalyzer.performAllAnalysis();

                        bw.close();
                } catch (IOException e) {
                        e.printStackTrace();
                }
        }
}