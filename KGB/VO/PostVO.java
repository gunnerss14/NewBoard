package KGB.VO;

public class PostVO {
    private int postSN;
    private String title;
    private String writeId;
    private String writePw;
    private String content;
    private String secretV;

    public int getPostSN() {
        return postSN;
    }

    public void setPostSN(int postSN) {
        this.postSN = postSN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getWriteId() {
        return writeId;
    }

    public void setWriteId(String writeId) {
        this.writeId = writeId;
    }

    public String getWritePw() {
        return writePw;
    }

    public void setWritePw(String writePw) {
        this.writePw = writePw;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSecretV() {
        return secretV;
    }

    public void setSecretV(String secretV) {
        this.secretV = secretV;
    }

    public String getwDate() {
        return wDate;
    }

    public void setwDate(String wDate) {
        this.wDate = wDate;
    }

    public int getHit() {
        return hit;
    }

    public void setHit(int hit) {
        this.hit = hit;
    }

    private String wDate;
    private int hit;



}
