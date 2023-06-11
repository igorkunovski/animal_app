package console;

import collection.AnimalsCollection;
import config.SupportMethods;

public class UserInterface {

    SupportMethods sm = new SupportMethods();
//    AnimalsCollection col = new AnimalsCollection();

    public void run(AnimalsCollection col) {
        int cmd = -1;

        while (!(cmd == 0)) {

            ConsoleView.showMainMenu();
            cmd = sm.chooseNumber();

            System.out.println(cmd);
            switch (cmd){
                case 1 -> col.addAnimal(sm.animalCreation());
                case 2 -> col.showAnimals();
                case 3-> {
                    col.showAnimals();
                    int num = sm.chooseNumber();
                    col.showAnimalCommands(num);
                }
                case 4 -> {
                    col.showAnimals();
                    int num = sm.chooseNumber();
                    col.addNewCommand(num);
                }
                case 5-> {
                    col.showAnimals();
                    int num = sm.chooseNumber();
                    col.removeAnimal(num);
                }

            }
        }
    }
}


