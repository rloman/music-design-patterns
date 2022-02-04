package nl.music.abstractfactory.userinterface;

import nl.music.abstractfactory.userinterface.general.Button;
import nl.music.abstractfactory.userinterface.general.Frame;
import nl.music.abstractfactory.userinterface.general.Window;

// TODO Work in progress
public class WindowsComponentFactory implements  ComponentFactory {
    @Override
    public Frame getFrame() {
        return null;
    }

    @Override
    public Window getWindow() {
        return null;
    }

    @Override
    public Button getButton() {
        return null;
    }
}
