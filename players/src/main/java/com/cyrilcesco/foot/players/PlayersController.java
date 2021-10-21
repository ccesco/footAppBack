package com.cyrilcesco.foot.players;

import com.cyrilcesco.foot.players.dto.Player;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class PlayersController {

    @GetMapping("/players")
    public List<Player> getPlayers() {
        return Arrays.asList(
                Player.builder().name("Cyril").build(),
                Player.builder().name("Messi").build(),
                Player.builder().name("Verratti").build()
        );
    }
}

