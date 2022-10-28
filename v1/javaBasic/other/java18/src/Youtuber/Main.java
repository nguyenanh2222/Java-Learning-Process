package Youtuber;

public class Main {
    public static void main(String[] args) {
    /*
    Xây dựng các classes và/hoặc interfaces: Youtuber, Viewer, Video và các interface hỗ trợ khác để
    triển khai ngữ cảnh bài toán sau:
    a. Youtuber có thể quản lý danh sách video và viewer của mình. Bao gồm các thao tác: thêm
    mới, tìm kiểm, cập nhật, xóa, xuất danh sách.
    b. Viewer có thể quản lý danh sách các youtuber của mình. Bao gồm các thao tác: thêm mới,
    tìm kiểm, cập nhật, xóa, xuất danh sách.
    Viết hàm main thể hiện kịch bản ứng với các chức năng đã xây dưng.
    */

    Youtuber ytb = new Youtuber( "id", "Viet");
    System.out.println(ytb);

    Video video = new Video("Music", "Vạt nắng bên thềm");
//    ytb.createVideo("name_video");
//    System.out.println(ytb.createVideo(video));
//    ytb.searchVideo("name_video");
//    ytb.updateVideo("Trên tầng lầu");
//    System.out.println(ytb.updateVideo("Vạt nắng bên thềm", "music", ""));

//    ytb.deleteVideo("name_video");
//    ytb.show_listVideo();
    Viewer viewer = new Viewer("id", "username");
    viewer.createYoutuber(ytb);
    System.out.println(viewer.createYoutuber(ytb));
    System.out.println(ytb);
    ytb.createVideo(video);
    System.out.println(viewer);

//    viewer.searchYoutuber("username"); // Viewer list sub
////    viewer.updateYoutuber(ytb);
//    viewer.deleteYoutuber(ytb); // Viewer list sub

        }
}