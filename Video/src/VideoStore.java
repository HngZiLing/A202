public class VideoStore
{
    public static void main ( String args[] )
    {
        Video item1 = new Video("Microcosmos", 90 );
        Movie item2 = new Movie("Jaws", 120, "Spielberg", "PG" );
        Movie item3 = new Movie("Star War", "Action", "GOOD");
        item1.show();
        item2.show();
        item3.show();
    }
}