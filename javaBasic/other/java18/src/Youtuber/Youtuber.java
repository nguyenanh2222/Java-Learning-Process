package Youtuber;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Youtuber {

    private final List<Video> videos;
    private final List<Viewer> viewers;
    private final List<String> notice;
    private final String id;
    final String username;

    public Youtuber(String id, String username ) {
        this.viewers = new ArrayList<Viewer>();
        this.id = id;
        this.username = username;
        this.videos = new ArrayList<Video>();
        this.notice = new ArrayList<String>();
    }

    @Override
    public String toString() {
        return "Youtuber{" +
                "videos=" + videos +
                ", viewers=" + viewers +
                ", notice=" + notice +
                ", id='" + id + '\'' +
                ", username='" + username + '\'' +
                '}';
    }

    public Video createVideo(Video video)
    {
        for (Video item: this.videos)
        {
            if (item.nameVideo == video.nameVideo) {
                return item;
            }
        }
        this.videos.add(video);
        for (Viewer viewer: this.viewers)
        {
            viewer.addNotice("New video "+ video +" by " + this.username);
            }
        return video;
    }

    public Video searchVideo(String nameVideo)
    {
        for (Video item: this.videos)
        {
            if (item.nameVideo == nameVideo) {
                return item;
            }
        }
        return null;
    }

    public Video updateVideo(String nameVideo, String contentUpdate, String nameVideoUpdate)
    {
        for (Video item: this.videos)
        {
            if (Objects.equals(item.nameVideo, nameVideo)) {
                item.updateVideo(nameVideoUpdate, contentUpdate);
                return item;
            }
        }
        return null;
    }

    public Boolean deleteVideo(String nameVideo) {
        for (Video item : this.videos) {
            if (Objects.equals(item.nameVideo, nameVideo)) {
                this.videos.remove(item);
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }
    public List<Video> show_listVideo() {
        if (this.videos.isEmpty()) {
            return null;
        } else {
            return this.videos;
            }
        }

    public void subscribed(Viewer viewer) {
        this.viewers.add(viewer);
        this.notice.add("subscribed by " + viewer);

    }
}

