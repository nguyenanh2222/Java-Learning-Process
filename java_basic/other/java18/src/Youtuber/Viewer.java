package Youtuber;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Viewer {
    private final String id;
    private final String username;
    private final List<Youtuber> youtubers;
    private final List<String> notices;
    public Viewer(String id, String username) {
        this.id = id;
        this.username = username;
        this.youtubers = new ArrayList<Youtuber>();
        this.notices = new ArrayList<String>();

    }
    public void addNotice(String notice) {
        this.notices.add(notice);
        System.out.println(notice);
    }

        @Override
    public String toString() {
        return this.username;
    }


    public Boolean createYoutuber(Youtuber ytb) {
        {
            for (Youtuber item: this.youtubers)
            {
                if(item.username == ytb.username){
                    return Boolean.FALSE;
                }
            }
            this.youtubers.add(ytb);
            ytb.subscribed(this);
            return Boolean.TRUE;
        }
    }

    public Youtuber searchYoutuber(String username) {
        {
            for (Youtuber item: this.youtubers)
            {
                if (item.username == username) {
                    return item;
                }
            }
            return null;
        }
    }

    public Boolean deleteYoutuber(Youtuber ytb) {
        for (Youtuber item : this.youtubers) {
            if (Objects.equals(item, ytb)) {
                this.youtubers.remove(item);
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }
    public List<Youtuber> showListYoutubers() {
        if (this.youtubers.isEmpty()) {
            return null;
        } else {
            return this.youtubers;
        }
    }
}

