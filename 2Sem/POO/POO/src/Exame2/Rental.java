package Exame2;

import java.time.LocalDate;

public class Rental {

    StorageUnit storageUnit;
    LocalDate startDate;
    LocalDate endDate;

    Rental(StorageUnit storageUnit, LocalDate startDate, LocalDate endDate) {
        this.storageUnit = storageUnit;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public StorageUnit getStorageUnit() {
        return storageUnit;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setStorageUnit(StorageUnit storageUnit) {
        this.storageUnit = storageUnit;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(LocalDate endDate) {
        if (endDate.isAfter(startDate)) {
            this.endDate = endDate;
        }
    }

    

    

    
}
