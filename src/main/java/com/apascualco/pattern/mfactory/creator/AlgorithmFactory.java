package com.apascualco.pattern.mfactory.creator;

import com.apascualco.pattern.mfactory.domain.Algorithm;
import com.apascualco.pattern.mfactory.domain.SHA256;
import com.apascualco.pattern.mfactory.domain.SHA384;
import com.apascualco.pattern.mfactory.domain.SHA512;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class AlgorithmFactory {

    private static Map<String, Algorithm> algorithms = new HashMap<>();

    public AlgorithmFactory() {
        algorithms.put("SHA256", new SHA256());
        algorithms.put("SHA384", new SHA384());
        algorithms.put("SHA512", new SHA512());
    }

    public Algorithm getInstance(final String algorithm) {
        return Optional.ofNullable(algorithms.get(algorithm))
                .orElseThrow(() -> new IllegalArgumentException("Algorithm don't implemented"));

    }

}
