package com.apascualco.pattern.afactory.facoria;

import com.apascualco.pattern.afactory.dominio.Monitor;
import com.apascualco.pattern.afactory.dominio.Resolution;
import com.apascualco.pattern.afactory.dominio.Type;

public interface AbstractMonitor {

    Monitor create5k(final boolean curve, final Type screenType);
    Monitor create4k(final boolean curve, final Type screenType);
    Monitor createHD(final boolean curve, final Type screenType);
    Monitor createDefault(final boolean curve, final Type screenType, final Resolution resolution);

}
