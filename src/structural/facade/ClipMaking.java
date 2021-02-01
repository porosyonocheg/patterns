package structural.facade;

public class ClipMaking {
    public static void main(String[] args) {
        new Producer().createClip(new Clip("Happy New Year!", 250));
    }
}
