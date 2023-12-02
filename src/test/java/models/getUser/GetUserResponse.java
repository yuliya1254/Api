package models.getUser;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class GetUserResponse {
    Integer page;
    @JsonProperty("per_page")
    String perPage;
    String total;
    @JsonProperty("total_pages")
    String totalPages;

    UserData[] data;

    UserSupport support;

    @Data
    public static class UserData {
        Integer id;
        String email;
        @JsonProperty("first_name")
        String firstName;
        @JsonProperty("last_name")
        String lastName;
        String avatar;
    }

    @Data
    public static class UserSupport {
        String url;
        String text;
    }


}
