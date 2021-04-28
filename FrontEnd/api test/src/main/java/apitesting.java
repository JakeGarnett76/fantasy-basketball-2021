import java.net.URLEncoder;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;

public class apitesting {
    public static void main(String[] args) throws Exception {
        final HttpResponse<String> response = Unirest.get("http://localhost:8080/entry/1").asString();
        System.out.println(response.getBody());

    }
}
