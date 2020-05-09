package cryptocurrency;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang3.StringUtils;


public class ProofOfWork {

    private final String prefix;

    public ProofOfWork(int difficulty){
        this.prefix = StringUtils.repeat("0", difficulty);;
    }

    public int mine(String message) {
        String value = "";
        int nonce = 0;
        while (!value.startsWith(prefix)) {
            nonce += 1;
            value = DigestUtils.sha256Hex("" + nonce + " " + message);
        }

        return nonce;
    }

}
