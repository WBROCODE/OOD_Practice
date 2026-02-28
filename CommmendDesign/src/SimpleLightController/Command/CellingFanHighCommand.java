package SimpleLightController.Command;

import SimpleLightController.Objects.CellingFan;

public class CellingFanHighCommand implements Command{
    CellingFan cellingFan;
    int prevSpeed;
    String name;
    public CellingFanHighCommand(CellingFan cellingFan){
        this.cellingFan = cellingFan;
        this.name = "Celling Fan High Command";
    }

    @Override
    public void excute() {
        prevSpeed = cellingFan.getSpeed();
        cellingFan.high();
    }

    @Override
    public void undo() {
        if(prevSpeed == CellingFan.HIGH){
            cellingFan.high();
        }else if(prevSpeed == CellingFan.MEDIUM){
            cellingFan.medium();
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
