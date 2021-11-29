import gmbh.kdb.hsw.gdp.domain.GameDevStudio;

public class SubMenu implements Command {

    @Override
    public Command execute(GameDevStudio studio) {
        System.out.println(
                """
                        -----------------
                        Sub Menu
                                            
                                           
                        1   Eventlog
                        2   office overview
                        3   Developers
                        4   Main menu
                        0   Quit
                        -----------------
                        """
        );

        var input = Input.nextLine();

        switch (input) {
            case "0", "Quit", "quit", "QUIT":
                return new QuitGame();
            case "1", "Eventlog", "EVENTLOG", "eventlog":
                return new EventLog();
            case "2", "office overview", "Office Overview", "Office overview", "office Overview", "OFFICE OVERVIEW":
                System.out.println("Office is shown");
                return new PrintOffices();
            case "3", "Developers", "developers", "DEVELOPERS":
                System.out.println("Developers are shown");
                return new PrintDevelopers();
            case "4", "Main Menu", "main menu", "Main menu", "main Menu", "MAIN MENU":
                return new DisplayMainMenu();
        }

        return this;
    }
}