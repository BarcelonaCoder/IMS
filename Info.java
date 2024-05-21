public enum Info
{   

    PRICE_MEASUREMENT("norwegian kroner", "NOK"),

    WEIGHT_MEASUREMENT("kilograms", "kg"),

    LENGTH_MEMASUREMENT("inches", "in"),

    HEIGHT_MEASUREMENT("inches", "in"),

    WIDTH_MEASUREMENT("inches", "in"),

    QUANTITY_MEASUREMENT("units", "");
    
    private final String expandedMeasurements;
    private final String abbreviatedMeasurements;
    
    private Measurements(String expandedMeasurements, String abbreviatedMeasurements)
    {
        this.expandedMeasurements = expandedMeasurements;
        this.abbreviatedMeasurements = abbreviatedMeasurements;
    }
    
    public String getExpandedMeasurements()
    {
        return this.expandedMeasurements;
    }
    
    public String getAbbreviatedMeasurements()
    {
        return this.abbreviatedMeasurements;
    }
}
