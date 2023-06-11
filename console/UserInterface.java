package console;

import config.SupportMethods;

public class UserInterface {

    SupportMethods sm = new SupportMethods();

    public void run() {
        int cmd = -1;

        while (!(cmd == 0)) {

            ConsoleView.showMainMenu();
            cmd = sm.chooseNumber();

            //     action

        }
    }
}


