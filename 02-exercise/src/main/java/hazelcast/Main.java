package hazelcast;

import com.hazelcast.config.Config;
import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.core.IMap;
import java.io.IOException;

/**
 *
 * @author Ondrej Mihalyi
 */
public class Main {
    public static void main(String[] args) throws IOException {
        /* spustite program s Hazelcast
        http://docs.hazelcast.org/docs/latest-dev/manual/html-single/index.html#starting-the-member-and-client
         */
        HazelcastInstance hazelcast = Hazelcast.newHazelcastInstance(new Config());
        
        IMap<Object, Object> workshop = ;
        
        workshop.put("company", "AspectWorks");
        
        // pozdrzi program aby sa skoncil az po stlaceni Enter
        System.in.read();
    }
}

