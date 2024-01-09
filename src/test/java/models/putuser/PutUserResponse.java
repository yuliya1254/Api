package models.putuser;

import lombok.Data;

@Data
public class PutUserResponse {
    String name;
    String job;
    String updatedAt;
}
