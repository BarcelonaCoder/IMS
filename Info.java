public enum Info
{   

    PRICE_MEASUREMENT("Philippine pesos", "PHP"),

    WEIGHT_MEASUREMENT("Kilograms", "kg"),

    LENGTH_MEMASUREMENT("Inches", "in"),

    HEIGHT_MEASUREMENT("Inches", "in"),

    WIDTH_MEASUREMENT("Inches", "in"),

    QUANTITY_MEASUREMENT("Units", "");
    
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
