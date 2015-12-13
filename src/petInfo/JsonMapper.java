package petInfo;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import org.codehaus.jackson.map.DeserializationConfig.*;
import org.springframework.core.serializer.DefaultSerializer;

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
                log.debug("catch in json mapper" + e);
            } catch (IOException e) {
                log.debug("catch in json mapper" + e);
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
                log.info("IN JSON MAPPER data " + data);
                log.info("IN JSON MAPPER type " + type);
                log.info("IN JSON MAPPER readValue: " + jsonMapper.readValue(data, type));
                return jsonMapper.readValue(data, type);

            } catch (JsonMappingException e) {
                log.info("catch in json mapper" + e);
            } catch (JsonParseException e) {
                log.info("catch in json mapper" + e);
            } catch (IOException e) {
                log.info("catch in json mapper" + e);
            }
            return null;
        }
}
