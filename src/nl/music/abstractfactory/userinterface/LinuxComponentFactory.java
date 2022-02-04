package nl.music.abstractfactory.userinterface;

import nl.music.abstractfactory.userinterface.general.Button;
import nl.music.abstractfactory.userinterface.general.Frame;
import nl.music.abstractfactory.userinterface.general.Window;
import nl.music.abstractfactory.userinterface.linux.LinuxButton;
import nl.music.abstractfactory.userinterface.linux.LinuxFrame;
import nl.music.abstractfactory.userinterface.linux.LinuxWindow;

public class LinuxComponentFactory implements ComponentFactory {

    @Override
    public Frame getFrame() {
        return new LinuxFrame();
    }

    @Override
    public Window getWindow() {
        return new LinuxWindow();
    }

    @Override
    public Button getButton() {
        return new LinuxButton();
    }
}
