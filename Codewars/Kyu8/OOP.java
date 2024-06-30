
public class OOP {
    private final double draft;
    private final int crew;

    public OOP(double draft, int crew) {
        this.draft = draft;
        this.crew = crew;
    }

    public boolean isWorthIt() {
        return (draft - 1.5*crew)  > 20;
    }
}