public class App {

    public static void main(String[] args) throws Exception {
        while (true) {
            char userInput = Input.inputChar("Press S to Start calculating and X to Close: ");
            if (userInput == 'X' || userInput == 'x') {
                break;
            } else {
                float result = 0;
                char userCalc = Input.inputChar("V: Volume\nM: Mass\nD: Density\nPlease insert a Command");
                if (userCalc == 'V' || userCalc == 'v') {
                    int density = Input.inputInt("Please insert the Density: ");
                    int mass = Input.inputInt("Please insert the Mass: ");
                    result = densityClass.toVolume(density, mass);
                } else if (userCalc == 'M' || userCalc == 'm') {
                    int density = Input.inputInt("Please insert the density: ");
                    int volume = Input.inputInt("Please insert the Volume: ");
                    result = densityClass.toMass(density, volume);
                } else {
                    int volume = Input.inputInt("Please insert the Volume: ");
                    int mass = Input.inputInt("Please insert the Mass: ");
                    result = densityClass.toDensity(mass, volume);
                }
                System.out.println(result);
            }
        }
    }
}
