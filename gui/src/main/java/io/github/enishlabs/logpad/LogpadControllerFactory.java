package io.github.enishlabs.logpad;

import javafx.util.Callback;

public class LogpadControllerFactory implements Callback<Class<?>, Object>
{
    @Override
    public Object call(Class<?> param)
    {
        return new Controller();
    }
}

