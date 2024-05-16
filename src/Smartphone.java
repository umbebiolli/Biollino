public class Smartphone {
    private String brand;
    private String model;
    private int storageCapacity;
    private double price;

    // Costruttore Default
    public Smartphone(){

    }

    // Costruttore Master
    public Smartphone(String brand, String model, int storageCapacity, double price) {
        this.brand = brand;
        this.model = model;
        this.storageCapacity = storageCapacity;
        this.price = price;
    }

    // Costruttore di copia
    public Smartphone(Smartphone other) {
        this.brand = other.brand;
        this.model = other.model;
        this.storageCapacity = other.storageCapacity;
        this.price = other.price;
    }

    // Metodo Set Brand
    public void setBrand(String brand) {
        this.brand = brand;
    }

    // Metodo Set Model
    public void setModel(String model) {
        this.model = model;
    }

    // Metodo Set StorageCapacity
    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    // Metodo Set Price
    public void setPrice(double price) {
        this.price = price;
    }

    // Metodo Get Brand
    public String getBrand() {
        return brand;
    }
    
    // Metodo Get Model
    public String getModel() {
        return model;
    }

    // Metodo Get StorageCapacity
    public int getStorageCapacity() {
        return storageCapacity;
    }

    // Metodo Get Price
    public double getPrice() {
        return price;
    }

    // Metodo tostring
    @Override
    public String toString() {
        return "Brand: " + brand + ", " + "Model: " + model + ", " + "Storage Capacity: " + storageCapacity + "GB, " 
        + "Price: " + price + "\n";
    }

    // Metodo equals
    @Override
    public boolean equals(Object obj) {
        boolean r = false;
        if (this == obj) {
            r = true;
        } else if (obj instanceof Smartphone) {
            Smartphone smartphone = (Smartphone) obj;
            if (this.getBrand().equals(smartphone.getBrand()) 
                && this.getModel().equals(smartphone.getModel()) 
                && this.getStorageCapacity() == smartphone.getStorageCapacity() 
                && this.getPrice() == smartphone.getPrice() ) {
                    r = true;
            }
        }
        return r;
    }
    
}
