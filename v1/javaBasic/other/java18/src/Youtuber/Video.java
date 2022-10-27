package Youtuber;

public class Video {

     String content;
     String nameVideo;

    public Video(String content, String nameVideo) {
        this.content = content;
        this.nameVideo = nameVideo;
    }

    public Boolean updateVideo(String nameVideo, String content) {
        if (nameVideo != "" ){
            this.nameVideo = nameVideo;
        }
        if (content != ""){
            this.content = content;
        }
        if (nameVideo == "" && content == ""){
            return Boolean.FALSE;
        }
        return Boolean.TRUE;

    }

    @Override
    public String toString() {
        return this.nameVideo + "  " +this.content;
    }
}
