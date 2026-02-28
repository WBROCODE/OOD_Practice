import SimpleLightController.Command.*;
import SimpleLightController.Controllers.Controller;
import SimpleLightController.Objects.*;


void main() {
    Light light = new Light("Living Room");
    Stereo stereo = new Stereo("Living Room");
    CellingFan cellingFan = new CellingFan("Living Room");

    LightOnCommand lightOnCommand = new LightOnCommand(light);
    StereoOnCommand stereoOnCommand = new StereoOnCommand(stereo);
    LightOffCommand lightOffCommand = new LightOffCommand(light);
    StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);

    CellingFanLowCommand cellingFanLowCommand = new CellingFanLowCommand(cellingFan);
    CellingFanOffCommand cellingFanOffCommand = new CellingFanOffCommand(cellingFan);

    Command[] commandOn = new Command[]{lightOnCommand, stereoOnCommand, cellingFanLowCommand};
    Command[] commandOff = new Command[]{lightOffCommand, stereoOffCommand, cellingFanOffCommand};

    MacroCommand mcOn = new MacroCommand(commandOn);
    MacroCommand mcOff = new MacroCommand(commandOff);

    Controller controller = new Controller();
    controller.setCommand(mcOn, mcOff, 0);

    controller.printPortal();
    System.out.println("-----------------------------");
    controller.executeCommandOn(0);
    System.out.println("-----------------------------");
    controller.executeCommandOff(0);


}
