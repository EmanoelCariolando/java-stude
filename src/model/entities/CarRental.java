package model.entities;

import java.time.LocalDateTime;

public class CarRental {
    private LocalDateTime start;
    private LocalDateTime finish;

    private Veihicle veihicle;
    private Invoice invoice;

    public CarRental(Veihicle veihicle, LocalDateTime start, LocalDateTime finish) {
        this.finish = finish;
        this.start = start;
        this.veihicle = veihicle;
    }

    public LocalDateTime getFinish() {
        return finish;
    }

    public void setFinish(LocalDateTime finish) {
        this.finish = finish;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    public LocalDateTime getStart() {
        return start;
    }

    public void setStart(LocalDateTime start) {
        this.start = start;
    }

    public Veihicle getVeihicle() {
        return veihicle;
    }

    public void setVeihicle(Veihicle veihicle) {
        this.veihicle = veihicle;
    }
}
