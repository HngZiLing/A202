public class BetaEx extends Exception {
    public void bb() throws BetaEx {
        throw new BetaEx();
    }
}
class TetaEx extends BetaEx {
    public void tt() throws TetaEx {
        throw new TetaEx();
    }
}

class GammaEx extends TetaEx {
    public void gg() throws GammaEx {
        throw new GammaEx();
    }
}

class DeltaEx extends TetaEx {
    public void dd() throws DeltaEx {
        throw new DeltaEx();
    }
}
