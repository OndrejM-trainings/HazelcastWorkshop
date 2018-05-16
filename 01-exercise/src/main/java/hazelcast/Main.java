package hazelcast;

import com.hazelcast.core.Hazelcast;
import java.io.IOException;

/**
 *
 * @author Ondrej Mihalyi
 */
public class Main {
    public static void main(String[] args) throws IOException {
        /* Uloha - spustite program s Hazelcast
          http://docs.hazelcast.org/docs/latest-dev/manual/html-single/index.html#starting-the-member-and-client
        */
        Hazelcast.newHazelcastInstance(cfg);
        
        // pozdrzi program aby sa skoncil az po stlaceni Enter
        System.in.read();
    }
}

