package za.co.dinoko.assignment.ayeshaMatwadia.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.co.dinoko.assignment.ayeshaMatwadia.model.ShortestPathRequest;
import za.co.dinoko.assignment.ayeshaMatwadia.model.Vertex;
import za.co.dinoko.assignment.ayeshaMatwadia.service.ShortestPathService;
import java.util.List;

@RestController
public class ShortestPathAPI {

    private ShortestPathService shortestPathService;

    @Autowired
    public ShortestPathAPI(ShortestPathService shortestPathService) {
        this.shortestPathService = shortestPathService;
    }

    @PostMapping(value = "/shortestPath")
    public String getShortestPath(@RequestBody ShortestPathRequest request) {
           List<Vertex> s = shortestPathService.getShortestPath(request.getStartPlanet(), request.getDestinationPlanet());
           return s.toString();
    }
}
