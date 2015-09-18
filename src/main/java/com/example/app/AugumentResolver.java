package com.example.app;

import java.io.InputStream;

public interface AugumentResolver {
    Augument resolve(InputStream stream);
}
