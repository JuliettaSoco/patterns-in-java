package com.apascualco.pattern.builder;

import com.apascualco.pattern.builder.constructor.Director;
import com.apascualco.pattern.builder.constructor.NoteBookBuilder;
import com.apascualco.pattern.builder.domain.NoteBook;
import com.apascualco.pattern.builder.domain.Type;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NoteBookTest {

    @Test
    public void desktop_construct_pc_design() {
        final NoteBookBuilder noteBookBuilder= new NoteBookBuilder();

        Director.constructPCDesign(noteBookBuilder);
        final NoteBook design = noteBookBuilder.build();
        assertEquals(design.getType(), Type.PRO);
        assertEquals(design.getProcessor(), "i7-7700K 4.2GHZ");
        assertEquals(design.getRam(), 128);
    }

    @Test
    public void desktop_construct_pc_gaming() {
        final NoteBookBuilder noteBookBuilder= new NoteBookBuilder();

        Director.constructPCDesign(noteBookBuilder);
        final NoteBook gaming = noteBookBuilder.build();
        assertEquals(gaming.getType(), Type.GAMING);
        assertEquals(gaming.getProcessor(), "i7-7700K 4.2GHZ");
        assertEquals(gaming.getRam(), 64);
    }

    @Test
    public void desktop_construct_pc_mobility() {
        final NoteBookBuilder noteBookBuilder= new NoteBookBuilder();

        Director.constructPCDesign(noteBookBuilder);
        final NoteBook mobility = noteBookBuilder.build();
        assertEquals(mobility.getType(), Type.PRO);
        assertEquals(mobility.getProcessor(), "i5-7500");
        assertEquals(mobility.getRam(), 32);
    }

    @Test
    public void desktop_construct_pc_travel() {
        final NoteBookBuilder noteBookBuilder= new NoteBookBuilder();

        Director.constructPCDesign(noteBookBuilder);
        final NoteBook travel = noteBookBuilder.build();
        assertEquals(travel.getType(), Type.HOME);
        assertEquals(travel.getProcessor(), "i5-7500");
        assertEquals(travel.getRam(), 18);
    }

}
