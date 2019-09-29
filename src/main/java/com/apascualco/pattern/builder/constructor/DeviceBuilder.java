package com.apascualco.pattern.builder.constructor;

import com.apascualco.pattern.builder.domain.GraphicCard;
import com.apascualco.pattern.builder.domain.MotherBoard;
import com.apascualco.pattern.builder.domain.Type;

public interface DeviceBuilder {

    DeviceBuilder type(Type type);
    DeviceBuilder processor(String processor);
    DeviceBuilder ram(int ram);
    DeviceBuilder graphicCard(GraphicCard graphicCard);
    DeviceBuilder motherBoard(MotherBoard motherBoard);

}
