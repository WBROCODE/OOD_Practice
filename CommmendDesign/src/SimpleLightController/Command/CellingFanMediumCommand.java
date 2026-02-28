package SimpleLightController.Command;

import SimpleLightController.Objects.CellingFan;

public class CellingFanMediumCommand implements Command{
    CellingFan cellingFan;
    int prevSpeed;
    String name;
    public CellingFanMediumCommand(CellingFan cellingFan){
        this.cellingFan = cellingFan;
        this.name = "Celling Fan Meduim Command";
    }

    @Override
    public void excute() {
        prevSpeed = cellingFan.getSpeed();
        cellingFan.medium();
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
