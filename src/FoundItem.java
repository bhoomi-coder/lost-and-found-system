public class FoundItem extends Item{

    public FoundItem(int itemId, String itemName,
                         String description, String color, String category,int userId, String location){
            super( itemId,  itemName,
                    description,  color,  category, userId, location);

        }
        public FoundItem(String itemName,
                         String description, String color, String category,int userId, String location){
            super( itemName,
                    description,  color,  category, userId, location);
        }

        @Override
        public String getType() {
            return "FOUND_ITEM";
        }

        @Override
        public void getDescription() {
            System.out.println(itemId + "||" + itemName +"||" +
                    description + "||" + color + "||" +category +"||"+location);
        }
    }


