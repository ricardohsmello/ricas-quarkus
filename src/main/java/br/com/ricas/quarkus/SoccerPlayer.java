package br.com.ricas.quarkus;

import java.util.Objects;

/**
 * @author ricardo.mello
 *
 */
public class SoccerPlayer {

    private String player;

    private String team;

	public String getPlayer() {
		return player;
	}

	public void setPlayer(String player) {
		this.player = player;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public SoccerPlayer() {
    }

    public SoccerPlayer(String player, String team) {
        this.player = player;
        this.team = team;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof SoccerPlayer)) {
            return false;
        }

        SoccerPlayer other = (SoccerPlayer) obj;

        return Objects.equals(other.player, this.player);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.player);
    }
}
