package pr22;

public class Client {
    private Chair chair;

    public void setChair(Chair chair) {
        this.chair = chair;
    }

    public Chair chair() {
        return chair;
    }

    public void sit() {
        chair.sitClient();
    }
}

