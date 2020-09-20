package za.co.dinoko.assignment.ayeshaMatwadia.service;

import za.co.dinoko.assignment.ayeshaMatwadia.entities.Vertex;

import java.util.List;

public interface DijkstraAlgorithm {

    public void computePath(Vertex sourceVertex);

    public List<Vertex> getShortestPath(Vertex targetVertex);

}