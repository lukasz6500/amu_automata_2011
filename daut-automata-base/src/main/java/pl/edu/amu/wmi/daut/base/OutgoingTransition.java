package pl.edu.amu.wmi.daut.base;

/**
 * Klasa reprezentująca przejście wychodzące, tzn. etykietę przejścia plus
 * stan docelowy.
 *
 * Stan źródłowy nie jest tu uwzględniany.
 */
class OutgoingTransition {
    public OutgoingTransition(TransitionLabel transitionLabel, State targetState) {
        targetState_ = targetState;
        transitionLabel_ = transitionLabel;
    }

    public State getTargetState() {
        return targetState_;
    }

    public TransitionLabel getTransitionLabel() {
        return transitionLabel_;
    }

    private State targetState_;
    private TransitionLabel transitionLabel_;
}
