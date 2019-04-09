import org.apache.commons.codec.binary.Base64;

public class BasicAuth {
    public static String createBasicAuthHeader(String username, String password) {
        String credentials = username + ":" + password;
        String encodedCredentials = new String(Base64.encodeBase64(credentials.getBytes()));
        return "Basic " + encodedCredentials;
    }
}
