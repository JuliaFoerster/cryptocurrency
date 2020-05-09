package cryptocurrency;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProofOfWorkTest {

    String message = "Julia bought Bitcoins";

    @Test
    void shouldCreateHash() {
       int difficulty = 2;
       ProofOfWork pow = new ProofOfWork(difficulty);
       int nonce = pow.mine(message);

        assertEquals(348, nonce);
    }

    @Test
    void shouldCreateHashWithDifficulty1() {
        int difficulty = 1;
        ProofOfWork pow = new ProofOfWork(difficulty);
        int nonce = pow.mine(message);

        assertEquals(7, nonce);
    }
}