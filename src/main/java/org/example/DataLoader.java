package org.example;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DataLoader {
    private List<Room> rooms = new ArrayList<>();

    public void loadRoomsData() {
        JSONParser parser;
        FileReader reader;
        Object obj;
        JSONArray jsonArray;

        try {
            parser = new JSONParser();
            reader = new FileReader("rooms.json");
            obj = parser.parse(reader);

            jsonArray = (JSONArray) obj;
            for (Object o : jsonArray) {
                JSONObject roomJson = (JSONObject) o;

                Room room = new Room();
                room.setName(roomJson.get("name").toString());
                room.setDescription(roomJson.get("description").toString());
                room.setNorth((int)roomJson.get("north"));
                room.setSouth((int)roomJson.get("south"));
                room.setEast((int)roomJson.get("east"));
                room.setWest((int)roomJson.get("west"));

                rooms.add(room);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
