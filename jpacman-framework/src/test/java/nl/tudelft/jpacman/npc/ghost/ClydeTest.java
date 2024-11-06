package nl.tudelft.jpacman.npc.ghost;

import nl.tudelft.jpacman.board.BoardFactory;
import nl.tudelft.jpacman.level.Level;
import nl.tudelft.jpacman.level.LevelFactory;
import nl.tudelft.jpacman.npc.Ghost;
import nl.tudelft.jpacman.sprite.PacManSprites;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ClydeTest {

    private List<String> map;
    private GhostFactory creationGhost;
    private Clyde clyde;
    private LevelFactory creationlevel;
    private Level level;
    private GhostMapParser mapGhost;
    private PacManSprites pacMan;
    private BoardFactory creationboard;

    // @BeforeEach
    // Initialiser les objets dont nous avons besoin pour faire le niveau et la map
    void setup () {
        pacMan = new PacManSprites();
        creationboard = new BoardFactory(pacMan);
        creationGhost = new GhostFactory (pacMan);
        creationlevel = new LevelFactory(pacMan, creationGhost);
        mapGhost = new GhostMapParser(creationlevel, creationboard, creationGhost);

    }

    // @Test
    void testClydeAvanceReculePacMan () {
        // Création d'une map
        // map = Array.asList(
            //"############",
            //"#P________C#",
            //"############"
        // );
        // création d'un niveau
        // level = mapGhost.parceMap(map);

        // Savoir où se trouve Clyde et PacMan sur la map (position)
        //assertNotNull(clyde, "Clyde devrait être présent dans le niveau.");
        assertNotNull(pacMan, "PacMan devrait être présent dans le niveau.");

        
        
    }


    // variable à tester
    // On peut def la direction vers laquelle regarde Clyde
    // Créer notre level, layout (map), ...
    // En fct de la map, le comportement clyde change
}
