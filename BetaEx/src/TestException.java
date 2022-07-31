public class TestException
{
    public static void main(String[] args)
    {
        try {
            TetaEx t = new TetaEx();
            t.tt();
        } catch (DeltaEx dx) {
            System.out.println("Caught DeltaEx");
        } catch (GammaEx gx) {
            System.out.println("Caught GammaEx");
        } catch (BetaEx bx) {
            System.out.println("Caught BetaEx");
        }
    }
}
