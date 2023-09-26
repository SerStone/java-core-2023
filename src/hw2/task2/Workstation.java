package hw2.task2;

public class Workstation extends Laptop {
    VideoCard videoCard;

    public Workstation() {
    }

    public Workstation(String brand, int RAM, int storage, boolean coolerboast, int weight, VideoCard videoCard) {
        super(brand, RAM, storage, coolerboast, weight);
        this.videoCard = videoCard;
    }

    public VideoCard getVideoCard() {
        return videoCard;
    }

    public void setVideoCard(VideoCard videoCard) {
        this.videoCard = videoCard;
    }

    @Override
    public String toString() {
        return "Workstation{" +
                "videoCard=" + videoCard +
                '}' + super.toString();
    }
}
