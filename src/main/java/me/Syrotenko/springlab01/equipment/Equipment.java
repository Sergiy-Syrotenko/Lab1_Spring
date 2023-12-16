package me.Syrotenko.springlab01.equipment;

import me.Syrotenko.springlab01.Pocket;

public abstract class Equipment {
    private Pocket pocket;
    public Equipment() {
    }

    public Equipment(Pocket pocket) {
        this.pocket = pocket;
    }
    public Pocket getPocket() {
        return pocket;
    }
    public void setPocket(Pocket pocket) {
        this.pocket = pocket;
    }
}
