package histology;


import ij.ImagePlus;
import ij.gui.Roi;
import ij.plugin.frame.RoiManager;

import java.awt.*;
import java.util.Arrays;

public class BufferedImage extends ImagePlus {
    private RoiManager manager;
    private Roi[] roisBackup;
    private boolean isReduced;
    public BufferedImage(String text, Image image, RoiManager manager, boolean isReduced) {
        super(text, image);
        this.manager = manager;
        this.isReduced = isReduced;
    }

    public RoiManager getManager() {
        return this.manager;
    }

    public void restoreRois() {
        Arrays.stream(this.roisBackup).forEach(roi -> manager.add(this, roi, 0));
    }

    public void backupRois() {
        this.roisBackup = this.manager.getRoisAsArray();
    }

    public boolean isReduced() {
        return isReduced;
    }
}