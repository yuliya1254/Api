package tests.api;

import io.qameta.allure.Feature;
import models.getuser.GetUserResponse;
import models.usermodel.UserModelRequest;
import models.usermodel.UserModelResponse;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;
import static io.restassured.RestAssured.given;
import static org.assertj.core.api.Assertions.assertThat;
import static specs.TestSpecs.*;


@Feature("Работа с пользователями")
public class UserTest extends TestBase {
    @DisplayName("Создать нового пользователя")
    @Test
    void createPostUserTest() {
        UserModelRequest request = new UserModelRequest();
        request.setName("morpheus");
        request.setJob("leader");

        UserModelResponse user = step("Создать нового пользователя", () ->
                given(bodyRequestSpec)
                        .body(request)
                        .when()
                        .post("/users")
                        .then()
                        .spec(responseSpec)
                        .statusCode(201)
                        .extract().as(UserModelResponse.class));

        step("Проверить имя пользователя", () ->
                assertThat(user.getName()).
                        isEqualTo("morpheus"));
        step("Проверить должность пользователя", () ->
                assertThat(user.getJob()).
                        isEqualTo("leader"));

    }

    @DisplayName("Получение списка пользователей")
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

        step("Проверить Email пользователя", () ->
                assertThat(users.getData()[0].getEmail()).
                        isEqualTo("george.bluth@reqres.in"));
        step("Проверить ссылку на сайт поддержки", () ->
                assertThat(users.getSupport().getUrl()).
                        isEqualTo("https://reqres.in/#support-heading"));

    }

    @DisplayName("Изменение данных пользователя")
    @Test
    void putUserTest() {

        UserModelRequest request = new UserModelRequest();
        request.setName("morpheus");
        request.setJob("leader");

        UserModelResponse user = step("Изменить пользовательские данные", () ->
                given(bodyRequestSpec)
                        .body(request)
                        .when()
                        .put("/users/2")
                        .then()
                        .spec(responseSpec)
                        .statusCode(200)
                        .extract().as(UserModelResponse.class));

        step("Проверить имя пользователя", () ->
                assertThat(user.getName()).
                        isEqualTo("morpheus"));
        step("Проверить должность пользователя", () ->
                assertThat(user.getJob()).
                        isEqualTo("leader"));
    }

    @DisplayName("Удаление пользователя")
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

    @DisplayName("Изменение данных пользователя (не полное)")
    @Test
    void patchUserTest() {

        UserModelResponse request = new UserModelResponse();
        request.setName("morpheus");
        request.setJob("zion resident");

        UserModelResponse user = step("Изменить частично пользовательские данные", () ->
                given(bodyRequestSpec)
                        .body(request)
                        .when()
                        .patch("/users/2")
                        .then()
                        .spec(responseSpec)
                        .statusCode(200)
                        .extract().as(UserModelResponse.class));

        step("Проверить имя пользователя", () ->
                assertThat(user.getName()).
                        isEqualTo("morpheus"));
        step("Проверить должность пользователя", () ->
                assertThat(user.getJob()).
                        isEqualTo("zion resident"));


    }
}
