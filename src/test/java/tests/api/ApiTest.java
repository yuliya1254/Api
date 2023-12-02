package tests.api;

import io.qameta.allure.Feature;
import models.createPostUser.CreatePostUserRequest;
import models.createPostUser.CreatePostUserResponse;
import models.getUser.GetUserResponse;
import models.patchUser.PatchUserRequest;
import models.patchUser.PatchUserResponse;
import models.putUser.PutUserRequest;
import models.putUser.PutUserResponse;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;
import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static specs.TestSpecs.*;


public class ApiTest extends TestBase {

    @Feature("Работа с пользователями")
    @DisplayName("Создать нового пользователя")
    @Test
    void createPostUserTest() {
        CreatePostUserRequest request = new CreatePostUserRequest();
        request.setName("morpheus");
        request.setJob("leader");

        CreatePostUserResponse user = step("Создать нового пользователя", () ->
                given(bodyRequestSpec)
                        .body(request)
                        .when()
                        .post("/users")
                        .then()
                        .spec(responseSpec)
                        .statusCode(201)
                        .extract().as(CreatePostUserResponse.class));

        step("Проверить пользовательские данные", () -> {
            assertEquals("morpheus", user.getName());
            assertEquals("leader", user.getJob());

        });
    }


    @Test
    void getUserTest() {

        GetUserResponse users = step("Получение списка пользователей", () ->
                given(withoutBodyRequestSpec)
                        .when()
                        .get("users?delay=3")
                        .then()
                        .spec(responseSpec)
                        .statusCode(200)
                        .extract().as(GetUserResponse.class));

        step("Проверить полученный список", () -> {
            assertEquals(1, users.getPage());
            assertEquals("george.bluth@reqres.in", users.getData()[0].getEmail());
            assertEquals("https://reqres.in/#support-heading", users.getSupport().getUrl());


        });

    }

    @Test
    void putUserTest() {

        PutUserRequest request = new PutUserRequest();
        request.setName("morpheus");
        request.setJob("leader");

        PutUserResponse user = step("Изменить пользовательские данные", () ->
                given(bodyRequestSpec)
                        .body(request)
                        .when()
                        .put("/users/2")
                        .then()
                        .spec(responseSpec)
                        .statusCode(200)
                        .extract().as(PutUserResponse.class));
        step("Проверить пользовательские данные", () -> {
            assertEquals("morpheus", user.getName());
            assertEquals("leader", user.getJob());

        });
    }

    @Test
    void deleteUserTest() {

        step("Удаление пользователя", () ->
                given(withoutBodyRequestSpec)
                        .when()
                        .delete("users?delay=3")
                        .then()
                        .spec(withoutResponseSpec)
                        .statusCode(204));
    }

    @Test
    void patchUserTest() {

        PatchUserRequest request = new PatchUserRequest();
        request.setName("morpheus");
        request.setJob("zion resident");

        PatchUserResponse user = step("Изменить частично пользовательские данные", () ->
                given(bodyRequestSpec)
                        .body(request)
                        .when()
                        .patch("/users/2")
                        .then()
                        .spec(responseSpec)
                        .statusCode(200)
                        .extract().as(PatchUserResponse.class));
        step("Проверить пользовательские данные", () -> {
            assertEquals("morpheus", user.getName());
            assertEquals("zion resident", user.getJob());

        });


    }
}
