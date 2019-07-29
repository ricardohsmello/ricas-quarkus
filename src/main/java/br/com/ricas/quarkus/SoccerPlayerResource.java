package br.com.ricas.quarkus;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Set;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


/**
 * @author ricardo.mello
 *
 */
@Path("/soccerPlayers")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class SoccerPlayerResource {

    private Set<SoccerPlayer> players = Collections.newSetFromMap(Collections.synchronizedMap(new LinkedHashMap<>()));

    public SoccerPlayerResource() {
        players.add(new SoccerPlayer("Neymar Jr", "Paris Saint-Germain"));
        players.add(new SoccerPlayer("Cristiano Ronaldo", "Juventus"));
        players.add(new SoccerPlayer("Lionel Messi", "Barcelona"));

    }

    @GET
    public Set<SoccerPlayer> list() {
        return players;
    }

    @POST
    public Set<SoccerPlayer> add(SoccerPlayer soccerPlayer) {
        players.add(soccerPlayer);
        return players;
    }

    @DELETE
    public Set<SoccerPlayer> delete(SoccerPlayer soccerPlayer) {
        players.remove(soccerPlayer);
        return players;
    }
}
