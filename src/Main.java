public class Main {
    private static Notepad notepad = new Notepad();

    public static void main(String[] args) {
        System.out.println("To see information type 'info + enter'");
        boolean running = true;
        while (running) {
            var cmd = Input.askString("Enter command");
            switch (cmd) {
                case "create":
                    createRecord();
                    break;
                case "info":
                    showInfo();
                case "list":
                    listRecords();
                    break;
                case "exit":
                    running = false;
                    break;
                default:
                    System.out.println("Unknown command");
            }
        }
        System.out.println("Good bye!");
    }

    private static void createRecord() {
        var strType = Input.askString("Type");
        var type = RecordType.valueOf(strType);
        notepad.createRecord(type);
    }

    private static void showInfo() {
        System.out.println("All commands: \n list - views a list of all records \n create - makes a new record in the list \n --flightduration - creates record FlightDuration \n info - calls information menu \n exit - terminates the program");
    }

    private static void listRecords() {
        notepad.listRecords();
    }
}
