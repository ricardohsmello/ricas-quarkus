package br.com.ricas.quarkus.test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.containsInAnyOrder;

import javax.ws.rs.core.MediaType;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class SoccerPlayerResourceTest {

    @Test
    public void testList() {
        given()
          .when().get("/soccerPlayers")
          .then()
             .statusCode(200)
             .body("$.size()", is(2),
                     "player", containsInAnyOrder("Ronaldinho Gaúcho", "Barcelona"),
                     "team", containsInAnyOrder("Barcelona", "Real Madrid"));
    }

    @Test
    public void testAdd() {
        given()
            .body("{\"player\": \"Ronaldinho Gaúcho\", \"team\": \"Barcelona\"}")
            .header("Content-Type", MediaType.APPLICATION_JSON)
        .when()
            .post("/soccerPlayers")
        .then()
            .statusCode(200)
            .body("$.size()", is(3),
                    "player", containsInAnyOrder("Ronaldinho Gaúcho", "Barcelona", "Real Madrid"),
                    "team", containsInAnyOrder("Barcelona", "Real Madrid", "Real Madrid"));

        given()
            .body("{\"player\": \"Ronaldinho Gaúcho\", \"team\": \"Real Madrid\"}")
            .header("Content-Type", MediaType.APPLICATION_JSON)
        .when()
            .delete("/soccerPlayers")
        .then()
            .statusCode(200)
            .body("$.size()", is(2),
                    "player", containsInAnyOrder("Ronaldinho Gaúcho", "Real Madrid"),
                    "team", containsInAnyOrder("Real Madrid", "Barcelona"));
    }
}
