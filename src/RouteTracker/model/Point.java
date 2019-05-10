package RouteTracker.model;

import java.util.*;
import RouteTracker.model.*;

public class Point implements PointNode
{
    private Map<String,Double> coords;

    public Point(double latitude, double longitude, double altitude)
    {
        coords = new LinkedHashMap<>();
        coords.put("Latitude", new Double(latitude));
        coords.put("Longitude", new Double(longitude));
        coords.put("Altitude", new Double(altitude));
    }

    @Override
    public String getName()
    {
        return "";
    }

    @Override
    public String getDescription()
    {
        return "";
    }

    @Override
    public PointNode getStartNode()
    {
        return this;
    }

    @Override
    public PointNode getEndNode()
    {
        return this;
    }

    @Override
    public Point getStartPoint()
    {
        return this;
    }

    @Override
    public Point getEndPoint()
    {
        return this;
    }

    public String toString()
    {
        return coords.get("Latitude") + ", " +
               coords.get("Longitude") + ", " +
               coords.get("Altitude");
    }
}
