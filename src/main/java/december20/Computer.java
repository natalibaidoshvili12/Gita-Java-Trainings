package december20;

public class Computer {

    private String country;
    private String model;
    private Double price;
    private Boolean warranty;

    public static class Monitor {
        private Double diagonal;
        private Double resolution;
        private Double hertz;

        public Monitor() {
        }

        public Monitor(Double diagonal, Double resolution, Double hertz) {
            this.diagonal = diagonal;
            this.resolution = resolution;
            this.hertz = hertz;
        }

        public Double getDiagonal() {
            return diagonal;
        }

        public void setDiagonal(Double diagonal) {
            this.diagonal = diagonal;
        }

        public Double getResolution() {
            return resolution;
        }

        public void setResolution(Double resolution) {
            this.resolution = resolution;
        }

        public Double getHertz() {
            return hertz;
        }

        public void setHertz(Double hertz) {
            this.hertz = hertz;
        }

        @Override
        public String toString() {
            return "Monitor{" +
                    "diagonal=" + diagonal +
                    ", resolution=" + resolution +
                    ", hertz=" + hertz +
                    '}';
        }
    }

    public static class Motherboard {
        private Integer slotNumber;
        private String memoryType;
        private Double hertz;

        public Motherboard() {
        }

        public Motherboard(Integer slotNumber, String memoryType, Double hertz) {
            this.slotNumber = slotNumber;
            this.memoryType = memoryType;
            this.hertz = hertz;
        }

        public Integer getSlotNumber() {
            return slotNumber;
        }

        public void setSlotNumber(Integer slotNumber) {
            this.slotNumber = slotNumber;
        }

        public String getMemoryType() {
            return memoryType;
        }

        public void setMemoryType(String memoryType) {
            this.memoryType = memoryType;
        }

        public Double getHertz() {
            return hertz;
        }

        public void setHertz(Double hertz) {
            this.hertz = hertz;
        }

        @Override
        public String toString() {
            return "Motherboard{" +
                    "slotNumber=" + slotNumber +
                    ", memoryType='" + memoryType + '\'' +
                    ", hertz=" + hertz +
                    '}';
        }
    }

    public Computer() {
    }

    public Computer(String country, String model, Double price, Boolean warranty) {
        this.country = country;
        this.model = model;
        this.price = price;
        this.warranty = warranty;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Boolean getWarranty() {
        return warranty;
    }

    public void setWarranty(Boolean warranty) {
        this.warranty = warranty;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "country='" + country + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", warranty=" + warranty +
                '}';
    }
}
