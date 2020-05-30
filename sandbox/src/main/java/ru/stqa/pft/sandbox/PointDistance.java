package ru.stqa.pft.sandbox;

public class PointDistance {

  public static void main(String[] args) {
    //rasschet rastojanija mezhdu dvumja tochkami

    //vyvod koordinat tochki na ekran - chto-to iz interneta
    Point point = new Point(3, 4);
    System.out.println("Vyvod na ekran koordinaty: " + point.toString());

    //tut dajom znachenija nashim tochkam - kak budto by "sozdajom" tochki p1 i p2 - berjom konkretnie dve tochki iz vse vozmozhnyh tochek
    Point p1 = new Point(6, 5);
    Point p2 = new Point(9, 9);


    //mozhno delatj tak
    //objavili, chto rezuljtat u nas tipa double, opisali, chemu budet raven rezuljtat i napechatali
    //no eto ne funkcija
    double distanceVariantOdin;
    distanceVariantOdin = Math.sqrt(Math.pow((p2.x - p1.x), 2) + Math.pow((p2.y - p1.y), 2));
    System.out.println("Rasstojanie " + distanceVariantOdin);


    //mozhno poljzovatsa metodom
    //eto proverka rezuljatat vyzova metoda iz klassa Point
    System.out.println("Rasstojanie mezhdu tochkami " + "(" + p1.x + "," + p1.y + ") i (" + p2.x + "," + p2.y + ") = " + p2.distance(p1));


    //mozhno i opisatj funkciju otdejno s void, no ona prosto budet formuloj bez vypolenija (sm nizhe opredelenie funkcii).
    // vyzyvatj funkciju dolzhny v funkcii main(), gde zadajom parametry, chtoby poluchitj k nem dostup
    distanceVariantDva(p1, p2);


    //tak kak vozvraschaemyj rezuljtat poschitan, to mozhem prosto ukazatj, chto hotim dedlatj s etim rezuljtatom,
    // vyzvav dlja etogo funkciju i parametry, kotorie zadajutsa v funkcii main()
    System.out.println("Rasstojanie kak rezuljtat raboty funkcii distanceVariantTri: "+distanceVariantTri(p1, p2));

  }

  //opredelenie funkcii - esli void - to funkcija ne vozvraschaet nikakogo znachenija, a my prosto opisyvaem ejo
  //i sejchas govorim, chto hotim pechatatj rezuljtat vychislenija pri izvestnyh parametrah
  //i dlja togo, chtoby vyvesti na ekran znachenie funkcii, my dolzhy ejo vyzvatj
  public static void distanceVariantDva(Point p1, Point p2) {
    System.out.println("Rasstojanie opredeljaemoe funkciej distanceVariantDva " + Math.sqrt(Math.pow((p2.x - p1.x), 2) + Math.pow((p2.y - p1.y), 2)));

  }

  //opredelenie funkcii - esli double (ili kakoj-to drugoj tip, no ne void) - to Java zhdjot vozvraschenija kakogo-to rezuljtata - return objazatelen
  //i tut my uzhe opisyvaem, kakoj rezuljtat dolzhen bytj vozvraschen
  public static double distanceVariantTri(Point p1, Point p2) {
    return Math.sqrt(Math.pow((p2.x - p1.x), 2) + Math.pow((p2.y - p1.y), 2));

  }

}
