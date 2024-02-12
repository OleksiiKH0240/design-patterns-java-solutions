import java.util.ArrayList;
import java.util.List;

public abstract class Shop {
    private List<Furniture> furnitures = new ArrayList<>();
    protected String material = "Wood";
    protected String color = "Crimson";
    protected int nailNumber = 100;
//
//    void addFurniture(Furniture furniture){
//        furnitures.add(furniture);
//    }

    void useFurnitures(){
        for (Furniture furniture : furnitures) {
            furniture.use();
        }

    }

    abstract protected Furniture createFurniture();

    void buildFurniture(/*Furniture.Type type*/){
//        if (type == Furniture.Type.CHAIR){
//            furnitures.add(new Chair(material, color, nailNumber));
//        }else if (type == Furniture.Type.CABINET){
//            furnitures.add(new Cabinet(material, color, nailNumber));
//        }else {
//            furnitures.add(new Table(material, color, nailNumber));
//        }
        furnitures.add(createFurniture());
    }

}
