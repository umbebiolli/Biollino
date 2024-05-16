public class MagazzinoSmartphone {
    private Smartphone[] smartphones;
    private int count;

    // Costruttore Default
    public MagazzinoSmartphone() {
        smartphones = new Smartphone[10]; // Assuming initial capacity of 10
        count = 0;
    }

    // Costruttore Master
    public MagazzinoSmartphone(MagazzinoSmartphone other) {
        smartphones = new Smartphone[10];
        for (int i = 0; i < smartphones.length; i++) {
            if (other.smartphones[i] != null) {
                smartphones[i] = new Smartphone(other.smartphones[i]);
                count++;
            }
        }
    }

    // Metodo aggiungi Smartphone
    public void addSmartphone(Smartphone smartphone) {
        // smartphones = new Smartphone[10];
        if (smartphones[count] == null) {
                smartphones[count] = new Smartphone(smartphone.getBrand(), smartphone.getModel(), smartphone.getStorageCapacity(), smartphone.getPrice());
                count++;
        }
    }

    // Metodo rimuovi Smartphone
    public void removeSmartphone(Smartphone smartphone) {
        // smartphones = new Smartphone[10];
        for (int i = 0; i < smartphones.length; i++) {
            if (smartphones[i] != null) {
                if (smartphones[i].equals(smartphone)) {
                    smartphones[i] = null;
                    count--;
                }
            }
        }
    }

    // Metodo che restituisce l'array di Smartphone
    public Smartphone[] getSmartphonesArray() {
        Smartphone[] smartphoneArray = new Smartphone[count];
        System.arraycopy(smartphones, 0, smartphoneArray, 0, count);
        return smartphoneArray;
    }

    // Metodo che ricerca uno Smartphone per Brand
    public Smartphone getSmartphoneByBrand(String brand) {
        Smartphone smartphone = null;
        int i = 0;
        boolean r = false;
        while (r == false && i <= smartphones.length) {
            if (smartphones[i] != null) {
                if (smartphones[i].getBrand().equals(brand)) {
                    smartphone = smartphones[i];
                    r = true;
                }
            }
            i++;
        }
        return smartphone;
    }

    // Metodo che restituisce uno Smartphone per capacità di memoria
    public MagazzinoSmartphone getSmartphonesByStorageCapacity(int storageCapacity) {
        MagazzinoSmartphone magazzinoSmartphone = new MagazzinoSmartphone();
        int i = 0;
        boolean r = false;
        while (r == false && i <= smartphones.length) {
            if (smartphones[i] != null) {
                if (smartphones[i].getStorageCapacity() == storageCapacity) {
                    magazzinoSmartphone.addSmartphone(smartphones[i]);
                    r = true;
                }
            }
            i++;
        }
        return magazzinoSmartphone;
    }

    // Metodo che restituisce uno Smartphone per range di prezzo
    public MagazzinoSmartphone getSmartphonesByPriceRange(double minPrice, double maxPrice) {
        MagazzinoSmartphone magazzinoSmartphone = new MagazzinoSmartphone();
        for (int i = 0; i < smartphones.length; i++) {
            if (smartphones[i] != null) {
                if (smartphones[i].getPrice() > minPrice && smartphones[i].getPrice() < maxPrice) {
                    magazzinoSmartphone.addSmartphone(smartphones[i]);
                }
            }
        }
        return magazzinoSmartphone;
    }

    // Metodo tostring
    @Override
    public String toString() {
        String result = "\nMagazzinoSmartphone:\n";
        for (int i = 0; i < smartphones.length; i++) {
            if (smartphones[i] != null) {
                result += "Brand: " + smartphones[i].getBrand()+  ", Model: " + smartphones[i].getModel()
                          + ", Storage Capacity: " + smartphones[i].getStorageCapacity() +"GB, Price: "
                          + smartphones[i].getPrice() + "\n";
            }
        }
        return result;
    }

    // Metodo che restituisce il contatore degli Smartphone presenti nel'array
    public int getCount() {
        return count;
    }

    // Metodo equals
    public boolean equals(Object obj) {
        boolean r = false;
        if (this == obj) {
            r = true;
        } else if (obj instanceof MagazzinoSmartphone) {
            MagazzinoSmartphone magazzinoSmartphone = (MagazzinoSmartphone) obj;
            for (int i = 0; i < smartphones.length; i++) {
                if (smartphones[i] != null) {
                    if (this.smartphones[i].getBrand().equals(magazzinoSmartphone.smartphones[i].getBrand())
                    && this.smartphones[i].getModel().equals(magazzinoSmartphone.smartphones[i].getModel())
                    && this.smartphones[i].getStorageCapacity() == magazzinoSmartphone.smartphones[i].getStorageCapacity()
                    && this.smartphones[i].getPrice() == magazzinoSmartphone.smartphones[i].getPrice()) {
                        r = true;
                }
                }
            }
        }
        return r;
    }

}