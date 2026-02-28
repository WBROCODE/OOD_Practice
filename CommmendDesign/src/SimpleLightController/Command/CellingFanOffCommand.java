package SimpleLightController.Command;

import SimpleLightController.Objects.CellingFan;

public class CellingFanOffCommand implements Command{
    CellingFan cellingFan;
    int prevSpeed;
    String name;
    public CellingFanOffCommand(CellingFan cellingFan){
        this.cellingFan = cellingFan;
        this.name = "Celling Fan Off Command";
    }

    @Override
    public void excute() {
        prevSpeed = cellingFan.getSpeed();
        cellingFan.off();
    }

    @Override
    public void undo() {
        if(prevSpeed == CellingFan.MEDIUM){
            cellingFan.medium();
        }else if(prevSpeed == CellingFan.HIGH){
            cellingFan.high();
        }else if(prevSpeed == CellingFan.LOW){
            cellingFan.low();
        }else if(prevSpeed == CellingFan.OFF){
            cellingFan.off();
        }
    }
    @Override
    public String getName(){
        return name;
    }
}
