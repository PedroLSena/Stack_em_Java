package Page_ex;
import java.time.LocalDateTime;

public class Page {
    private String url;
    private LocalDateTime timestamp;

    public Page( String url, LocalDateTime timestamp){
        this.url = url;
        this.timestamp = timestamp;
    }

    public String getUrl(){
        return url;
    }

    public void setUrl(String url){
        this.url = url;
    }

    public LocalDateTime getTimeStamp(){
        return timestamp;
    }

    public void setTimeStamp( LocalDateTime timestamp){
        this.timestamp = timestamp;
    }

    public String toString() {
        return "Page{" +
                "url='" + url + ' ' +
                ", timeStamp ='" + timestamp + ' ' +
                '}';
    }

    
}
