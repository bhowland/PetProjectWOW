package petInfo;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

/**
 * Created by benjaminhowland on 12/3/15.
 */
public class JsonMapper {
    static Logger log = Logger.getLogger(JsonMapper.class.getName());


        public static ObjectMapper jsonMapper = new ObjectMapper();


        /**
         * Encode any instance to the JSON string
         *
         * @param data Object to be converted to JSON string
         * @return String json string of Object
         */
        public static <T> String encode(T data) {
            try {
                return jsonMapper.writeValueAsString(data);
            } catch (JsonProcessingException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return "{}";
        }

        /**
         * Decode any instance to the mapped Java Class
         *
         * @param data JSON string to be converted to Java Object
         * @param <T>  Class file of object to be converted to Object
         *
         * @return Class Instance
         */
        public static <T> T decode(String data, Class<T> type) {
            try {
                System.out.println("IN MAPPER data " + data);
                System.out.println("IN MAPPER type " + type);
                System.out.println("IN MAPPER readValue: " + jsonMapper.readValue(data, type));
                return jsonMapper.readValue(data, type);

            } catch (JsonMappingException e) {
                e.printStackTrace();
            } catch (JsonParseException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }
}
