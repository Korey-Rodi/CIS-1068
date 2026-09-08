public class YoutubeVideoMain {
    public static void main(String[] args){
        YoutubeVideo [] videoPlaylist = new YoutubeVideo[3];

        // Video 1
        videoPlaylist[0] = new YoutubeVideo("First Video", "XKoreyX", 2, 1, 3, "10.5", "\t@Colin13b Great video man!");
        videoPlaylist[0].play();
        videoPlaylist[0].like();
        videoPlaylist[0].dislike();
        videoPlaylist[0].addComment("\t@Anon12 This video sucks man");
        videoPlaylist[0].addComment("\t@CPck Hey man what up");
        System.out.println(videoPlaylist[0]);

        // Video 2
        videoPlaylist[1] = new YoutubeVideo("Java Objects Tutorials", "CP123", 6, 5, 3, "46.5", "\t@xxkorey This was a great intro.");
        videoPlaylist[1].play();
        videoPlaylist[1].play();
        videoPlaylist[1].play();
        videoPlaylist[1].like();
        videoPlaylist[1].like();
        videoPlaylist[1].like();
        videoPlaylist[1].dislike();
        videoPlaylist[1].dislike();
        videoPlaylist[1].addComment("\t@rk36 This video did not work for me.");
        System.out.println(videoPlaylist[1]);

        // Video 3
        videoPlaylist[2] = new YoutubeVideo("Intro to Java", "Prof. Fiore", 0, 0, 0, "30.15", "\t@FioreHater Does anybody watch these lol");
        videoPlaylist[2].like();
        videoPlaylist[2].play();
        videoPlaylist[2].play();
        videoPlaylist[2].play();
        videoPlaylist[2].dislike();
        videoPlaylist[2].dislike();
        videoPlaylist[2].addComment("\t@ProfRosen L Python is better");
        System.out.println(videoPlaylist[2]);

    }
}
