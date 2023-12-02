public class SocialMediaSharing {
    private Customer customer;

    public SocialMediaSharing(Customer customer) {
        this.customer = customer;
    }

    public void shareOnSocialMedia(String message) {
        System.out.println("Sharing on social media by " + customer.username + ": " + message);
    }
}
