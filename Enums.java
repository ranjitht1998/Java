enum FavouritePlaces {
    CHENNAI(1200),DELHI(1800),MUMBAI(28);

    private int distance;

    private FavouritePlaces(int dist){
        this.distance = dist;
    }
}

public class Enums {
    public static void main(String[] args) {
        FavouritePlaces fav = FavouritePlaces.CHENNAI;
        System.out.println(fav);
    }   
}