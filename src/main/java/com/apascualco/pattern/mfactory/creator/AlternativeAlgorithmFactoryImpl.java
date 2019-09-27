package com.apascualco.pattern.mfactory.creator;

public class AlternativeAlgorithmFactoryImpl extends AlternativeAlgorithmFactory {

    @Override
    public String encode(final String plainText, final String algorithm) {
        return getInstance(algorithm).encode(plainText);
    }
}
