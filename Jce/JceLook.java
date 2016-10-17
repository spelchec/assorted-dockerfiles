import java.security.Provider;
import java.security.Security;
/**
	Code made available from: 
	http://mindprod.com/jgloss/jce.html
	http://stackoverflow.com/questions/14903539/what-specific-hash-algorithm-does-messagedigest-getinstancesha-return
*/
public class JceLook {

    public static void main(String[] args) {
        System.out.println("Algorithms Supported in this JCE.");
        System.out.println("====================");
        // heading
        System.out.println("Provider: type.algorithm -> className" + "\n  aliases:" + "\n  attributes:\n");
        // discover providers
        Provider[] providers = Security.getProviders();
        for (Provider provider : providers) {
            System.out.println("<><><>" + provider + "<><><>\n");
            // discover services of each provider
            for (Provider.Service service : provider.getServices()) {
                System.out.println(service);
            }
            System.out.println();
        }
    }
}
