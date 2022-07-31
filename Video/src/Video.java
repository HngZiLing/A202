class Video
{
    private String  title;    // name of the item
    private int     length;   // number of minutes
    private boolean avail;    // is the video in the store?

    // constructor
    public Video( String ttl )
    {
        title = ttl; length = 90; avail = true;
    }

    // constructor
    public Video( String ttl, int lngth )
    {
        title = ttl; length = lngth; avail = true;
    }

    public Video()
    {
        String ttl = null;
        this.title = ttl;
        length = 90;
    }

    public void show()
    {
        System.out.println(title + ", " + length + " min. available:" + avail );
    }
}