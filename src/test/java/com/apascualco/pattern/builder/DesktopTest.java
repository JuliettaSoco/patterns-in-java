package com.apascualco.pattern.builder;

import com.apascualco.pattern.builder.constructor.DesktopBuilder;
import com.apascualco.pattern.builder.constructor.Director;
import com.apascualco.pattern.builder.domain.Desktop;
import com.apascualco.pattern.builder.domain.Type;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DesktopTest {

    @Test
    public void desktop_construct_pc_design() {

        final DesktopBuilder desktopBuilder = new DesktopBuilder();
        Director.constructPCDesign(desktopBuilder);

        final Desktop design = desktopBuilder.build();
        assertEquals(design.getType(), Type.PRO);
        assertEquals(design.getProcessor(), "i7-7700K 4.2GHZ");
        assertEquals(design.getRam(), 128);
    }

    @Test
    public void desktop_construct_pc_gaming() {
        final DesktopBuilder desktopBuilder = new DesktopBuilder();

        Director.constructPCGaming(desktopBuilder);
        final Desktop gaming = desktopBuilder.build();
        assertEquals(gaming.getType(), Type.GAMING);
        assertEquals(gaming.getProcessor(), "i7-7700K 4.2GHZ");
        assertEquals(gaming.getRam(), 64);
    }

    @Test
    public void desktop_construct_pc_mobility() {
        final DesktopBuilder desktopBuilder = new DesktopBuilder();

        Director.constructPCMobility(desktopBuilder);
        final Desktop mobility = desktopBuilder.build();
        assertEquals(mobility.getType(), Type.PRO);
        assertEquals(mobility.getProcessor(), "i5-7500");
        assertEquals(mobility.getRam(), 32);
    }

    @Test
    public void desktop_construct_pc_travel() {
        final DesktopBuilder desktopBuilder = new DesktopBuilder();

        Director.constructPCTravel(desktopBuilder);
        final Desktop travel = desktopBuilder.build();
        assertEquals(travel.getType(), Type.HOME);
        assertEquals(travel.getProcessor(), "i5-7500");
        assertEquals(travel.getRam(), 18);
    }

}
