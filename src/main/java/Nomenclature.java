public class Nomenclature {


    public int id;
    public String name;
    public String Description;
    public int price;

    public Nomenclature(int id, int price, String description, String name) {
        this.id = id;
        this.price = price;
        Description = description;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId() {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (this.name.isEmpty()){
        this.name = name;}
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


}
