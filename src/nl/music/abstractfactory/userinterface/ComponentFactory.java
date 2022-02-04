package nl.music.abstractfactory.userinterface;

import nl.music.abstractfactory.userinterface.general.Button;
import nl.music.abstractfactory.userinterface.general.Frame;
import nl.music.abstractfactory.userinterface.general.Window;

public interface ComponentFactory {

    Frame getFrame();
    Window getWindow();
    Button getButton();
}
