package com.apascualco.pattern.mfactory.creator;

import com.apascualco.pattern.mfactory.domain.Algorithm;

public interface AlgorithmFactory {
    Algorithm getInstance(final String algorithm);
}
