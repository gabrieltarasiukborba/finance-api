package server.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.json.JSONObject;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "Initial")
@RestController
@RequestMapping(path = "/initial", produces = MediaType.APPLICATION_JSON_VALUE)
public class InitialController {

    @ApiOperation("Hello")
    @GetMapping
    public ResponseEntity<String> hello() {
        //teste
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("message","Hello World");
        return ResponseEntity.ok(jsonObject.toString());
    }


}
