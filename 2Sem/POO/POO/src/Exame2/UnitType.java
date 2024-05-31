package Exame2;

public enum UnitType {
    WAREHOUSE, GARAGE, LOCKER;

    public static UnitType parse(String string) {
        switch (string) {
            case "WAREHOUSE":
                return WAREHOUSE;
            case "GARAGE":
                return GARAGE;
            case "LOCKER":
                return LOCKER;
            default:
                return null;
        }
    }
    
}
