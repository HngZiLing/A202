class Movie extends Video
{
    private String  director;     // name of the director
    private String  rating;       // U, SG, SX

    // constructor
    public Movie( String ttl, int lngth, String dir, String rtng )
    {
        super( ttl, lngth );            //use the super class's constructor
        director = dir;  rating = rtng;
    }

    public Movie( String ttl, String dir, String rtng )
    {
        String title = ttl;
        director = dir;  rating = rtng;     // initialize members unique to Movie
    }

    public void show()
    {
        super.show();
        System.out.println(director + ", " + rating);
    }
}