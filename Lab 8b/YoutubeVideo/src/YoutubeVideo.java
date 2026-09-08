public class YoutubeVideo {
    String title;
    String uploader;
    int views;
    int likes;
    int dislikes;
    String duration;
    String comments;

    public YoutubeVideo(String t, String user, int plays,
    int likesNum, int dislikesNum, String length, String responses) {
        title = t;
        uploader = user;
        views = plays;
        likes = likesNum;
        dislikes = dislikesNum;
        duration = length;
        comments = responses + "\n";
    }
    public void play() {
        // Line commented out so views can be updated multiple times
        //System.out.println("Now Playing: " + title);
        views++;
    }
    public void like() {
        likes++;

    }
    public void dislike(){
        dislikes++;
    }
    public void addComment(String comment){
        comments += comment + "\n";
    }
    public String toString(){
        return "Title: " + title + "\nUploader: " + uploader
        + "\nViews: " + views + "\nLikes: " + likes + "\nDislikes: " + dislikes
        + "\nDuration: " + duration + " Minutes" + "\nComments:\n" + comments;
    }
}
