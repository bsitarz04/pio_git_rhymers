package edu.kis.vh.nursery;

/**
 * Klasa reprezentująca wyliczankę opartą na zasadach wież Hanoi.
 * Odrzuca liczby większe od aktualnie znajdujących się na szczycie.
 */
public class HanoiRhymer extends DefaultCountingOutRhymer {

    private int totalRejected = 0;

    /**
     * Zwraca całkowitą liczbę odrzuconych prób dodania elementu.
     * * @return liczba odrzuconych elementów
     */
    public int reportRejected() {
        return totalRejected;
    }

    /**
     * Dodaje nowy element do wyliczanki, o ile spełnia on zasady wież Hanoi.
     * Jeśli podana liczba jest większa niż aktualny element na szczycie,
     * zostaje odrzucona i licznik odrzuceń wzrasta.
     * * @param in wartość do dodania do wyliczanki
     */
    @Override
    public void countIn(final int in) {
        if (!callCheck() && in > peek())
            totalRejected++;
        else
            super.countIn(in);
    }
}