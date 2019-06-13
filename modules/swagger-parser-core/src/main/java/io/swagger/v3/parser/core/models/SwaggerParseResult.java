package io.swagger.v3.parser.core.models;

import io.swagger.v3.oas.models.OpenAPI;
import java.util.List;

public class SwaggerParseResult 
{
    private List<String> messages = null;
    private OpenAPI openAPI;

    public SwaggerParseResult messages(List<String> messages) 
    {
        this.messages = messages;
        return this;
    }

    // Getter and Setter for Messages
    public List<String> getMessages() {
        return messages;
    }

    public void setMessages(List<String> messages) {
        this.messages = messages;
    }

    // Getter and Setter for OpenAPI
    public OpenAPI getOpenAPI() 
    {
        return openAPI;
    }

    public void setOpenAPI(OpenAPI openAPI) 
    {
        this.openAPI = openAPI;
    }
}
