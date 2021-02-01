package structural.facade;

public class Producer {
    Casting casting = new Casting();
    Director director = new Director();
    Editing editing = new Editing();
    SocialMedia socialMedia = new SocialMedia();
    public Producer() {
    }

    public void createClip(Clip clip) {
    casting.selectScreenWriter(clip.monetaryValue/10);
    casting.selectActors(clip.monetaryValue/5);
    director.makeClip(clip.monetaryValue/2);
    editing.cut(clip.monetaryValue * 2 / 5);
    socialMedia.promote(clip.song, clip.monetaryValue * 3 / 10);
    }

}
