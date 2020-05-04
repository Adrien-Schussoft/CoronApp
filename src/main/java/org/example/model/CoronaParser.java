package org.example.model;

import org.json.JSONObject;
import java.io.IOException;

public interface CoronaParser {

    public JSONObject parserUniv(String country) throws IOException;
}
