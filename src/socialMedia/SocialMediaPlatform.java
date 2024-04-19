
package socialMedia;

public interface SocialMediaPlatform {
    String PLATFORM_NAME = "";
    String API_URL = "";

    // Method to fetch data from the social media platform
    String fetchData();

    void setApiUrl(String apiUrl);

    String getApiUrl();
}
